package com.rdtech.tracker_api.controller.driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.driver.DriverCreateRequestDto;
import com.rdtech.tracker_api.dto.driver.DriverCreatedResponseDto;
import com.rdtech.tracker_api.service.driver.CreateDriverService;


@RestController
@RequestMapping("/api/driver")
public class CreateDriverController {
    @Autowired
    private CreateDriverService createDriver;

    
    @PostMapping("/create") // post
    public DriverCreatedResponseDto run(@RequestBody DriverCreateRequestDto req) {
        
        /*  Atribue a reponsabilidade de criação para o serviço.
            Passando como argumento um DTO de request, e espera
            um DTO de response 
        */ 

        DriverCreatedResponseDto resp = createDriver.run(req);
        
        if (resp.getStatusCode() == 201 ) {
            /*
                emitir os enventos aquí, para os observers. Pois
                Nesse ponto há uma garantia que o serviço segui
                sua rotina de forma esperada.
            */
        }
        return resp;
    }
}
