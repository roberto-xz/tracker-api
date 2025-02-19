
package com.rdtech.tracker_api.dto.vehicle;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class VehicleCreateRequestDto {
    private Long driverID;
    private String vehicleType;
    private String vehiclePlate;
    private Integer vehicleCapacity;
    private Boolean vehicleAsProblem;
    private Integer vehicleProblemLevel;
    
    public Long getDriverID() {
        return driverID;
    }
    public void setDriverID(Long driverID) {
        this.driverID = driverID;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getVehiclePlate() {
        return vehiclePlate;
    }
    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }
    public Integer getVehicleCapacity() {
        return vehicleCapacity;
    }
    public void setVehicleCapacity(Integer vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }
    public Boolean getVehicleAsProblem() {
        return vehicleAsProblem;
    }
    public void setVehicleAsProblem(Boolean vehicleAsProblem) {
        this.vehicleAsProblem = vehicleAsProblem;
    }
    public Integer getVehicleProblemLevel() {
        return vehicleProblemLevel;
    }
    public void setVehicleProblemLevel(Integer vehicleProblemLevel) {
        this.vehicleProblemLevel = vehicleProblemLevel;
    }

    
}
