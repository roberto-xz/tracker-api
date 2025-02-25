
package com.rdtech.tracker_api.service.Packages;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.event.packages.PackageChangeContainerEvent;
import com.rdtech.tracker_api.repository.ContainerRepository;
import com.rdtech.tracker_api.repository.PackageRepository;


@Service
public class ChangePackageContainerService {
    private final PackageRepository    packageRepo;
    private final ContainerRepository  containerRepo;
    private final ApplicationEventPublisher event;
    
    @Autowired
    public ChangePackageContainerService(
        PackageRepository packageRepo, 
        ContainerRepository containerRepo,
        ApplicationEventPublisher e
    ){
        this.packageRepo = packageRepo;
        this.containerRepo = containerRepo;
        this.event = e;
    }

    public Object run(Long packageId, Long containerId) {
        
        if (!this.packageRepo.existsById(packageId)){
            Map<String,Object> response = Map.of("message", "Pacote não encontrado","StatusCode", 404);
            return response;
        }
        if (!this.containerRepo.existsById(containerId)){
            Map<String,Object> response = Map.of("message", "Container não encontrado","StatusCode", 404);
            return response;
        }

        ContainerEntity container = this.containerRepo.findById(containerId).get();
        PackageEntity    packager = this.packageRepo.findById(packageId).get();

        if (!container.getStateDestine().equals(packager.getStateDestine())) {
            Map<String,Object> response = Map.of("message", "Erro, O pacote e o container tem como destiono final locais diferentes","StatusCode", 99);
            return response;
        }

        if (container.getNumPackages() == container.getMaxPackages()) {
            Map<String,Object> response = Map.of("message", "O container escolhida não tem mais capacidade para novos pacotes","StatusCode", 100);
            return response;
        }

        packager.setContainerId(containerId);
        packager.setStatusId(container.getStatusID());
        this.packageRepo.save(packager);
        
        this.event.publishEvent(new PackageChangeContainerEvent(this, containerId, packageId));
        Map<String,Object> response = Map.of("message", "O pacote foi adicionado ao container com sucesso","StatusCode", 200);
        return response;
    } 

}
