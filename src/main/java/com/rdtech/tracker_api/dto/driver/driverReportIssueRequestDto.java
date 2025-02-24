
package com.rdtech.tracker_api.dto.driver;
/**
 *****
 * @date 24/02/2025
 * @author roberto-xz
 *****
 */

public class driverReportIssueRequestDto {
    private Long vehicleId;
    private Long driverId;
    private Integer vehicleProblemLevel;

    public Long getVehicleId() {return vehicleId;}
    public void setVehicleId(Long vehicleId) {this.vehicleId = vehicleId;}
    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
    public Integer getVehicleProblemLevel() {return vehicleProblemLevel;}
    public void setVehicleProblemLevel(Integer vehicleProblemLevel) {this.vehicleProblemLevel = vehicleProblemLevel;}
}
