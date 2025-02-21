
package com.rdtech.tracker_api.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.driver.DriverDeletedResponseDto;
import com.rdtech.tracker_api.service.driver.DeleteDriverService;

/**
 *****
 * @date 21/02/2015
 * @author roberto-xz
 *****
 */

@RestController
@RequestMapping("/api/driver")
public class DeleteDriverController {
    
    @Autowired
    DeleteDriverService deleteDriver;

    @DeleteMapping("/delete/{driverId}")
    public DriverDeletedResponseDto run(@PathVariable Long driverId) {
        DriverDeletedResponseDto resp = deleteDriver.run(driverId);
        if (resp.getStatusCode() == 200 ){}
        return resp;
    }
}
