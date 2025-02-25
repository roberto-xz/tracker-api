
package com.rdtech.tracker_api.service.container;

import com.rdtech.tracker_api.dto.container.ContainerCreateRequestDto;
import com.rdtech.tracker_api.dto.container.ContainerCreatedResponseDto;
import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateContainerService {
    private final ContainerRepository containerRepository;

    @Autowired
    public CreateContainerService(ContainerRepository rep) {
        this.containerRepository = rep;
    }

    public ContainerCreatedResponseDto run (ContainerCreateRequestDto req){
        ContainerCreatedResponseDto resp = new ContainerCreatedResponseDto();
        ContainerEntity container = new ContainerEntity();

        container.setVehicleId(req.getVehicleId());
        container.setStateDestine(req.getStateDestine());
        container.setCityDestine(req.getCityDestine());
        container.setDateStartTransport(req.getDateStartTransport());
        container.setDateEndTransport(req.getDateEndTransport());
        container.setMaxPackages(req.getMaxPackages());

        if(containerRepository.existsById(req.getContainerId())){
            resp.setContainerID(-1L);
            resp.setStatusID(409L);
            return resp;
        }else{
            ContainerEntity createdContainer = containerRepository.save(container);
            resp.setContainerID(createdContainer.getContainerId());
            resp.setStatusID(200L);
            return resp;
        }

    }
}
