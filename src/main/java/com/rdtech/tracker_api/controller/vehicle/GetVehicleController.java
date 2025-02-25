package com.rdtech.tracker_api.controller.vehicle;

import com.rdtech.tracker_api.service.vehicle.GetVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @date 23/02/2025
 * @author Juci-x
 *
 **/

@RestController
@RequestMapping("/api/vehicle")
public class GetVehicleController {
    @Autowired
    GetVehicleService getVehicle;

    @GetMapping("/get/{vehicleId}")
    public Object run(@PathVariable Long vehicleId) {
        return getVehicle.run(vehicleId);
    }
}
