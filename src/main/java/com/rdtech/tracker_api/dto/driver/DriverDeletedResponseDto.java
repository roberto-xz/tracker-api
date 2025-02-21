package com.rdtech.tracker_api.dto.driver;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 */

public class DriverDeletedResponseDto {
    private String messagem;
    private Integer statusCode;

    public DriverDeletedResponseDto() {}
    public DriverDeletedResponseDto(String messagem, Integer statusCode) {
        this.messagem = messagem;
        this.statusCode = statusCode;
    }

    public String getMessagem() {return messagem;}
    public void setMessagem(String messagem) {this.messagem = messagem;}
    public Integer getStatusCode() {return statusCode;}
    public void setStatusCode(Integer statusCode) {this.statusCode = statusCode;}
}
