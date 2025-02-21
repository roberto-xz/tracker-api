package com.rdtech.tracker_api.service.driver;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.driver.DriverUpdateRequestDto;
import com.rdtech.tracker_api.dto.driver.DriverUpdatedResponseDto;
import com.rdtech.tracker_api.entity.Driver;
import com.rdtech.tracker_api.repository.DriverRepository;

@Service
public class UpdateDriverService {
    private final DriverRepository driverRepository;

    @Autowired
    public UpdateDriverService(DriverRepository rep) {
        this.driverRepository = rep;
    }

    public DriverUpdatedResponseDto run(DriverUpdateRequestDto req) {
        DriverUpdatedResponseDto resp = new DriverUpdatedResponseDto(); 
        
        // Procura o motorista por o ID
        Optional<Driver> driverExist = driverRepository.findById(req.getDriverId());
        
        // se o motorista existe
        if (driverExist.isPresent()) {
            // obtem o model do motorista encontrado
            Driver driver = driverExist.get();

            // atualizando as informações
            driver.setDriverFullName(req.getDriverFullName());
            driver.setDriverDateOfBirth(req.getDriverDateOfBirth());

            driverRepository.save(driver);
            resp.setMessagem("Os dados do motorista foram atualizados");
            resp.setStatusCode(200);
            return resp;

        } else {
            resp.setMessagem("O motorista não está registrado");
            resp.setStatusCode(404);
            return resp;
        }
    }
}
