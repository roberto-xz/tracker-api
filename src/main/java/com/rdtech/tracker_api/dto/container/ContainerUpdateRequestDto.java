
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerUpdateRequestDto {
    private Long vehicleId;
    private String dateStartTransport;
    private String dateEndTransport;
    private Integer maxPackages;
    private Integer numPackages;
    private Long statusId;

    public Long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getDateStartTransport() {
        return dateStartTransport;
    }
    public void setDateStartTransport(String dateStartTransport) {
        this.dateStartTransport = dateStartTransport;
    }
    public String getDateEndTransport() {
        return dateEndTransport;
    }
    public void setDateEndTransport(String dateEndTransport) {
        this.dateEndTransport = dateEndTransport;
    }
    public Integer getMaxPackages() {
        return maxPackages;
    }
    public void setMaxPackages(Integer maxPackages) {
        this.maxPackages = maxPackages;
    }
    public Integer getNumPackages() {
        return numPackages;
    }
    public void setNumPackages(Integer numPackages) {
        this.numPackages = numPackages;
    }
    public Long getStatusId() {
        return statusId;
    }
    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    } 
}
