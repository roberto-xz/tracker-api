package com.rdtech.tracker_api.controller.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.service.container.ChangeContainerVehicleService;

@RestController
@RequestMapping("/api/container")
public class ChangeContainerVehicleController {
    
    @Autowired
    ChangeContainerVehicleService change;

    @PutMapping("/change/vehicle/{containerId}/{vehicleId}")
    public Object run(@PathVariable Long containerId, @PathVariable Long vehicleId) {
        return this.change.run(containerId, vehicleId);
    }
}
