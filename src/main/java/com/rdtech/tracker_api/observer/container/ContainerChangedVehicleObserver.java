
package com.rdtech.tracker_api.observer.container;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.rdtech.tracker_api.event.container.ContainerChangedVehicleEvent;

/**
 *****
 * @date 21/02/2015
 * @author roberto-xz
 *****
 */

@Component
public class ContainerChangedVehicleObserver {
    @EventListener
    public void run(ContainerChangedVehicleEvent event){
        
    }
}
