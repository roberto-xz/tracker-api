package com.rdtech.tracker_api.controller.vehicle;


import com.rdtech.tracker_api.dto.vehicle.VehicleUpdateRequestDto;
import com.rdtech.tracker_api.dto.vehicle.VehicleUpdatedResponseDto;
import com.rdtech.tracker_api.service.vehicle.UpdateVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
public class UpdateVehicleController {
    @Autowired
    private UpdateVehicleService updateVehicle;
    @PutMapping("/update")
    public VehicleUpdatedResponseDto run(@RequestBody VehicleUpdateRequestDto req) {
        VehicleUpdatedResponseDto resp = updateVehicle.run(req);

        if(resp.getStatusCode() == 200) {}
        return resp;
    }
}
