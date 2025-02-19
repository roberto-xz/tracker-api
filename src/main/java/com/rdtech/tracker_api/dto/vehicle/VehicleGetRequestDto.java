
package com.rdtech.tracker_api.dto.vehicle;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class VehicleGetRequestDto {
    private Long vehicleId;
    private String vehiclePlate;
    
    public Long getVehicleId() {return vehicleId;}
    public void setVehicleId(Long vehicleId) {this.vehicleId = vehicleId;}
    public String getVehiclePlate() {return vehiclePlate;}
    public void setVehiclePlate(String vehiclePlate) {this.vehiclePlate = vehiclePlate;}
}
