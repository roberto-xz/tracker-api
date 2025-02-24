
package com.rdtech.tracker_api.dto.vehicle;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class VehicleUpdateRequestDto {
    private Long vehicleId;
    private Long driverID;
    private Boolean vehicleAsProblem;
    private Integer vehicleProblemLevel;


    public Long getVehicleId() {return vehicleId;}
    public void setVehicleId(Long vehicleId) {this.vehicleId = vehicleId;}
    public Long getDriverID() {return driverID;}
    public void setDriverID(Long driverID) {this.driverID = driverID;}
    public Boolean getVehicleAsProblem() {return vehicleAsProblem;}
    public void setVehicleAsProblem(Boolean vehicleAsProblem) { 
        this.vehicleAsProblem = vehicleAsProblem;
    }
    public Integer getVehicleProblemLevel() {return vehicleProblemLevel;}
    public void setVehicleProblemLevel(Integer vehicleProblemLevel) {
        this.vehicleProblemLevel = vehicleProblemLevel;
    }
}
