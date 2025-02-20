
package com.rdtech.tracker_api.dto.container;

/**
 *****
 * @date 19/02/2025
 * @author roberto-xz
 *****
**/
public class ContainerDeletedResponseDto {
    private String messagem;
    private Integer statusCode;
    
    public ContainerDeletedResponseDto() {
    }
    
    public ContainerDeletedResponseDto(String messagem, Integer statusCode) {
        this.messagem = messagem;
        this.statusCode = statusCode;
    }
    public String getMessagem() {return messagem;}
    public void setMessagem(String messagem) {this.messagem = messagem;}
    public Integer getStatusCode() {return statusCode;}
    public void setStatusCode(Integer statusCode) {this.statusCode = statusCode;}
}
