
package com.rdtech.tracker_api.dto.historics;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class HistoricOfPackageDto {
    private Long containerId;
    private String dateChanged;
    private String cityChanged;
    private String stateChanged;
    private Integer changedOfContainers;
    


    public HistoricOfPackageDto() {}
    public HistoricOfPackageDto(
        Long containerId, 
        String dateChanged, 
        String cityChanged, 
        String stateChanged,
        Integer changedOfContainers
    ) {
        this.containerId = containerId;
        this.dateChanged = dateChanged;
        this.cityChanged = cityChanged;
        this.stateChanged = stateChanged;
        this.changedOfContainers = changedOfContainers;
    }


    public Long getContainerId() {
        return containerId;
    }
    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }
    public String getDateChanged() {
        return dateChanged;
    }
    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
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
    public Integer getChangedOfContainers() {
        return changedOfContainers;
    }
    public void setChangedOfContainers(Integer changedOfContainers) {
        this.changedOfContainers = changedOfContainers;
    }    
}
