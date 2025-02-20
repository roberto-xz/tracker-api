package com.rdtech.tracker_api.dto.driver;

/**
 *
 * @date 17/02/2025
 * @author Juci-x
 *
 **/

public class DriverGetRequestDto {
    private Long driverId;
    private String driverFullName;

    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
    public String getDriverFullName() {return driverFullName;}
    public void setDriverFullName(String driverFullName) {this.driverFullName = driverFullName;}
}
