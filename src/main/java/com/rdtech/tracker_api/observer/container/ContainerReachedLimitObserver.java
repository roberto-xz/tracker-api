
package com.rdtech.tracker_api.observer.container;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.Driver;
import com.rdtech.tracker_api.entity.HistoricOfContainerEntity;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.entity.VehicleEntity;
import com.rdtech.tracker_api.event.container.ContainerReachedLimitEvent;
import com.rdtech.tracker_api.repository.DriverRepository;
import com.rdtech.tracker_api.repository.HistoricOfContainerRepository;
import com.rdtech.tracker_api.repository.StatusRepository;
import com.rdtech.tracker_api.repository.VehicleRepository;

/**
 *****
 * @date 24/02/2025
 * @author roberto-xz
 *****
 */

@Component
public class ContainerReachedLimitObserver {

    private final VehicleRepository vehicle;
    private final DriverRepository  driver;
    private final StatusRepository  status;
    private final HistoricOfContainerRepository historic;

    @Autowired
    public ContainerReachedLimitObserver(
        VehicleRepository v, 
        DriverRepository d, 
        StatusRepository s,
        HistoricOfContainerRepository h
    ){
        this.vehicle = v;
        this.driver = d;
        this.status = s;
        this.historic = h;
    }

    @EventListener
    public void run(ContainerReachedLimitEvent event) {
        ContainerEntity container = event.getContainer();
        Integer numPackages = container.getNumPackages();
        Integer maxPackages = container.getMaxPackages();

        // o container esta vazio
        if ( numPackages != maxPackages ) {return;}

        // o container já esta vinculado a um veículo
        if (container.getVehicleId() != -1L) {return;}
        
        Long driverId = this.searchDriver();
        Long vehiclId = this.searchVehicle(driverId);

        if (driverId == -1L ) {
            String statusText = "Aguardando Motorista";
            if (this.status.existsByStatusText(statusText)) {
                container.setStatusID(this.status.getByStatusText(statusText).getStatusID());
            }else{
                Status status = new Status(statusText);
                Status tempStatus = this.status.save(status);
                container.setStatusID(tempStatus.getStatusID());
            }
        } 
        else if (vehiclId == -1L ) {
            String statusText = "Aguardando Veículo";
            if (this.status.existsByStatusText(statusText)) {
                container.setStatusID(this.status.getByStatusText(statusText).getStatusID());
            }else{
                Status status = new Status(statusText);
                Status tempStatus = this.status.save(status);
                container.setStatusID(tempStatus.getStatusID());
            }
        }

        if (vehiclId != -1L && driverId != -1L) {
            String statusText = "Aguardando autorização para viagem";
            if (this.status.existsByStatusText(statusText)) {
                container.setStatusID(this.status.getByStatusText(statusText).getStatusID());
            }else{
                Status status = new Status(statusText);
                Status tempStatus = this.status.save(status);
                container.setStatusID(tempStatus.getStatusID());
            }


        }
        
        HistoricOfContainerEntity historic = new HistoricOfContainerEntity();

        historic.setCityChanged("Internal company");
        historic.setStateChanged("Internal company");
        historic.setDataLeave("00-00-00 00:00 PM");
        historic.setDateArrived("00-00-00 00:00 PM");
        historic.setDataVehicleChanged("00-00-00 00:00 PM");
        historic.setChangedOfVehicles(1);
        historic.setVehicleId(vehiclId);
        historic.setContainerId(container.getContainerId());
        this.historic.save(historic);
    }

    private Long searchVehicle(Long driverId) {
        Optional<VehicleEntity>  vehicle = this.vehicle.findFirstByIsAvailableTrue();
        
        if (vehicle.isPresent()) {
            VehicleEntity vTemp = vehicle.get();

            // verifica s há um motorista para esse veículo
            if (vTemp.getDriverId() == -1L) {
                vTemp.setDriverId(driverId);
            }

            // "diz" que esse veículo está sendo usado
            vTemp.setIsAvailable(false);
            this.vehicle.save(vTemp);
            return vTemp.getVehicleId();
        }
        return -1L;
    }
      
    private Long searchDriver(){
        Optional<Driver> driver = this.driver.findFirstByIsAvailableTrue();

        if (driver.isPresent()) {
            Driver dTemp = driver.get();
            dTemp.setIsAvailable(false);
            this.driver.save(dTemp);
            return dTemp.getDriverId();
        }
        return -1L;
    }
}
