
package com.rdtech.tracker_api.service.vehicle;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.repository.VehicleRepository;

@Service
public class ReportVehicleProblemService {
    private final VehicleRepository vehicle;
    
    
    public ReportVehicleProblemService(VehicleRepository vehicle) {
        this.vehicle = vehicle;
    }


    public Object run(long vehicleId, Integer problemLevel){
        Map<String,Object> response = Map.of("message", "Veículo não encontrado","StatusCode", 404);
        return response;
    }
}
