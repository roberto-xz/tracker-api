package com.rdtech.tracker_api.dto.status;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class StatusUpdatedResponseDto {
    private Long statusId;
    private String message;

    public StatusUpdatedResponseDto() {}
    public StatusUpdatedResponseDto(Long statusId, String message) {
        this.statusId = statusId;
        this.message = message;
    }

    public Long getStatusId() {return statusId;}
    public void setStatusId(Long statusId) {this.statusId = statusId;}
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
}
