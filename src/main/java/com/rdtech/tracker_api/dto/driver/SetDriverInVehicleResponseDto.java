
package com.rdtech.tracker_api.dto.driver;

/**
 *****
 * @date 24/02/2015
 * @author roberto-xz
 *****
 */
public class SetDriverInVehicleResponseDto {
    private String message;
    private Integer statusCode;
    
    
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
    public Integer getStatusCode() {return statusCode;}
    public void setStatusCode(Integer statusCode) {this.statusCode = statusCode;}
}
