package com.rdtech.tracker_api.observer.vehicle;

import java.util.List;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.event.vehicle.VehicleReportedProblemEvent;
import com.rdtech.tracker_api.repository.ContainerRepository;
import com.rdtech.tracker_api.repository.PackageRepository;
import com.rdtech.tracker_api.repository.StatusRepository;

@Component
public class AfterReportedVehicleProblemObsever {
    private final ContainerRepository containers;
    private final PackageRepository   packages;
    private final StatusRepository      status;
    
    


    public AfterReportedVehicleProblemObsever(
        ContainerRepository containers, 
        PackageRepository packages,
        StatusRepository status
    ) {
        this.containers = containers;
        this.packages = packages;
        this.status = status;
    }

    @EventListener
    public void run(VehicleReportedProblemEvent event) {
        ContainerEntity container = this.containers.getByVehicleId(event.getVehicleId());
        List<PackageEntity> packages = this.packages.findAllByContainerId(container.getContainerId());

        if (!this.status.existsByStatusText("Pacote Avariado ou Roubado")){
            Status newStatus = new Status("Pacote Avariado ou Roubado");
            this.status.save(newStatus);
        }

        packages.forEach(pkg -> { 
            System.out.println("pacotes: encontados: "+pkg.getTrackerCode());
            pkg.setStatus("Pacote Avariado ou Roubado");
            this.packages.save(pkg);
        });
    }
}
