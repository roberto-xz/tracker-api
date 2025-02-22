
package com.rdtech.tracker_api.controller.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.vehicle.VehicleCreateRequestDto;
import com.rdtech.tracker_api.dto.vehicle.VehicleCreatedResponseDto;
import com.rdtech.tracker_api.service.vehicle.CreateVehicleService;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@RestController
@RequestMapping("/api/vehicle")
public class CreateVehicleController {

    @Autowired
    CreateVehicleService createVehicleService;
    
    @PostMapping("/create")
    public VehicleCreatedResponseDto run(@RequestBody VehicleCreateRequestDto req){
        VehicleCreatedResponseDto resp = createVehicleService.run(req);

        if (resp.getStatusCode() == 200){}
        return resp;
    }
}
