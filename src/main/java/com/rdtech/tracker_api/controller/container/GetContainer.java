

package com.rdtech.tracker_api.controller.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/container")
public class GetContainer {
    @GetMapping("/get/{containerID}") // get
    public String run(@PathVariable  int containerID) {
        return "response for getContainer: "+containerID;
    }
}