

package com.rdtech.tracker_api.service.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.driver.DriverCreateRequestDto;
import com.rdtech.tracker_api.dto.driver.DriverCreatedResponseDto;
import com.rdtech.tracker_api.entity.Driver;
import com.rdtech.tracker_api.repository.DriverRepository;

@Service
public class CreateDriverService {
    private final DriverRepository driverRepository;

    @Autowired
    public CreateDriverService(DriverRepository rep) {
        this.driverRepository = rep;
    }
    
    public DriverCreatedResponseDto run(DriverCreateRequestDto req) {
        // criando as dependencias do serviço
        // resp, DTO para retorno
        // driver, model que representa as colunas do banco de dados de um motorista
        DriverCreatedResponseDto resp = new DriverCreatedResponseDto();
        Driver driver = new Driver();

        /* Criando model Driver na "unha" com informações vindas
        do DTO de request */
        driver.setDriverFullName(req.getDriverFullName());
        driver.setDriverRegisterCode(req.getDriverRegisterCode());
        driver.setDriverDateOfBirth(req.getDriverDateOfBirth());

        
        // verifica se o codigo de registro do motorista já foi cadastrado
        if (driverRepository.existsByDriverRegisterCode(req.getDriverRegisterCode())){
            resp.setDriverId(-1L);
            resp.setStatusCode(409); // erro de conflito
            return resp;
        }else {
            // Salvando dados do motorista no banco de dados
            Driver createdDriver = driverRepository.save(driver);
        
            // craindo DTO de resposta
            resp.setDriverId(createdDriver.getDriverId());
            resp.setStatusCode(201);
            return resp;
        }
    }
}
