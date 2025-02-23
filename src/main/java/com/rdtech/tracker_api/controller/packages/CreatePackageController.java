
package com.rdtech.tracker_api.controller.packages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.packages.PackageCreateRequestDto;
import com.rdtech.tracker_api.dto.packages.PackageCreatedResponseDto;
import com.rdtech.tracker_api.service.Packages.CreatePackageService;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@RestController
@RequestMapping("/api/package")
public class CreatePackageController {
    
    @Autowired
    CreatePackageService createPackage;

    @PostMapping("/create")
    public PackageCreatedResponseDto run(@RequestBody PackageCreateRequestDto req) {
        PackageCreatedResponseDto res = createPackage.run(req);
        if (res.getStatusCode() == 200){}
        return res;
    }
}
