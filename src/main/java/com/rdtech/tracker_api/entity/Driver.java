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
@Table(name = "Driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    @Column(nullable = false)
    private String driverFullName;

    @Column(nullable = false, unique = true)
    private String driverRegisterCode;

    @Column(nullable = false)
    private String driverDateOfBirth;


    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getDriverFullName() {
        return driverFullName;
    }

    public void setDriverFullName(String driverFullName) {
        this.driverFullName = driverFullName;
    }

    public String getDriverRegisterCode() {
        return driverRegisterCode;
    }

    public void setDriverRegisterCode(String driverRegisterCode) {
        this.driverRegisterCode = driverRegisterCode;
    }

    public String getDriverDateOfBirth() {
        return driverDateOfBirth;
    }

    public void setDriverDateOfBirth(String driverDateOfBirth) {
        this.driverDateOfBirth = driverDateOfBirth;
    }
}
