
package com.rdtech.tracker_api.observer.container;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.rdtech.tracker_api.entity.HistoricOfContainerEntity;
import com.rdtech.tracker_api.event.container.ContainerChangedVehicleEvent;
import com.rdtech.tracker_api.repository.HistoricOfContainerRepository;

/**
 *****
 * @date 21/02/2015
 * @author roberto-xz
 *****
 */

@Component
public class ContainerChangedVehicleObserver {

    private final HistoricOfContainerRepository historic;
    

    public ContainerChangedVehicleObserver(HistoricOfContainerRepository historic) {
        this.historic = historic;
    }


    @EventListener
    public void run(ContainerChangedVehicleEvent event){
       HistoricOfContainerEntity historic = new HistoricOfContainerEntity();
       historic.setCityChanged("uknow");
       historic.setStateChanged("uknow");
       historic.setDateArrived("00-00-00 00:00 PM");
       historic.setDataLeave("00-00-00 00:00 PM");
       historic.setDataVehicleChanged("00-00-00 00:00 PM");
       historic.setChangedOfVehicles(2);
       historic.setContainerId(event.getContainerId());
       historic.setVehicleId(event.getVehicleId());
       
       this.historic.save(historic);
    }
}
