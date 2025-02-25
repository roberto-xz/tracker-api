package com.rdtech.tracker_api.service.container;

import com.rdtech.tracker_api.dto.container.ContainerUpdateRequestDto;
import com.rdtech.tracker_api.dto.container.ContainerUpdatedResponseDto;
import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateContainerService {
    private final ContainerRepository containerRepository;

    @Autowired
    public UpdateContainerService(ContainerRepository rep) {
        this.containerRepository = rep;
    }

    public ContainerUpdatedResponseDto run(ContainerUpdateRequestDto req){
        ContainerUpdatedResponseDto resp = new ContainerUpdatedResponseDto();

        Optional<ContainerEntity> containerExist = containerRepository.findById(req.getContainerID());

        if(containerExist.isPresent()){
            ContainerEntity container = containerExist.get();
            container.setMaxPackages(req.getMaxPackages());
            container.setStateDestine(req.getStateDestine());
            container.setCityDestine(req.getCityDestine());
            container.setDateEndTransport(req.getDateEndTransport());
            
            containerRepository.save(container);
            resp.setMessage("Os dados do container foram atualizados");
            resp.setStatusCode(200);
            return resp;
        }else {
            resp.setMessage("Container não encontrado");
            resp.setStatusCode(404);
            return resp;
        }
    }
}
