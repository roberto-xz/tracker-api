package com.rdtech.tracker_api.dto.driver;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class DriverGetResponseDto {
    private Long driverId;
    private String driverFullName;
    private String driverRegisterCode;
    private String driverDateOfBirth;


    public DriverGetResponseDto() {}
    public DriverGetResponseDto(
            Long driverId,
            String driverFullName,
            String driverRegisterCode,
            String driverDateOfBirth

    ){
        this.driverId = driverId;
        this.driverFullName = driverFullName;
        this.driverRegisterCode = driverRegisterCode;
        this.driverDateOfBirth = driverDateOfBirth;
    }

    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
    public String getDriverFullName() {return driverFullName;}
    public void setDriverFullName(String driverFullName) {this.driverFullName = driverFullName;}
    public String getDriverRegisterCode() {return driverRegisterCode;}
    public void setDriverRegisterCode(String driverRegisterCode) {this.driverRegisterCode = driverRegisterCode;}
    public String getDriverDateOfBirth() {return driverDateOfBirth;}
    public void setDriverDateOfBirth(String driverDateOfBirth) {this.driverDateOfBirth = driverDateOfBirth;}
    }
