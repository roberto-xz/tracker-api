package com.rdtech.tracker_api.dto.driver;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class DriverUpdateRequestDto {
    private Long driverId;
    private String driverFullName;
    private String driverDateOfBirth;

    
    public String getDriverFullName() {return driverFullName;}
    public void setDriverFullName(String driverFullName) {this.driverFullName = driverFullName;}
    public String getDriverDateOfBirth() {return driverDateOfBirth;}
    public void setDriverDateOfBirth(String driverDateOfBirth) {this.driverDateOfBirth = driverDateOfBirth;}
    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
}
