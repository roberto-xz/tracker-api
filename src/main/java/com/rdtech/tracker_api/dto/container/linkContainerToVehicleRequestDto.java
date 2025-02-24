
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 24/02/2025
 * @author roberto-xz
 *****
 */

public class linkContainerToVehicleRequestDto {
    private Long containerI;
    private Long vehicleI;
    
    public Long getContainerI() {return containerI;}
    public void setContainerI(Long containerI) {this.containerI = containerI;}
    public Long getVehicleI() {return vehicleI;}
    public void setVehicleI(Long vehicleI) {this.vehicleI = vehicleI;}
}
