

package com.rdtech.tracker_api.controller.publics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.dto.packages.PackageTrackerResponseDto;
import com.rdtech.tracker_api.service.Packages.TrackerPackageService;

/**
 *****
 * @date 23/02/2015
 * @author roberto-xz
 *****
 */
@RestController
@RequestMapping("/api/public/")
public class TrackerPackageController {
    
    @Autowired
    TrackerPackageService trackerPackage;

    @GetMapping("/package/tracker/{trackerCode}")
    public List<PackageTrackerResponseDto> run(@PathVariable String trackerCode) {
        List<PackageTrackerResponseDto> res = trackerPackage.run(trackerCode);
        return res;
    }
}
