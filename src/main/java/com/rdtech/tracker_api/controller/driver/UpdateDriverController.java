
package com.rdtech.tracker_api.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.driver.DriverUpdateRequestDto;
import com.rdtech.tracker_api.dto.driver.DriverUpdatedResponseDto;
import com.rdtech.tracker_api.service.driver.UpdateDriverService;

@RestController
@RequestMapping("/api/driver")
public class UpdateDriverController {
    
    @Autowired
    private UpdateDriverService updateDriver;

    @PutMapping("/update")
    public DriverUpdatedResponseDto run(@RequestBody DriverUpdateRequestDto req) {
        DriverUpdatedResponseDto resp = updateDriver.run(req);
                
        if (resp.getStatusCode() == 200 ) {/*disparar enventos*/}
        return resp;
    }
}
