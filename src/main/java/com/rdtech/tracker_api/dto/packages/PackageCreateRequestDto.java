package com.rdtech.tracker_api.dto.packages;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class PackageCreateRequestDto {
    private String userUUID;
    private String stateOrigen;
    private String cityOrigen;
    private String stateDestine;
    private String cityDestine;
    private String neighborhood;
    private String streetAddress;
    private Integer homeNumber;
    private String description;

    public String getUserUUID() {return userUUID;}
    public void setUserUUID(String userUUID) {this.userUUID = userUUID;}
    public String getStateOrigen() {return stateOrigen;}
    public void setStateOrigen(String stateOrigen) {this.stateOrigen = stateOrigen;}
    public String getCityOrigen() {return cityOrigen;}
    public void setCityOrigen(String cityOrigen) {this.cityOrigen = cityOrigen;}
    public String getStateDestine() {return stateDestine;}
    public void setStateDestine(String stateDestine) {this.stateDestine = stateDestine;}
    public String getCityDestine() {return cityDestine;}
    public void setCityDestine(String cityDestine) {this.cityDestine = cityDestine;}
    public String getNeighborhood() {return neighborhood;}
    public void setNeighborhood(String neighborhood) {this.neighborhood = neighborhood;}
    public String getStreetAddress() {return streetAddress;}
    public void setStreetAddress(String streetAddress) {this.streetAddress = streetAddress;}
    public Integer getHomeNumber() {return homeNumber;}
    public void setHomeNumber(Integer homeNumber) {this.homeNumber = homeNumber;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
}
