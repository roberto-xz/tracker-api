package com.rdtech.tracker_api.dto.packages;

import com.rdtech.tracker_api.dto.historics.HistoricOfPackageDto;

import java.util.List;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class PackageGetResponseDto {
    private Long packageId;
    private String trackerCode;
    private Long containerId;
    private String userUUID;
    private String stateOrigen;
    private String cityOrigen;
    private String stateDestine;
    private String cityDestine;
    private String neighborhood;
    private String streetAddress;
    private Integer homeNumber;
    private String description;
    private List<HistoricOfPackageDto> historic;

    public PackageGetResponseDto() {}
    public PackageGetResponseDto(
            Long packageId,
            String trackerCode,
            Long containerId,
            String userUUID,
            String stateOrigen,
            String cityOrigen,
            String stateDestine,
            String cityDestine,
            String neighborhood,
            String streetAddress,
            Integer homeNumber,
            String description,
            List<HistoricOfPackageDto> historic
    ) {
        this.packageId = packageId;
        this.trackerCode = trackerCode;
        this.containerId = containerId;
        this.userUUID = userUUID;
        this.stateOrigen = stateOrigen;
        this.cityOrigen = cityOrigen;
        this.stateDestine = stateDestine;
        this.cityDestine = cityDestine;
        this.neighborhood = neighborhood;
        this.streetAddress = streetAddress;
        this.homeNumber = homeNumber;
        this.description = description;
        this.historic = historic;
    }

    public Long getPackageId() {return packageId;}
    public void setPackageId(Long packageId) {this.packageId = packageId;}
    public String getTrackerCode() {return trackerCode;}
    public void setTrackerCode(String trackerCode) {this.trackerCode = trackerCode;}
    public Long getContainerId() {return containerId;}
    public void setContainerId(Long containerId) {this.containerId = containerId;}
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
    public List<HistoricOfPackageDto> getHistoric() {return historic;}
    public void setHistoric(List<HistoricOfPackageDto> historic) {this.historic = historic;}
}
