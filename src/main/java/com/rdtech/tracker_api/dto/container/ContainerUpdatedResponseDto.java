
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerUpdatedResponseDto {
    private String message;
    private Integer statusCode;

    public ContainerUpdatedResponseDto() {}

    public ContainerUpdatedResponseDto(String message, Integer statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
    public Integer getStatusCode() {return statusCode;}
    public void setStatusCode(Integer statusCode) {this.statusCode = statusCode;}
}
