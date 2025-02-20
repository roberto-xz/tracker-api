
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerGetRequestDto {
    private Long containerID;
    private Long vehicleId;
    
    public Long getContainerID() {return containerID;}
    public void setContainerID(Long containerID) {this.containerID = containerID;}
    public Long getVehicleId() {return vehicleId;}
    public void setVehicleId(Long vehicleId) {this.vehicleId = vehicleId;}
}
