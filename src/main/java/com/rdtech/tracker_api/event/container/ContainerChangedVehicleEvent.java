
package com.rdtech.tracker_api.event.container;
import org.springframework.context.ApplicationEvent;
import com.rdtech.tracker_api.entity.ContainerEntity;
import com.rdtech.tracker_api.entity.VehicleEntity;

/**
 *****
 * @date 21/02/2015
 * @author roberto-xz
 *****
 */
public class ContainerChangedVehicleEvent  extends ApplicationEvent{
   private final ContainerEntity containerEntity;
   private final VehicleEntity vehicleEntity;

   public ContainerChangedVehicleEvent(Object source, ContainerEntity c, VehicleEntity v){
      super(source);
      this.containerEntity = c;
      this.vehicleEntity = v;
   }
      
   public ContainerEntity getContainer(){return this.containerEntity;}
   public VehicleEntity getVehicle(){return this.vehicleEntity;}
}
