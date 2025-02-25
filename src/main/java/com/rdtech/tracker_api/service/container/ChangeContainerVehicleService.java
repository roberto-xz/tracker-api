
package com.rdtech.tracker_api.service.container;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.entity.VehicleEntity;
import com.rdtech.tracker_api.event.container.ContainerChangedVehicleEvent;
import com.rdtech.tracker_api.repository.ContainerRepository;
import com.rdtech.tracker_api.repository.StatusRepository;
import com.rdtech.tracker_api.repository.VehicleRepository;

@Service
public class ChangeContainerVehicleService {
    private final ContainerRepository container;
    private final VehicleRepository   vehicle;
    private final StatusRepository    status;
    private final ApplicationEventPublisher event;
    
    @Autowired
    public ChangeContainerVehicleService(
        ContainerRepository container, 
        VehicleRepository vehicle,
        StatusRepository status,
        ApplicationEventPublisher e
    ) {
        this.container = container;
        this.vehicle = vehicle;
        this.status = status;
        this.event = e;
    }

    public Object run(Long containerId, Long vehicleId) {
        Optional<ContainerEntity> container = this.container.findById(containerId);
        Optional<VehicleEntity>    vehicle  = this.vehicle.findById(vehicleId);

        if (!container.isPresent()){
            Map<String,Object> response = Map.of("message", "Container não encontrado","StatusCode", 404);
            return response;
        }

        if (!vehicle.isPresent()){
            Map<String,Object> response = Map.of("message", "Veículo não encontrado","StatusCode", 404);
            return response;
        }

        if (vehicle.isPresent() && !vehicle.get().getIsAvailable()){
            Map<String,Object> response = Map.of("message", "Esse veículo já está sendo usado","StatusCode", 404);
            return response;
        }

        if (this.status.existsByStatusText("Esperando Transport")){
            Long status = this.status.getByStatusText("Esperando Transport").getStatusID();
            container.get().setStatusID(status);
        }else {
            Status status = new Status("Esperando Transport");
            Long newStatus = this.status.save(status).getStatusID();
            container.get().setStatusID(newStatus);
        }
        
        container.get().setVehicleId(vehicleId);
        this.container.save(container.get());
        
        this.event.publishEvent(new ContainerChangedVehicleEvent(this, containerId, vehicleId));
        Map<String,Object> response = Map.of("message", "O veículo do container foi atualizado com sucesso", "StatusCode",200);
        return response;
    }
 
}
