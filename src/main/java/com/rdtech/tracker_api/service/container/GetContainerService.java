package com.rdtech.tracker_api.service.container;

import com.rdtech.tracker_api.dto.container.ContainerGetResponseDto;
import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.repository.ContainerRepository;
import com.rdtech.tracker_api.repository.StatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GetContainerService {
    private final ContainerRepository containerRepository;
    private final StatusRepository status;

    @Autowired
    public GetContainerService(ContainerRepository rep, StatusRepository sst) {
        this.containerRepository = rep;
        this.status = sst;
    }

    public ContainerGetResponseDto run (Long containerId) {
        Optional<ContainerEntity> container = containerRepository.findById(containerId);

        if (container.isPresent()) {
            ContainerGetResponseDto resp = new ContainerGetResponseDto();
            
            // pega o status do container
            if (container.get().getStatusID() != -1L) {
                Optional<Status> status = this.status.findById(container.get().getStatusID());
                resp.setStatus(status.get().getStatusText());
            }
            
            resp.setContainerId(containerId);
            resp.setVehilceId(container.get().getVehicleId());
            resp.setStateDestine(container.get().getStateDestine());
            resp.setCityDestine(container.get().getCityDestine());
            resp.setDateStartTransport(container.get().getDateStartTransport());
            resp.setDateEndTransport(container.get().getDateEndTransport());
            resp.setMaxPackages(container.get().getMaxPackages());
            resp.setNumPackages(container.get().getNumPackages());
            return resp;
            
        }else { return null;}
    }
}
