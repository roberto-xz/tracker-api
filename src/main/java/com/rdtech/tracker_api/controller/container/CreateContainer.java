
package com.rdtech.tracker_api.controller.container;

import com.rdtech.tracker_api.service.container.CreateContainerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/container")
public class CreateContainer {
    
    @GetMapping("/create") // post
    public String run(){
        CreateContainerService createService = new CreateContainerService();
        String respService = createService.run();
        return "Container Created: "+respService;
    }
}
