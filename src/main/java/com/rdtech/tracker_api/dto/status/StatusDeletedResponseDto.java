package com.rdtech.tracker_api.dto.status;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class StatusDeletedResponseDto {
    private Long statusId;
    private String messagem;

    public StatusDeletedResponseDto() {}
    public StatusDeletedResponseDto(Long statusId, String messagem) {
        this.statusId = statusId;
        this.messagem = messagem;
    }

    public Long getStatusId() {return statusId;}
    public void setStatusId(Long statusId) {this.statusId = statusId;}
    public String getMessagem() {return messagem;}
    public void setMessagem(String messagem) {this.messagem = messagem;}
}
