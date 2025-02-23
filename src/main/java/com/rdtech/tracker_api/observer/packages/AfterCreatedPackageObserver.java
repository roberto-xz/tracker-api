
package com.rdtech.tracker_api.observer.packages;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.event.packages.PackageCreatedEvent;
/**
 *****
 * @date 23/02/2025
 * @author roberto-xz
 *****
 */

@Component
public class AfterCreatedPackageObserver {
    
    @EventListener
    public void run(PackageCreatedEvent event) {
        PackageEntity packageEntity = event.getPackage();
        System.out.println("um novo pacote foi criado "+packageEntity.getPackageId());
    } 
}
