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
@Table(name = "Vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    @Column(nullable = false)
    private Long driverId;

    @Column(nullable = false)
    private String vehicleType;

    @Column(nullable = false)
    private String vehiclePlate;

    @Column(nullable = false)
    private Integer vehicleCapacity;

    private Boolean isAvailable = true;

    public Boolean getVehicleAsProblem() {
        return vehicleAsProblem;
    }

    public void setVehicleAsProblem(Boolean vehicleAsProblem) {
        this.vehicleAsProblem = vehicleAsProblem;
    }

    public Integer getVehicleProblemLevel() {
        return vehicleProblemLevel;
    }

    public void setVehicleProblemLevel(Integer vehicleProblemLevel) {
        this.vehicleProblemLevel = vehicleProblemLevel;
    }

    @Column(nullable = false)
    private Boolean vehicleAsProblem = false;

    @Column(nullable = false)
    private Integer vehicleProblemLevel = 0;

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

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public Integer getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(Integer vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
