package com.rdtech.tracker_api.dto.status;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class StatusUpdatedResponseDto {
    private Long statusId;
    private String menssagem;

    public StatusUpdatedResponseDto() {}
    public StatusUpdatedResponseDto(Long statusId, String menssagem) {
        this.statusId = statusId;
        this.menssagem = menssagem;
    }

    public Long getStatusId() {return statusId;}
    public void setStatusId(Long statusId) {this.statusId = statusId;}
    public String getMenssagem() {return menssagem;}
    public void setMenssagem(String menssagem) {this.menssagem = menssagem;}
}
