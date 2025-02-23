
package com.rdtech.tracker_api.observer.packages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.HistoricOfPackageEntity;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.entity.Status;
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

    @Autowired // Injeção de dependencias via construtor
    public AfterCreatedPackageObserver(
        PackageRepository p, 
        ContainerRepository c,
        StatusRepository s,
        HistoricOfPackageRepository h    
    ) {
        this.packageRepository = p;
        this.containerRepository = c;
        this.statusRepository = s;
        this.historicOfPackageRepository = h;
    }

    @EventListener
    public void run(PackageCreatedEvent event) {
        this.packageEntity = event.getPackage();
        
        if (this.setExistentContainer()) {
            this.createHistoric();
            return;
        }

        this.createNewContainer();
        this.createHistoric();
        return;
    }
    
    // Se já existe um container que vai para o mesmo 
    // local do pacote.
    private boolean setExistentContainer() {
        this.containerEntity = this.containerRepository.getByStateDestine(this.packageEntity.getStateDestine());
        
        if (this.containerEntity != null) {
            Status status = new Status("Aguardando Transporte");
            Status statusCreated = statusRepository.save(status);

            this.packageEntity.setContainerId(this.containerEntity.getContainerId());
            this.packageEntity.setStatusId(statusCreated.getStatusID());
            this.packageEntity.setTrackerCode(new CreateTrackerCode.Builder().build().generate());
            this.packageRepository.save(this.packageEntity);
            return true;
        }
        return false;
    }

    // cria um novo container para o pacote
    private void createNewContainer() {
        this.containerEntity = new ContainerEntity();
        this.containerEntity.setVehicleId(-1L); // o veículo ainda não existe
        this.containerEntity.setCityDestine(this.packageEntity.getCityDestine());
        this.containerEntity.setStateDestine(this.packageEntity.getCityDestine());
        this.containerEntity.setDateStartTransport("00-00-00 00:00 PM");
        this.containerEntity.setDateEndTransport("00-00-00 00:00 PM");
        this.containerEntity.setMaxPackages(120);
        this.containerEntity.setNumPackages(1);

        // criando status
        Status statusContainer = new Status("Aguardando Pacotes");
        Status statusPackage   = new Status("Aguardando Transporte");
        
        // atribuindo os status
        this.packageEntity.setStatusId(this.statusRepository.save(statusPackage).getStatusID());
        this.containerEntity.setStatusID(this.statusRepository.save(statusContainer).getStatusID());


        // salvando o novo container
        ContainerEntity newContainer = this.containerRepository.save(this.containerEntity);
         
        // atribuido relações é código de rastreio
         this.packageEntity.setContainerId(newContainer.getContainerId());
         this.packageEntity.setTrackerCode(new CreateTrackerCode.Builder().build().generate());

        this.packageRepository.save(this.packageEntity);
    }
    
    // criar o historico de mudaças de container
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
