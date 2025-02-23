
package com.rdtech.tracker_api.dto.vehicle;
import java.util.List;
import com.rdtech.tracker_api.dto.historics.HistoricOfTransportDto;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class VehicleGetResponseDto {
    private Long vehicleId;
    private Long driverID;
    private String vehicleType;
    private String vehiclePlate;
    private Integer vehicleCapacity;
    private Boolean vehicleAsProblem;
    private Integer vehicleProblemLevel;
    private List<HistoricOfTransportDto> historic;

    public VehicleGetResponseDto() {}
    public VehicleGetResponseDto(
        Long vehicleId, 
        Long driverID, 
        String vehicleType, 
        String vehiclePlate,
        Integer vehicleCapacity, 
        Boolean vehicleAsProblem, 
        Integer vehicleProblemLevel,
        List<HistoricOfTransportDto> historic
    ) {
        this.vehicleId = vehicleId;
        this.driverID = driverID;
        this.vehicleType = vehicleType;
        this.vehiclePlate = vehiclePlate;
        this.vehicleCapacity = vehicleCapacity;
        this.vehicleAsProblem = vehicleAsProblem;
        this.vehicleProblemLevel = vehicleProblemLevel;
        this.historic = historic;
    }



    public Long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public Long getDriverID() {
        return driverID;
    }
    public void setDriverID(Long driverID) {
        this.driverID = driverID;
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
    public List<HistoricOfTransportDto> getHistoric() {
        return historic;
    }
    public void setHistoric(List<HistoricOfTransportDto> historic) {
        this.historic = historic;
    }
}
