
package com.rdtech.tracker_api.controller.packages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rdtech.tracker_api.service.Packages.DeletePackageService;


/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@RestController
@RequestMapping("/api/package")
public class DeletePackageController {

    @Autowired
    DeletePackageService deletePackage;

    @DeleteMapping("/delete/{packageId}")
    public Object run(@PathVariable Long packageId) {
        return deletePackage.run(packageId);
    }
}
