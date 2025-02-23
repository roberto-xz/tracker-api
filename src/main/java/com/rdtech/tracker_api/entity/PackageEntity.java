
package com.rdtech.tracker_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *****
 * @date 15/02/2015 14:60 pm
 * @author roberto-xz
 *****
 */

@Entity
@Table(name = "Package") // Define o nome da tabela no banco de dados
public class PackageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long packageId;
    

    private Long containerId = -1L; // Indica que não pertence a um container
    private Long statusId;          // Status do pacote, em preparação, entransito, entregue, aguardando transport..
    private String trackerCode;     // Codigo de Rastreio
    private String description;
    private String dateStartTransport;   // Data do início do transport
    private String dateEndTransport;     // Data da entrega
    private String expectedDeliveryDate; // Data prevista para entrega

    @Column(nullable = false)
    private String userUUID;
    
  
    @Column(nullable = false)
    private String stateOrigem;  // Estado de Origem, exp: Pernambuco, São Paulo, Goiais, etc..

    @Column(nullable = false)
    private String cityOrigem;   // cidade de Origem
   
    @Column(nullable = false)
    private String stateDestine;
   
    @Column(nullable = false)
    private String cityDestine;
    
    @Column(nullable = false)
    private String streetAdress; // Rua
    
    @Column(nullable = false)
    private String neighborhood; // Bairro
    
    @Column(nullable = false)
    private String homeNumber;   // Número da casa
    
    
    
    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public Long getContainerId() {
        return containerId;
    }

    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getTrackerCode() {
        return trackerCode;
    }

    public void setTrackerCode(String trackerCode) {
        this.trackerCode = trackerCode;
    }

    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStateOrigem() {
        return stateOrigem;
    }

    public void setStateOrigem(String stateOrigem) {
        this.stateOrigem = stateOrigem;
    }

    public String getCityOrigem() {
        return cityOrigem;
    }

    public void setCityOrigem(String cityOrigem) {
        this.cityOrigem = cityOrigem;
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

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getDateStartTransport() {
        return dateStartTransport;
    }

    public void setDateStartTransport(String dateStartTransport) {
        this.dateStartTransport = dateStartTransport;
    }

    public String getDateEndTransport() {
        return dateEndTransport;
    }

    public void setDateEndTransport(String dateEndTransport) {
        this.dateEndTransport = dateEndTransport;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }
    
}


