
package com.rdtech.tracker_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *****
 * @date 15/02/2015 16:10 pm
 * @author roberto-xz
 *****
 */

@Entity
@Table(name = "HistoricOfContainer") // Define o nome da tabela no banco de dados
public class HistoricOfContainerEntity {
   

    @Column(nullable = false)
    private Long containerId;
    
    @Column(nullable = false)
    private Long vehicleId;
    
    @Column(nullable = false)
    private String cityChanged; // cidade que o container mudou de véiculo
    
    @Column(nullable = false)
    private String stateChanged;// estado, exemplo: Pernambuco, Rio, Amapá
    
    @Column(nullable = false)
    private Object dateArrived; // data que o veículo chegou nesse local
    
    @Column(nullable = false)
    private Object dataLeave;   // data que saio
    
    @Column(nullable = false)
    private Object dataVehicleChanged; // data que ouve a troca de veículos
    
    @Column(nullable = false)
    private Integer changedOfVehicles; // Quantidade de vezes que esse container mudou de veículo

    
    
    
    public Long getContainerID() {
        return containerId;
    }

    public void setContainerID(Long containerId) {
        this.containerId = containerId;
    }

    public Long getVehicleID() {
        return vehicleId;
    }

    public void setVehicleID(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getCityChanged() {
        return cityChanged;
    }

    public void setCityChanged(String cityChanged) {
        this.cityChanged = cityChanged;
    }

    public String getStateChanged() {
        return stateChanged;
    }

    public void setStateChanged(String stateChanged) {
        this.stateChanged = stateChanged;
    }

    public Object getDateArrived() {
        return dateArrived;
    }

    public void setDateArrived(Object dateArrived) {
        this.dateArrived = dateArrived;
    }

    public Object getDataLeave() {
        return dataLeave;
    }

    public void setDataLeave(Object dataLeave) {
        this.dataLeave = dataLeave;
    }

    public Object getDataVehicleChanged() {
        return dataVehicleChanged;
    }

    public void setDataVehicleChanged(Object dataVehicleChanged) {
        this.dataVehicleChanged = dataVehicleChanged;
    }

    public Integer getChangedOfVehicles() {
        return changedOfVehicles;
    }

    public void setChangedOfVehicles(Integer changedOfVehicles) {
        this.changedOfVehicles = changedOfVehicles;
    }
}
