
package com.rdtech.tracker_api.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rdtech.tracker_api.dto.driver.DriverGetResponseDto;
import com.rdtech.tracker_api.service.driver.GetDriverService;


/**
 *****
 * @date 21/02/2015
 * @author roberto-xz
 *****
 */

@RestController
@RequestMapping("/api/driver")
public class GetDriverController {
    @Autowired
    GetDriverService getDriver;

    @GetMapping("/get/{driverId}")
    public DriverGetResponseDto run(@PathVariable Long driverId) {
        DriverGetResponseDto resp = getDriver.run(driverId);
        
        if (resp.getDriverId() == -1) {}
        return resp;
    }
}
