package com.rdtech.tracker_api.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.driver.DriverCheckinRequestDto;
import com.rdtech.tracker_api.dto.driver.DriverCheckinResponseDto;
import com.rdtech.tracker_api.service.driver.MakeCheckInService;

@RestController
@RequestMapping("/api/driver")
public class MakeCheckInController {
    
    @Autowired
    MakeCheckInService chekin;
    
    @PutMapping("/checkin")
    public DriverCheckinResponseDto run(@RequestBody DriverCheckinRequestDto req) {
        return this.chekin.run(req);
    }
}
