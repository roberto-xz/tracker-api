
package com.rdtech.tracker_api.dto.driver;
/**
 *****
 * @date 24/02/2025
 * @author roberto-xz
 *****
 */
public class DriverCheckinRequestDto {
    private Long vehicleId;
    private Long driverId;
    private String stateCheckin;
    private String cityCheckin;
    private String stateDestine;
    private String cityDestine;
    private String dateArrived;
    private String dateLeave;
    private Integer estimatedTime2Nstop;
    
    public Long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public Long getDriverId() {
        return driverId;
    }
    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }
    public String getStateCheckin() {
        return stateCheckin;
    }
    public void setStateCheckin(String stateCheckin) {
        this.stateCheckin = stateCheckin;
    }
    public String getCityCheckin() {
        return cityCheckin;
    }
    public void setCityCheckin(String cityCheckin) {
        this.cityCheckin = cityCheckin;
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
