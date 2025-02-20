package com.rdtech.tracker_api.dto.driver;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 */

public class DriverCreatedResponseDto {
    private Long driverId;
    private Integer statusCode;

    public DriverCreatedResponseDto() {}
    public DriverCreatedResponseDto(Long driverId, Integer statusCode) {
        this.driverId = driverId;
        this.statusCode = statusCode;
    }

    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
    public Integer getStatusCode() {return statusCode;}
    public void setStatusCode(Integer statusCode) {this.statusCode = statusCode;}
}
