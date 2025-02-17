package com.rdtech.tracker_api.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
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
    private String districtDestine;

    @Column(nullable = false)
    private String cityDestine;

    @Column(nullable = false)
    private Date dateStartTransport;

    @Column(nullable = false)
    private Date dateEndTransport;

    @Column(nullable = false)
    private Integer statusID;

    @Transient
    private List<ContainerHistory> history = new ArrayList<>();

    public ContainerEntity() {
    }

    public ContainerEntity(Integer containerId, Integer vehicleId, String districtDestine, String cityDestine,
                           Date dateStartTransport, Date dateEndTransport, Integer statusID) {
        this.containerId = containerId;
        this.vehicleId = vehicleId;
        this.districtDestine = districtDestine;
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

    public String getDistrictDestine() {
        return districtDestine;
    }

    public void setDistrictDestine(String districtDestine) {
        this.districtDestine = districtDestine;
    }

    public String getCityDestine() {
        return cityDestine;
    }

    public void setCityDestine(String cityDestine) {
        this.cityDestine = cityDestine;
    }

    public Date getDateStartTransport() {
        return dateStartTransport;
    }

    public void setDateStartTransport(Date dateStartTransport) {
        this.dateStartTransport = dateStartTransport;
    }

    public Date getDateEndTransport() {
        return dateEndTransport;
    }

    public void setDateEndTransport(Date dateEndTransport) {
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
        this.history.add(new ContainerHistory("Mudança de Veículo", new Date(), newVehicleId, this.statusID));
    }

    // Método changeStatus
    public void changeStatus(Integer newStatusId) {
        this.statusID = newStatusId;
        this.history.add(new ContainerHistory("Mudança de Status", new Date(), this.vehicleId, newStatusId));
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
        private Date timestamp;
        private Integer vehicleId;
        private Integer statusID;

        // Construtor da classe
        public ContainerHistory(String description, Date timestamp, Integer vehicleId, Integer statusID) {
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