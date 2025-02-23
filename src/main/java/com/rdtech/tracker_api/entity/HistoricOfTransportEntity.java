
package com.rdtech.tracker_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *****
 * @date 23/02/2015
 * @author roberto-xz
 *****
 */

@Entity
public class HistoricOfTransportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long HistoricOfTransportId;

    private Long vehicleId;
    private Long driverId;
    private Long statusId;

    private String stateLastCheckin;
    private String cityLastCheckin;
    private String stateDestine;
    private String cityDestine;

    private String dateArrived;
    private String dateLeave;
    private Integer estimatedTimeToNextStop;


    public Long getHistoricOfTransportId() {return HistoricOfTransportId;}
    public void setHistoricOfTransportId(Long historicOfTransportId) {
        HistoricOfTransportId = historicOfTransportId;
    }
    public Long getVehicleId() {return vehicleId;}
    public void setVehicleId(Long vehicleId) {this.vehicleId = vehicleId;}
    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
    public Long getStatusId() {return statusId;}
    public void setStatusId(Long statusId) {this.statusId = statusId;}
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
    public Integer getEstimatedTimeToNextStop() {return estimatedTimeToNextStop;}
    public void setEstimatedTimeToNextStop(Integer estimatedTimeToNextStop) {this.estimatedTimeToNextStop = estimatedTimeToNextStop;}
}
