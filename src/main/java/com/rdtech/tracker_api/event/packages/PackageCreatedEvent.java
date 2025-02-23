
package com.rdtech.tracker_api.event.packages;
import org.springframework.context.ApplicationEvent;
import com.rdtech.tracker_api.entity.PackageEntity;

public class PackageCreatedEvent extends ApplicationEvent {
    private final PackageEntity packageEntity;
    
    public PackageCreatedEvent (Object source, PackageEntity packageEntity) {
        super(source);
        this.packageEntity = packageEntity;
    }


    public PackageEntity getPackage() {return this.packageEntity;}
}
