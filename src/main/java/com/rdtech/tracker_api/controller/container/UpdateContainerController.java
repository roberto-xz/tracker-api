
package com.rdtech.tracker_api.controller.container;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.container.ContainerUpdateRequestDto;
import com.rdtech.tracker_api.dto.container.ContainerUpdatedResponseDto;
import com.rdtech.tracker_api.service.container.UpdateContainerService;

@RestController
@RequestMapping("/api/container")
public class UpdateContainerController {
    
    @Autowired
    UpdateContainerService updateContainer;
    
    @PutMapping("/update") 
    public ContainerUpdatedResponseDto run(@RequestBody ContainerUpdateRequestDto req) {
        return this.updateContainer.run(req);
    }
}

