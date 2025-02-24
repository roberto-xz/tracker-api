package com.rdtech.tracker_api.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.driver.SetDriverInVehicleRequestDto;
import com.rdtech.tracker_api.dto.driver.SetDriverInVehicleResponseDto;
import com.rdtech.tracker_api.service.driver.SetDriverInVehicleService;

@RestController
@RequestMapping("/api/driver/set")
public class SetDriverInVehicleController {
    
    @Autowired
    SetDriverInVehicleService setDVService;
    
    @PutMapping("/vehicle")
    public SetDriverInVehicleResponseDto run(@RequestBody SetDriverInVehicleRequestDto req){
        SetDriverInVehicleResponseDto res = this.setDVService.run(req);
        return res;   
    } 
}
