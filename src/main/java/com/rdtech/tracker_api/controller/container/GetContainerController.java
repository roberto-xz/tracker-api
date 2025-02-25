

package com.rdtech.tracker_api.controller.container;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.container.ContainerGetResponseDto;
import com.rdtech.tracker_api.service.container.GetContainerService;

@RestController
@RequestMapping("/api/container")
public class GetContainerController {
    @Autowired
    GetContainerService getContainer;
    
    @GetMapping("/get/{containerId}")
    public Object run(@PathVariable  Long containerId) {
        ContainerGetResponseDto res = this.getContainer.run(containerId);
        
        if (res == null) {
            Map<String,Object> response = Map.of("message", "Container não encontrado","StatusCode", 404);
            return response;
        }
        
        return res;
    }
}