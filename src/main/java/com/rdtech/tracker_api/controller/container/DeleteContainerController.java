
package com.rdtech.tracker_api.controller.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.container.ContainerDeletedResponseDto;
import com.rdtech.tracker_api.service.container.DeleteContainerService;

@RestController
@RequestMapping("/api/container")
public class DeleteContainerController {
    @Autowired
    DeleteContainerService deleteContainer;
    
    @DeleteMapping("/delete/{containerID}") // delete
    public ContainerDeletedResponseDto run(@PathVariable  Long containerID) {
        ContainerDeletedResponseDto res = this.deleteContainer.run(containerID);
        return res;
    }
}