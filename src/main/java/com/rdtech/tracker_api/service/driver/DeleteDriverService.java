
package com.rdtech.tracker_api.service.driver;

import java.util.Optional;
import com.rdtech.tracker_api.entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rdtech.tracker_api.dto.driver.DriverDeletedResponseDto;
import com.rdtech.tracker_api.repository.DriverRepository;

/**
 *****
 * @date 21/02/2015
 * @author roberto-xz
 *****
 */

@Service
public class DeleteDriverService {
    private final DriverRepository driverRepository;
    
    @Autowired
    public DeleteDriverService(DriverRepository resp) {
        this.driverRepository = resp;
    }

    public DriverDeletedResponseDto run(Long driverId) {
        Optional<Driver> driver = driverRepository.findById(driverId);
        DriverDeletedResponseDto resp = new DriverDeletedResponseDto();

        if (driver.isPresent()) {
            driverRepository.deleteById(driverId);
            resp.setMessagem("O motorista foi excluido");
            resp.setStatusCode(200);
            return resp;
        }

        resp.setMessagem("Motorista não encontrado");
        resp.setStatusCode(404);
        return resp;
    }
}
