
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerCreateRequestDto {
    private String stateDestine;
    private String cityDestine;
    private String dateStartTransport;
    private String dateEndTransport;
    private Integer maxPackages;

  
    public String getStateDestine() {return stateDestine;}
    public void setStateDestine(String stateDestine) {this.stateDestine = stateDestine;}
    public String getCityDestine() {return cityDestine;}
    public void setCityDestine(String cityDestine) {this.cityDestine = cityDestine;}
    public String getDateStartTransport() {return dateStartTransport;}
    public void setDateStartTransport(String dateStartTransport) {this.dateStartTransport = dateStartTransport;}
    public String getDateEndTransport() {return dateEndTransport;}
    public void setDateEndTransport(String dateEndTransport) {this.dateEndTransport = dateEndTransport;}
    public Integer getMaxPackages() {return maxPackages;}
    public void setMaxPackages(Integer maxPackages) {this.maxPackages = maxPackages;}
}
