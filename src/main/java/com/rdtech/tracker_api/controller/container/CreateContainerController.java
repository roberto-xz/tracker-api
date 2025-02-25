
package com.rdtech.tracker_api.controller.container;

import com.rdtech.tracker_api.dto.container.ContainerCreateRequestDto;
import com.rdtech.tracker_api.dto.container.ContainerCreatedResponseDto;
import com.rdtech.tracker_api.service.container.CreateContainerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/container")
public class CreateContainerController {
    @Autowired
    CreateContainerService createService;
    
    @PostMapping("/create")
    public  ContainerCreatedResponseDto run(@RequestBody ContainerCreateRequestDto req){
        ContainerCreatedResponseDto res = this.createService.run(req);
        return res;
    }
}
