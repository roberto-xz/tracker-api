package com.rdtech.tracker_api.dto.packages;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class PackageCreatedResponseDto {
    private Long packageId;
    private String trackerCode;
    private Long statusId;
    private Integer statusCode;

    public PackageCreatedResponseDto() {}
    public PackageCreatedResponseDto(Long packageId, String trackerCode, Long statusId, Integer statusCode) {
        this.packageId = packageId;
        this.trackerCode = trackerCode;
        this.statusId = statusId;
        this.statusCode = statusCode;
    }

    public Long getPackageId() {return packageId;}
    public void setPackageId(Long packageId) {this.packageId = packageId;}
    public String getTrackerCode() {return trackerCode;}
    public void setTrackerCode(String trackerCode) {this.trackerCode = trackerCode;}
    public Long getStatusId() {return statusId;}
    public void setStatusId(Long statusId) {this.statusId = statusId;}
    public Integer getStatusCode() {return statusCode;}
    public void setStatusCode(Integer statusCode) {this.statusCode = statusCode;}
}
