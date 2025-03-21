
package com.rdtech.tracker_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *****
 * @date 15/02/2015 16:40 pm
 * @author roberto-xz
 *****
 */

@Entity
@Table(name = "Transport") // Define o nome da tabela no banco de dados
public class TransportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long transportId;

    @Column(nullable = false)
    private Long vehicleId;
    
    @Column(nullable = false)
    private Long driverId;
    
    @Column(nullable = false)
    private Long statusId;
    
    @Column(nullable = false)
    private String stateActual; // Estado atual do veículo, São Paulo, amazonas, etc..
    
    @Column(nullable = false)
    private String cityActual;  // cidade atual
    
    @Column(nullable = false)
    private String stateDestine; // proximo destino do veículo
    
    @Column(nullable = false)
    private String cityDestine;  //
    
    @Column(nullable = false)
    private String dateArrived;  // Data que chegou no local
    
    @Column(nullable = false)
    private String dateLeave;    // Data que vai partir
    
    @Column(nullable = false)
    private Integer estimatedTimeToNextStop; // Tempo em horas, até a próxima parada

    
    

    public Long getTransportId() { return transportId;}
    public void setTransportId(Long id) {
        transportId = id;
    }

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

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getStateActual() {
        return stateActual;
    }

    public void setStateActual(String stateActual) {
        this.stateActual = stateActual;
    }

    public String getCityActual() {
        return cityActual;
    }

    public void setCityActual(String cityActual) {
        this.cityActual = cityActual;
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

    public Integer getEstimatedTimeToNextStop() {
        return estimatedTimeToNextStop;
    }

    public void setEstimatedTimeToNextStop(Integer estimatedTimeToNextStop) {
        this.estimatedTimeToNextStop = estimatedTimeToNextStop;
    }
}
