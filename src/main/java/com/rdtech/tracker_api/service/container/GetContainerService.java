package com.rdtech.tracker_api.service.container;

import com.rdtech.tracker_api.dto.container.ContainerGetResponseDto;
import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Optional;

@Service
public class GetContainerService {
    private final ContainerRepository containerRepository;

    @Autowired
    public GetContainerService(ContainerRepository rep) {
        this.containerRepository = rep;
    }

    public ContainerGetResponseDto run (Long containerId) {
        Optional<ContainerEntity> container = containerRepository.findById(containerId);
        ContainerGetResponseDto resp = new ContainerGetResponseDto();

        if (container.isPresent()) {
            resp.setContainerId(containerId);
            resp.setVehilceId(container.get().getVehicleId());
            resp.setStateDestine(container.get().getStateDestine());
            resp.setCityDestine(container.get().getCityDestine());
            resp.setDateStartTransport(container.get().getDateStartTransport());
            resp.setDateEndTransport(container.get().getDateEndTransport());
            resp.setMaxPackages(container.get().getMaxPackages());
            resp.setNumPackages(container.get().getNumPackages());
            //resp.setHistoric(); // não foi add
            return resp;
        }else{
            resp.setContainerId(-1L);
            return resp;
        }
    }
}
