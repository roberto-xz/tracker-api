package com.rdtech.tracker_api.dto.packages;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class PackageUpdateRequestDto {
    private String stateDestine;
    private String cityDestine;
    private String neighborhood;
    private String streetAddress;
    private String homeNumber;
    private Long containerId;
    private Long statusId;
    private Long packageId;

    

    public String getStateDestine() {return stateDestine;}
    public void setStateDestine(String stateDestine) {this.stateDestine = stateDestine;}
    public String getCityDestine() {return cityDestine;}
    public void setCityDestine(String cityDestine) {this.cityDestine = cityDestine;}
    public String getNeighborhood() {return neighborhood;}
    public void setNeighborhood(String neighborhood) {this.neighborhood = neighborhood;}
    public String getStreetAddress() {return streetAddress;}
    public void setStreetAddress(String streetAddress) {this.streetAddress = streetAddress;}
    public String getHomeNumber() {return homeNumber;}
    public void setHomeNumber(String homeNumber) {this.homeNumber = homeNumber;}
    public Long getContainerId() {return containerId;}
    public void setContainerId(Long containerId) {this.containerId = containerId;}
    public Long getStatusId() {return statusId;}
    public void setStatusId(Long statusId) {this.statusId = statusId;}

    public Long getPackageId() {return packageId;}
    public void setPackageId(Long packageId) {this.packageId = packageId;}
}
