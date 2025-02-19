
package com.rdtech.tracker_api.dto.historics;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class HistoricOfContainerDto {
    private Long vehicleId;
    private String cityChanged;
    private String stateChanged;
    private String dateChanged;
    private String dateArrived;
    private String dateLeave;
    private String dateVehicleChanged;
    private Integer changedOfVehicles;


    public HistoricOfContainerDto() {}
    public HistoricOfContainerDto(
        Long vehicleId, 
        String cityChanged, 
        String stateChanged, 
        String dateChanged,
        String dateArrived, 
        String dateLeave, 
        String dateVehicleChanged, 
        Integer changedOfVehicles
    ) {
        this.vehicleId = vehicleId;
        this.cityChanged = cityChanged;
        this.stateChanged = stateChanged;
        this.dateChanged = dateChanged;
        this.dateArrived = dateArrived;
        this.dateLeave = dateLeave;
        this.dateVehicleChanged = dateVehicleChanged;
        this.changedOfVehicles = changedOfVehicles;
    }


    public Long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getCityChanged() {
        return cityChanged;
    }
    public void setCityChanged(String cityChanged) {
        this.cityChanged = cityChanged;
    }
    public String getStateChanged() {
        return stateChanged;
    }
    public void setStateChanged(String stateChanged) {
        this.stateChanged = stateChanged;
    }
    public String getDateChanged() {
        return dateChanged;
    }
    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
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
    public String getDateVehicleChanged() {
        return dateVehicleChanged;
    }
    public void setDateVehicleChanged(String dateVehicleChanged) {
        this.dateVehicleChanged = dateVehicleChanged;
    }
    public Integer getChangedOfVehicles() {
        return changedOfVehicles;
    }
    public void setChangedOfVehicles(Integer changedOfVehicles) {
        this.changedOfVehicles = changedOfVehicles;
    }

    
}
