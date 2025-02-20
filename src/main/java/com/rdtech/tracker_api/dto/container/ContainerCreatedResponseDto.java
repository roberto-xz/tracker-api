
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerCreatedResponseDto {
    private Long containerID;
    private Long statusID;

    public ContainerCreatedResponseDto() {
    }
    
    public ContainerCreatedResponseDto(Long containerID, Long statusID) {
        this.containerID = containerID;
        this.statusID = statusID;
    }
    public Long getContainerID() { return containerID;}
    public void setContainerID(Long containerID) { this.containerID = containerID;}
    public Long getStatusID() {return statusID;}
    public void setStatusID(Long statusID) {this.statusID = statusID;}
}
