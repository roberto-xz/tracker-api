package com.rdtech.tracker_api.service.container;

import com.rdtech.tracker_api.dto.container.ContainerDeletedResponseDto;
import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteContainerService {
    private final ContainerRepository containerRepository;

    @Autowired
    public DeleteContainerService(ContainerRepository rep) {
        this.containerRepository = rep;
    }

    public ContainerDeletedResponseDto run(Long containerId) {
        Optional<ContainerEntity> container = containerRepository.findById(containerId);
        ContainerDeletedResponseDto resp = new ContainerDeletedResponseDto();

        if (container.isPresent()) {
            containerRepository.deleteById(containerId);
            resp.setMessage("O container foi excluído");
            resp.setStatusCode(200);
            return resp;
        } else {
            resp.setMessage("Container não encontrado");
            resp.setStatusCode(404);
            return resp;
        }
    }
}
