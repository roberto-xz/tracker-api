
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
@Table(name = "HistoricOfPackage") // Define o nome da tabela no banco de dados
public class HistoricOfPackageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long historicOfPackageId;

    @Column(nullable = false)
    private Long packageId;       // Chave estrangeira do Package
    
    @Column(nullable = false)
    private Long containerId;     // Chave estrangerido do container
    
    @Column(nullable = false)
    private Object dataChanged;   // Data que o pacote mudou de container
    
    @Column(nullable = false)
    private String cityChanged;   // cidade que o pacote mudou de container
    
    @Column(nullable = false)
    private String stateChanged;  // estado


    public void setHistoricOfPackageId(Long id){
        historicOfPackageId = id;
    }

    public Long  getHistoricOfPackageId(){
        return  historicOfPackageId;
    }


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

    public Object getDataChanged() {
        return dataChanged;
    }

    public void setDataChanged(Object dataChanged) {
        this.dataChanged = dataChanged;
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
}
