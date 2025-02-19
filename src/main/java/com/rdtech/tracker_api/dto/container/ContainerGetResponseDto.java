
package com.rdtech.tracker_api.dto.container;
import java.util.List;
import com.rdtech.tracker_api.dto.historics.HistoricOfContainerDto;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerGetResponseDto {
    private Long containerId;
    private Long vehilceId;
    private String stateDestine;
    private String cityDestine;
    private String dateStartTransport;
    private String dateEndTransport;
    private Integer maxPackages;
    private Integer numPackages;
    private List<HistoricOfContainerDto> historic;


    public ContainerGetResponseDto() {
    }

    public ContainerGetResponseDto(Long containerId, Long vehilceId, String stateDestine, String cityDestine,
            String dateStartTransport, String dateEndTransport, Integer maxPackages, Integer numPackages,
            List<HistoricOfContainerDto> historic) {
        this.containerId = containerId;
        this.vehilceId = vehilceId;
        this.stateDestine = stateDestine;
        this.cityDestine = cityDestine;
        this.dateStartTransport = dateStartTransport;
        this.dateEndTransport = dateEndTransport;
        this.maxPackages = maxPackages;
        this.numPackages = numPackages;
        this.historic = historic;
    }

    public Long getContainerId() {
        return containerId;
    }
    public void setContainerId(Long containerId) {
        this.containerId = containerId;
    }
    public Long getVehilceId() {
        return vehilceId;
    }
    public void setVehilceId(Long vehilceId) {
        this.vehilceId = vehilceId;
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
    public Integer getMaxPackages() {
        return maxPackages;
    }
    public void setMaxPackages(Integer maxPackages) {
        this.maxPackages = maxPackages;
    }
    public Integer getNumPackages() {
        return numPackages;
    }
    public void setNumPackages(Integer numPackages) {
        this.numPackages = numPackages;
    }
    public List<HistoricOfContainerDto> getHistoric() {
        return historic;
    }
    public void setHistoric(List<HistoricOfContainerDto> historic) {
        this.historic = historic;
    }
}
