
package com.rdtech.tracker_api.event.container;
import org.springframework.context.ApplicationEvent;

/**
 *****
 * @date 21/02/2015
 * @author roberto-xz
 *****
 */
public class ContainerChangedVehicleEvent  extends ApplicationEvent{
   private final Long containerId;
   private final Long vehicleId;

   public ContainerChangedVehicleEvent(Object source, Long c, long v){
      super(source);
      this.containerId = c;
      this.vehicleId = v;
   }

   public Long getContainerId() {return containerId;}
   public Long getVehicleId() {return vehicleId;}
}
