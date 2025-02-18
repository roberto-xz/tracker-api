package com.rdtech.tracker_api.entity;

import jakarta.persistence.*;

import java.util.ArrayList;

import java.util.List;


/**
 *****
 * @date 17/02/2025
 * @author Juci-x
 *****
 */

@Entity
@Table(name = "Container")
public class ContainerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer containerId;

    @Column(nullable = false)
    private Integer vehicleId;

    @Column(nullable = false)
    private String stateDestine;

    @Column(nullable = false)
    private String cityDestine;

    @Column(nullable = false)
    private Object dateStartTransport;

    @Column(nullable = false)
    private Object dateEndTransport;

    @Column(nullable = false)
    private Integer statusID;

    @Transient
    private List<ContainerHistory> history = new ArrayList<>();

    public ContainerEntity() {
    }

    public ContainerEntity(Integer containerId, Integer vehicleId, String stateDestine, String cityDestine,
                           Object dateStartTransport, Object dateEndTransport, Integer statusID) {
        this.containerId = containerId;
        this.vehicleId = vehicleId;
        this.stateDestine = stateDestine;
        this.cityDestine = cityDestine;
        this.dateStartTransport = dateStartTransport;
        this.dateEndTransport = dateEndTransport;
        this.statusID = statusID;

        this.history.add(new ContainerHistory("Criação do container", dateStartTransport, vehicleId, statusID));
    }

    // Getters e Setters
    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getStateDestine() {
        return stateDestine;
    }

    public void setStateDestine(String stateDestineDestine) {
        this.stateDestine = stateDestine;
    }

    public String getCityDestine() {
        return cityDestine;
    }

    public void setCityDestine(String cityDestine) {
        this.cityDestine = cityDestine;
    }

    public Object getDateStartTransport() {
        return dateStartTransport;
    }

    public void setDateStartTransport(Object dateStartTransport) {
        this.dateStartTransport = dateStartTransport;
    }

    public Object getDateEndTransport() {
        return dateEndTransport;
    }

    public void setDateEndTransport(Object dateEndTransport) {
        this.dateEndTransport = dateEndTransport;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    // Método changeVehicle
    public void changeVehicle(Integer newVehicleId) {
        this.vehicleId = newVehicleId;
        this.history.add(new ContainerHistory("Mudança de Veículo", new Object(), newVehicleId, this.statusID));
    }

    // Método changeStatus
    public void changeStatus(Integer newStatusId) {
        this.statusID = newStatusId;
        this.history.add(new ContainerHistory("Mudança de Status", new Object(), this.vehicleId, newStatusId));
    }

    // Método getHistoric
    public List<String> getHistoric() {
        List<String> historicLogs = new ArrayList<>();
        for (ContainerHistory historicL : history) {
            historicLogs.add(historicL.toString());
        }
        return historicLogs;
    }

    // Classe privada para o histórico do container
    private static class ContainerHistory {
        private String description;
        private Object timestamp;
        private Integer vehicleId;
        private Integer statusID;

        // Construtor da classe
        public ContainerHistory(String description, Object timestamp, Integer vehicleId, Integer statusID) {
            this.description = description;
            this.timestamp = timestamp;
            this.vehicleId = vehicleId;
            this.statusID = statusID;
        }

        @Override
        public String toString() {
            return "ContainerHistory{" +
                    "description='" + description + '\'' +
                    ", timestamp=" + timestamp +
                    ", vehicleId=" + vehicleId +
                    ", statusID=" + statusID +
                    '}';
        }
    }
}