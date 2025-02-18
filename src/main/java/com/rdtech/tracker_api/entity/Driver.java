/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdtech.tracker_api.entity;

import jakarta.persistence.*;

/**
 *
 * @author roberto-xz
 * @author Juci-x
 */

@Entity
@Table(name = "Driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer driverId;

    @Column(nullable = false)
    private String driverFullName;

    @Column(nullable = false)
    private String driverRegisterCode;

    @Column(nullable = false)
    private Object driverDateOfBirth;


    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
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

    public Object getDriverDateOfBirth() {
        return driverDateOfBirth;
    }

    public void setDriverDateOfBirth(Object driverDateOfBirth) {
        this.driverDateOfBirth = driverDateOfBirth;
    }
}
