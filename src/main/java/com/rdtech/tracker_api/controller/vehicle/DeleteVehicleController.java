package com.rdtech.tracker_api.controller.vehicle;

import com.rdtech.tracker_api.dto.vehicle.VehicleDeletedResponseDto;
import com.rdtech.tracker_api.service.vehicle.DeleteVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class DeleteVehicleController {
    @Autowired
    DeleteVehicleService deleteVehicle;

    @DeleteMapping("/delete/{vehicleId}")
    public VehicleDeletedResponseDto run(@PathVariable Long vehicleId) {
        VehicleDeletedResponseDto resp = deleteVehicle.run(vehicleId);
        if(resp.getStatusCode() == 200) {}
        return resp;
    }
}
