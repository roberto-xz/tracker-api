
package com.rdtech.tracker_api.event.packages;
import org.springframework.context.ApplicationEvent;

public class PackageChangeContainerEvent extends ApplicationEvent {
    private Long containerId;
    private Long packageId;
    
    public PackageChangeContainerEvent(Object source, Long containerId, Long packageId) {
        super(source);
        this.containerId = containerId;
        this.packageId = packageId;
    }

    public Long getContainerId() {return containerId;}
    public Long getPackageId() {return packageId;}
}
