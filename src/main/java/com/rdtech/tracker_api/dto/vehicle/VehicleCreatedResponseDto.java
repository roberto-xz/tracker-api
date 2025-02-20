
package com.rdtech.tracker_api.dto.vehicle;
/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class VehicleCreatedResponseDto {
    private Long vehicleId;
    private Integer statusCode;
    
    
    public VehicleCreatedResponseDto() {
    }

    public VehicleCreatedResponseDto(Long vehicleId, Integer statusCode) {
        this.vehicleId = vehicleId;
        this.statusCode = statusCode;
    }

    public Long getVehicleId() {return vehicleId;}
    public void setVehicleId(Long vehicleId) {this.vehicleId = vehicleId;}
    public Integer getStatusCode() {return statusCode;}
    public void setStatusCode(Integer statusCode) {this.statusCode = statusCode;}
}
