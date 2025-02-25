
package com.rdtech.tracker_api.event.vehicle;
import org.springframework.context.ApplicationEvent;

public class VehicleReportedProblemEvent  extends ApplicationEvent {
    private Long vehicleId;

    public VehicleReportedProblemEvent(Object source, Long vehicleId) {
        super(source);
        this.vehicleId = vehicleId;
    }

    public Long getVehicleId() {return vehicleId;}
}
