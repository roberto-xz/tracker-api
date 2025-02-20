package com.rdtech.tracker_api.dto.driver;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

import com.rdtech.tracker_api.dto.historics.HistoricOfDriverDto;
import java.util.List;

public class DriverGetResponseDto {
    private Long driverId;
    private String driverFullName;
    private String driverRegisterCode;
    private String driverDateOfBirth;
    private List<HistoricOfDriverDto> historic;

    public DriverGetResponseDto() {}
    public DriverGetResponseDto(
            Long driverId,
            String driverFullName,
            String driverRegisterCode,
            String driverDateOfBirth,
            List<HistoricOfDriverDto> historic
    ){
        this.driverId = driverId;
        this.driverFullName = driverFullName;
        this.driverRegisterCode = driverRegisterCode;
        this.driverDateOfBirth = driverDateOfBirth;
        this.historic = historic;
    }

    public Long getDriverId() {return driverId;}
    public void setDriverId(Long driverId) {this.driverId = driverId;}
    public String getDriverFullName() {return driverFullName;}
    public void setDriverFullName(String driverFullName) {this.driverFullName = driverFullName;}
    public String getDriverRegisterCode() {return driverRegisterCode;}
    public void setDriverRegisterCode(String driverRegisterCode) {this.driverRegisterCode = driverRegisterCode;}
    public String getDriverDateOfBirth() {return driverDateOfBirth;}
    public void setDriverDateOfBirth(String driverDateOfBirth) {this.driverDateOfBirth = driverDateOfBirth;}
    public List<HistoricOfDriverDto> getHistoric() {return historic;}
    public void setHistoric(List<HistoricOfDriverDto> historic) {this.historic = historic;}
}
