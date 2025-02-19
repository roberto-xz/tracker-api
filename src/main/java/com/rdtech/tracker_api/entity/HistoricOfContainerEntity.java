
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
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long historicOfContainerId;
    
    @Column(nullable = false)
    private Long containerId;
    
    @Column(nullable = false)
    private Long vehicleId;
    
    @Column(nullable = false)
    private String cityChanged; // cidade que o container mudou de véiculo
    
    @Column(nullable = false)
    private String stateChanged;// estado, exemplo: Pernambuco, Rio, Amapá
    
    @Column(nullable = false)
    private String dateArrived; // data que o veículo chegou nesse local
    
    @Column(nullable = false)
    private String dataLeave;   // data que saio
    
    @Column(nullable = false)
    private String dataVehicleChanged; // data que ouve a troca de veículos
    
    @Column(nullable = false)
    private Integer changedOfVehicles; // Quantidade de vezes que esse container mudou de veículo

    
    
    public void setHistoricOfContainerId(Long id) {
        historicOfContainerId = id;
    }
    
    public Long getHistoricOfContainerId() {
        return historicOfContainerId;
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

    public String getDateArrived() {
        return dateArrived;
    }

    public void setDateArrived(String dateArrived) {
        this.dateArrived = dateArrived;
    }

    public String getDataLeave() {
        return dataLeave;
    }

    public void setDataLeave(String dataLeave) {
        this.dataLeave = dataLeave;
    }

    public String getDataVehicleChanged() {
        return dataVehicleChanged;
    }

    public void setDataVehicleChanged(String dataVehicleChanged) {
        this.dataVehicleChanged = dataVehicleChanged;
    }

    public Integer getChangedOfVehicles() {
        return changedOfVehicles;
    }

    public void setChangedOfVehicles(Integer changedOfVehicles) {
        this.changedOfVehicles = changedOfVehicles;
    }
}
