package com.rdtech.tracker_api.service.container;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.repository.ContainerRepository;
import com.rdtech.tracker_api.repository.StatusRepository;

@Service
public class ChangeContainerStatusService {
    private final ContainerRepository container;
    private final StatusRepository    status;
    
    @Autowired
    public ChangeContainerStatusService(ContainerRepository container, StatusRepository status) {
        this.container = container;
        this.status = status;
    }
    
    public Object run(Long containerId, String statusText) {
        Optional<ContainerEntity> container = this.container.findById(containerId);
        
        if (!container.isPresent()) return null;
        
        if (this.status.existsByStatusText(statusText)) {
            Status status = this.status.getByStatusText(statusText);
            container.get().setStatusID(status.getStatusID());
            this.container.save(container.get());
            return true;
        }
        Status status = new Status(statusText);
        Status nstatus = this.status.save(status);
        container.get().setStatusID(nstatus.getStatusID());
        this.container.save(container.get());
        return true;
    } 
}
