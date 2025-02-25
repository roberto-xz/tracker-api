
package com.rdtech.tracker_api.observer.packages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.HistoricOfPackageEntity;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.event.container.ContainerReachedLimitEvent;
import com.rdtech.tracker_api.event.packages.PackageCreatedEvent;
import com.rdtech.tracker_api.repository.ContainerRepository;
import com.rdtech.tracker_api.repository.HistoricOfPackageRepository;
import com.rdtech.tracker_api.repository.PackageRepository;
import com.rdtech.tracker_api.repository.StatusRepository;
import com.rdtech.tracker_api.util.CreateTrackerCode;

/**
 *****
 * @date 23/02/2025
 * @author roberto-xz
 *****
 */

@Component
public class AfterCreatedPackageObserver {
    private PackageEntity           packageEntity;
    private ContainerEntity         containerEntity;
    private HistoricOfPackageEntity packageHistoric;

    private final PackageRepository    packageRepository;
    private final ContainerRepository  containerRepository;
    private final StatusRepository     statusRepository;
    private final HistoricOfPackageRepository historicOfPackageRepository;
    private final ApplicationEventPublisher event;

    private final String packageStatus  = "Aguardando Transporte";
    private final String containeStatus = "Aguardando Pacotes";

    @Autowired // Injeção de dependencias via construtor
    public AfterCreatedPackageObserver(
        PackageRepository p, 
        ContainerRepository c,
        StatusRepository s,
        HistoricOfPackageRepository h,
        ApplicationEventPublisher e    
    ) {
        this.packageRepository = p;
        this.containerRepository = c;
        this.statusRepository = s;
        this.historicOfPackageRepository = h;
        this.event = e;
    }

    @EventListener
    public void run(PackageCreatedEvent event) {
        this.packageEntity = event.getPackage();
        
        // verifica se há um container, caso não , cria um novo
        if (!this.setExistentContainer()) this.createNewContainer();
         
        // atualiza o status do pacote
        if ( !this.statusRepository.existsByStatusText(this.packageStatus)) {
            Status status = new Status(this.packageStatus);
            Status statusCreated = statusRepository.save(status); 
            this.packageEntity.setStatusId(statusCreated.getStatusID());

        }else {
            Status tempStatus = this.statusRepository.getByStatusText(this.packageStatus);
            this.packageEntity.setStatusId(tempStatus.getStatusID());
        }
        
        // atualiza o status do container
        if ( !this.statusRepository.existsByStatusText(this.containeStatus)) {
            Status status = new Status(this.containeStatus);
            
            Status statusCreated = statusRepository.save(status);
            this.containerEntity.setStatusID(statusCreated.getStatusID());
        }else {
            Status tempStatus = this.statusRepository.getByStatusText(this.containeStatus);
            this.containerEntity.setStatusID(tempStatus.getStatusID());
        }

        this.packageRepository.save(this.packageEntity);
        this.containerRepository.save(this.containerEntity);
        this.createHistoric();

        // dispara um evento para verificar se o container
        // atingiou seu limite 
        this.event.publishEvent(new ContainerReachedLimitEvent(this, this.containerEntity));
    }
    
    
    private boolean setExistentContainer() {
        //this.containerEntity = this.containerRepository.getByStateDestine(this.packageEntity.getStateDestine());
        String destine = this.packageEntity.getStateDestine();
        List<ContainerEntity> containersFind = this.containerRepository.getByStateDestine(destine);
        
        if (containersFind.isEmpty()) {return false;}

       this.containerEntity = containersFind.get(0);
        
        if (this.containerEntity != null) {   
            this.packageEntity.setContainerId(this.containerEntity.getContainerId());
            this.packageEntity.setTrackerCode(new CreateTrackerCode.Builder().build().generate());

            // atualiza o número de pacotes no container
            Integer numPackages = this.containerEntity.getNumPackages();
            this.containerEntity.setNumPackages(numPackages+1);
            return true;
        }
        return false;
    }

    private void createNewContainer() {
        this.containerEntity = new ContainerEntity();
        this.containerEntity.setVehicleId(-1L); // o veículo ainda não existe
        this.containerEntity.setCityDestine(this.packageEntity.getCityDestine());
        this.containerEntity.setStateDestine(this.packageEntity.getCityDestine());
        this.containerEntity.setStatusID(-1L);
        this.containerEntity.setDateStartTransport("00-00-00 00:00 PM");
        this.containerEntity.setDateEndTransport("00-00-00 00:00 PM");
        this.containerEntity.setMaxPackages(5); // limite máximo de pacotes
        this.containerEntity.setNumPackages(1);

        // precisa salvar para obter ID, e atribuir ao pacote
        ContainerEntity newContainer = this.containerRepository.save(this.containerEntity);
         
        this.packageEntity.setContainerId(newContainer.getContainerId());
        this.packageEntity.setTrackerCode(new CreateTrackerCode.Builder().build().generate());
    }
    
    private void createHistoric() {
        this.packageHistoric = new HistoricOfPackageEntity();
        this.packageHistoric.setPackageId(this.packageEntity.getPackageId());
        this.packageHistoric.setContainerId(this.containerEntity.getContainerId());
        this.packageHistoric.setCityChanged("Company City");
        this.packageHistoric.setStateChanged("Company State");
        this.packageHistoric.setDataChanged("00-00-00 00:00 PM");
        this.historicOfPackageRepository.save(this.packageHistoric);
    }
}
