package com.rdtech.tracker_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *****
 * @date 17/02/2025
 * @author Juci-x
 *****
 
 *****
 * @date 18/02/2025
 * @code_review roberto-xz
 *****
**/

@Entity
@Table(name = "Container")
public class ContainerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long containerId;

    @Column(nullable = false)
    private Long vehicleId;

    @Column(nullable = false)
    private Long statusID;

    @Column(nullable = false)
    private String stateDestine;

    @Column(nullable = false)
    private String cityDestine;

    @Column(nullable = false)
    private String dateStartTransport;

    @Column(nullable = false)
    private String dateEndTransport;

    private Integer numPackages = 0; // Quantidade atual de pacotes
    private Integer maxPackages = 5; // Máximo permitido

    
    public Integer getNumPackages() {
        return numPackages;
    }

    public void setNumPackages(Integer numPackages) {
        this.numPackages = numPackages;
    }

    public Integer getMaxPackages() {
        return maxPackages;
    }

    public void setMaxPackages(Integer maxPackages) {
        this.maxPackages = maxPackages;
    }

    public Long getContainerId() {
        return containerId;
    }

    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getStatusID() {
        return statusID;
    }

    public void setStatusID(Long statusID) {
        this.statusID = statusID;
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
}