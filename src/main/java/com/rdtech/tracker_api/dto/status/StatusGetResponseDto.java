package com.rdtech.tracker_api.dto.status;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class StatusGetResponseDto {
    private String statusText;

    public StatusGetResponseDto() {}
    public StatusGetResponseDto(String statusText) {
        this.statusText = statusText;
    }

    public String getStatusText() {return statusText;}
    public void setStatusText(String statusText) {this.statusText = statusText;}
}
