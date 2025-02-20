package com.rdtech.tracker_api.dto.packages;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class PackageTrackerResponseDto {
    private  String stateLastCheckin;
    private String cityLastCheckin;;
    private String stateDestine;
    private String cityDestine;
    private String dateArrived;
    private String dateLeave;
    private Integer estimatedTime2Nstop;

    public PackageTrackerResponseDto() {}
    public PackageTrackerResponseDto(
            String stateLastCheckin,
            String cityLastCheckin,
            String stateDestine,
            String cityDestine,
            String dateArrived,
            String dateLeave,
            Integer estimatedTime2Nstop
    ) {
        this.stateLastCheckin = stateLastCheckin;
        this.cityLastCheckin = cityLastCheckin;
        this.stateDestine = stateDestine;
        this.cityDestine = cityDestine;
        this.dateArrived = dateArrived;
        this.dateLeave = dateLeave;
        this.estimatedTime2Nstop = estimatedTime2Nstop;
    }

    public String getStateLastCheckin() {return stateLastCheckin;}
    public void setStateLastCheckin(String stateLastCheckin) {this.stateLastCheckin = stateLastCheckin;}
    public String getCityLastCheckin() {return cityLastCheckin;}
    public void setCityLastCheckin(String cityLastCheckin) {this.cityLastCheckin = cityLastCheckin;}
    public String getStateDestine() {return stateDestine;}
    public void setStateDestine(String stateDestine) {this.stateDestine = stateDestine;}
    public String getCityDestine() {return cityDestine;}
    public void setCityDestine(String cityDestine) {this.cityDestine = cityDestine;}
    public String getDateArrived() {return dateArrived;}
    public void setDateArrived(String dateArrived) {this.dateArrived = dateArrived;}
    public String getDateLeave() {return dateLeave;}
    public void setDateLeave(String dateLeave) {this.dateLeave = dateLeave;}
    public Integer getEstimatedTime2Nstop() {return estimatedTime2Nstop;}
    public void setEstimatedTime2Nstop(Integer estimatedTime2Nstop) {this.estimatedTime2Nstop = estimatedTime2Nstop;}
}
