
package com.rdtech.tracker_api.controller.packages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.packages.PackageGetRequestDto;
import com.rdtech.tracker_api.dto.packages.PackageGetResponseDto;
import com.rdtech.tracker_api.service.Packages.GetPackageService;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@RestController
@RequestMapping("/api/package")
public class GetPackageController {
    @Autowired
    GetPackageService getPackage;
    
    @GetMapping("/get")
    public PackageGetResponseDto run(@RequestBody PackageGetRequestDto req) {
        PackageGetResponseDto res = getPackage.run(req);
        return res;
    }
}
