
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerUpdateRequestDto {
    private Long containerID;    
    private Integer maxPackages;
    private String  stateDestine;
    private String  cityDestine;
    private String  dateEndTransport;

    public Integer getMaxPackages() {return maxPackages;}
    public void setMaxPackages(Integer maxPackages) {this.maxPackages = maxPackages;}
    public String getStateDestine() {return stateDestine;}
    public void setStateDestine(String stateDestine) {this.stateDestine = stateDestine;}
    public String getCityDestine() {return cityDestine;}
    public void setCityDestine(String cityDestine) {this.cityDestine = cityDestine;}
    public String getDateEndTransport() {return dateEndTransport;}
    public void setDateEndTransport(String dateEndTransport) {this.dateEndTransport = dateEndTransport;}
    public Long getContainerID() {return containerID;}
    public void setContainerID(Long containerID) {this.containerID = containerID;}
}
