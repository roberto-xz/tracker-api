
package com.rdtech.tracker_api.service.driver;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rdtech.tracker_api.dto.driver.DriverGetResponseDto;
import com.rdtech.tracker_api.entity.Driver;
import com.rdtech.tracker_api.repository.DriverRepository;

/**
 *****
 * @date 21/02/2015
 * @author roberto-xz
 *****
 */

@Service
public class GetDriverService {
    private final DriverRepository driverRepository;
    @Autowired
    public GetDriverService(DriverRepository resp) {
        this.driverRepository = resp;
    }

    public DriverGetResponseDto run(Long driverId) {
        Optional<Driver> driver = driverRepository.findById(driverId);
        DriverGetResponseDto resp = new DriverGetResponseDto();

        if (driver.isPresent()) {
            resp.setDriverId(driverId);
            resp.setDriverFullName(driver.get().getDriverFullName());
            resp.setDriverRegisterCode(driver.get().getDriverRegisterCode());
            resp.setDriverDateOfBirth(driver.get().getDriverDateOfBirth());
            return resp;
        }

        resp.setDriverFullName("Driver not found");
        resp.setDriverDateOfBirth("Driver not found");
        resp.setDriverId(-1L);
        return resp;
    }
}
