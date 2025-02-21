package com.rdtech.tracker_api.dto.packages;

/**
 *
 * @date 20/02/2025
 * @author Juci-x
 *
 **/

public class PackageGetRequestDto {
    private Long packageId;
    private String trackerCode;

    public Long getPackageId() {return packageId;}
    public void setPackageId(Long packageId) {this.packageId = packageId;}
    public String getTrackerCode() {return trackerCode;}
    public void setTrackerCode(String trackerCode) {this.trackerCode = trackerCode;}
}
