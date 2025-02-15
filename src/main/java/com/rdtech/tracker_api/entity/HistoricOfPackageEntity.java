
package com.rdtech.tracker_api.entity;

import jakarta.persistence.Entity;
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
    private Long packageId;       // Chave estrangeira do Package
    private Long containerId;     // Chave estrangerido do container
    private Object dataChanged;   // Data que o pacote mudou de container
    private String cityChanged;   // cidade que o pacote mudou de container
    private String stateChanged;  // estado

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
