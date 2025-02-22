

package com.rdtech.tracker_api.controller.packages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.packages.PackageUpdateRequestDto;
import com.rdtech.tracker_api.dto.packages.PackageUpdatedResponseDto;
import com.rdtech.tracker_api.service.Packages.UpdatePackageService;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */
@RestController
@RequestMapping("/api/package")
public class UpdatePackageController {
    
    @Autowired
    UpdatePackageService packageService;

    @PutMapping("/update")
    public PackageUpdatedResponseDto run(@RequestBody PackageUpdateRequestDto req) {
        PackageUpdatedResponseDto res = packageService.run(req);
        if (res.getStatusCode() == 200){}
        return res;
    }
}
