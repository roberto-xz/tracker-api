
package com.rdtech.tracker_api.dto.driver;

/**
 *****
 * @date 24/02/2015
 * @author roberto-xz
 *****
 */
public class SetDriverInVehicleRequestDto {
    private Long vehicleId;
    private Long driverId;
    
    public Long getVehicleId() {return vehicleId;}
    public void setVehicleId(Long vehicleId) {this.vehicleId = vehicleId;}
    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
}
