package com.rdtech.tracker_api.dto.status;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class StatusUpdateRequestDto {
    private Long statusId;
    private String statusText;

    public Long getStatusId() {return statusId;}
    public void setStatusId(Long statusId) {this.statusId = statusId;}
    public String getStatusText() {return statusText;}
    public void setStatusText(String statusText) {this.statusText = statusText;}
}
