package com.rdtech.tracker_api.dto.status;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class StatusCreatedResponseDto {
    private Long statusId;
    private String Menssagem;

    public StatusCreatedResponseDto() {}
    public StatusCreatedResponseDto(Long statusId, String menssagem) {
        this.statusId = statusId;
        Menssagem = menssagem;
    }

    public Long getStatusId() {return statusId;}
    public void setStatusId(Long statusId) {this.statusId = statusId;}
    public String getMenssagem() {return Menssagem;}
    public void setMenssagem(String menssagem) {Menssagem = menssagem;}
}
