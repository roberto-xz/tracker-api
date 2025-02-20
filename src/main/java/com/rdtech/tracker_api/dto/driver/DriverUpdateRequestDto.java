package com.rdtech.tracker_api.dto.driver;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class DriverUpdateRequestDto {
    private String driverFullName;
    private String driverRegisterCode;
    private String driverDateOfBirth;

    public String getDriverFullName() {return driverFullName;}
    public void setDriverFullName(String driverFullName) {this.driverFullName = driverFullName;}
    public String getDriverRegisterCode() {return driverRegisterCode;}
    public void setDriverRegisterCode(String driverRegisterCode) {this.driverRegisterCode = driverRegisterCode;}
    public String getDriverDateOfBirth() {return driverDateOfBirth;}
    public void setDriverDateOfBirth(String driverDateOfBirth) {this.driverDateOfBirth = driverDateOfBirth;}
}
