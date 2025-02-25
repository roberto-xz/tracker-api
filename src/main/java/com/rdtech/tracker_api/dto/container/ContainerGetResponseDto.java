
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerGetResponseDto {
    private Long containerId;
    private Long vehilceId;
    private String stateDestine;
    private String cityDestine;
    private String dateStartTransport;
    private String dateEndTransport;
    private Integer maxPackages;
    private Integer numPackages;
    private String status = "";

    public ContainerGetResponseDto() {
    }

    public ContainerGetResponseDto(
            Long containerId, 
            Long vehilceId, 
            String stateDestine, 
            String cityDestine,
            String dateStartTransport, 
            String dateEndTransport, 
            Integer maxPackages, 
            Integer numPackages
    ){
        this.containerId = containerId;
        this.vehilceId = vehilceId;
        this.stateDestine = stateDestine;
        this.cityDestine = cityDestine;
        this.dateStartTransport = dateStartTransport;
        this.dateEndTransport = dateEndTransport;
        this.maxPackages = maxPackages;
        this.numPackages = numPackages;
    }


    public Long getContainerId() {
        return containerId;
    }
    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }
    public Long getVehilceId() {
        return vehilceId;
    }
    public void setVehilceId(Long vehilceId) {
        this.vehilceId = vehilceId;
    }
    public String getStateDestine() {
        return stateDestine;
    }
    public void setStateDestine(String stateDestine) {
        this.stateDestine = stateDestine;
    }
    public String getCityDestine() {
        return cityDestine;
    }
    public void setCityDestine(String cityDestine) {
        this.cityDestine = cityDestine;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
