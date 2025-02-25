package com.rdtech.tracker_api.controller.container;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.service.container.ChangeContainerStatusService;

@RestController
@RequestMapping("/api/container")
public class ChangeContainerStatusController {
    
    @Autowired
    ChangeContainerStatusService changeStatus;
    
    @PutMapping("/change/status/{containerId}/{status}")
    public Object run(@PathVariable Long containerId, @PathVariable String status) {
        Object res = this.changeStatus.run(containerId, status);
        
        if (res == null ) {
            Map<String,Object> response = Map.of("message", "Container não encontrado","StatusCode", 404);
            return response;
        }

        Map<String,Object> response = Map.of("message", "Status do container foi Atualizado","StatusCode", 200);
        return response;
    }
}
