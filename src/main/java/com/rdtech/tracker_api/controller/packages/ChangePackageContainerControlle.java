package com.rdtech.tracker_api.controller.packages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.service.Packages.ChangePackageContainerService;

@RestController
@RequestMapping("/api/package")
public class ChangePackageContainerControlle {
    
    @Autowired
    ChangePackageContainerService changeContainer;

    @PutMapping("/change/container/{containerId}/{packageId}")
    public Object run(@PathVariable Long containerId, @PathVariable Long packageId) {
        return this.changeContainer.run(packageId, containerId);
    }
}
