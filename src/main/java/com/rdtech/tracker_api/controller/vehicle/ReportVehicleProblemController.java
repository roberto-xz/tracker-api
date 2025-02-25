package com.rdtech.tracker_api.controller.vehicle;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdtech.tracker_api.service.vehicle.ReportVehicleProblemService;

@RestController
@RequestMapping("/api/vehicle")
public class ReportVehicleProblemController {
    ReportVehicleProblemService reportProblem;


    @PutMapping("/{vehicleId}/report/problem/{problemLevel}")
    public Object run(@PathVariable long vehicleId, @PathVariable Integer problemLevel){
        return this.reportProblem.run(vehicleId,problemLevel);
    }
}
