
package com.rdtech.tracker_api.dto.historics;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class HistoricOfTransportDto {
    private Long driverId;
    private String stateLastCheckin;
    private String cityLastCheckin;
    private String stateDestine;
    private String cityDestine;
    private Long statusId;
    private String dateArrived;
    private String dateLeave;
    private Integer estimatedTime2Nstop;


    public HistoricOfTransportDto() {}
    public HistoricOfTransportDto(
        Long driverId, 
        String stateLastCheckin, 
        String cityLastCheckin, 
        String stateDestine,
        String cityDestine, 
        Long statusId, 
        String dateArrived, 
        String dateLeave, 
        Integer estimatedTime2Nstop
    ) {
        this.driverId = driverId;
        this.stateLastCheckin = stateLastCheckin;
        this.cityLastCheckin = cityLastCheckin;
        this.stateDestine = stateDestine;
        this.cityDestine = cityDestine;
        this.statusId = statusId;
        this.dateArrived = dateArrived;
        this.dateLeave = dateLeave;
        this.estimatedTime2Nstop = estimatedTime2Nstop;
    }

    public Long getDriverId() {
        return driverId;
    }
    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }
    public String getStateLastCheckin() {
        return stateLastCheckin;
    }
    public void setStateLastCheckin(String stateLastCheckin) {
        this.stateLastCheckin = stateLastCheckin;
    }
    public String getCityLastCheckin() {
        return cityLastCheckin;
    }
    public void setCityLastCheckin(String cityLastCheckin) {
        this.cityLastCheckin = cityLastCheckin;
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
    public Long getStatusId() {
        return statusId;
    }
    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }
    public String getDateArrived() {
        return dateArrived;
    }
    public void setDateArrived(String dateArrived) {
        this.dateArrived = dateArrived;
    }
    public String getDateLeave() {
        return dateLeave;
    }
    public void setDateLeave(String dateLeave) {
        this.dateLeave = dateLeave;
    }
    public Integer getEstimatedTime2Nstop() {
        return estimatedTime2Nstop;
    }
    public void setEstimatedTime2Nstop(Integer estimatedTime2Nstop) {
        this.estimatedTime2Nstop = estimatedTime2Nstop;
    }
}
