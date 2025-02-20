package com.rdtech.tracker_api.dto.driver;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 */

public class DriverCreatedResponseDto {
    private Long driverId;
    private String driverRegisterCode;

    public DriverCreatedResponseDto() {}
    public DriverCreatedResponseDto(Long driverId, String driverRegisterCode) {
        this.driverId = driverId;
        this.driverRegisterCode = driverRegisterCode;
    }

    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
    public String getDriverRegisterCode() {return driverRegisterCode;}
    public void setDriverRegisterCode(String driverRegisterCode) {this.driverRegisterCode = driverRegisterCode;}
}
