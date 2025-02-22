
package com.rdtech.tracker_api.service.vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.vehicle.VehicleCreateRequestDto;
import com.rdtech.tracker_api.dto.vehicle.VehicleCreatedResponseDto;
import com.rdtech.tracker_api.entity.VehicleEntity;
import com.rdtech.tracker_api.repository.VehicleRepository;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@Service
public class CreateVehicleService {
    private final VehicleRepository vehicleRepository;
    
    @Autowired
    public CreateVehicleService(VehicleRepository repo) {
        this.vehicleRepository = repo;
    }

    public VehicleCreatedResponseDto run(VehicleCreateRequestDto req) {
        VehicleCreatedResponseDto resp = new VehicleCreatedResponseDto();
        VehicleEntity vehicle = new VehicleEntity();

        // verifica se já existe um véiculo com a mesma placa
        if (vehicleRepository.existsByVehiclePlate(req.getVehiclePlate()) == false) {
            vehicle.setVehicleType(req.getVehicleType());
            vehicle.setVehiclePlate(req.getVehiclePlate());
            vehicle.setVehicleCapacity(req.getVehicleCapacity());
            vehicle.setDriverId(-1L);

            VehicleEntity vehicleCreated = vehicleRepository.save(vehicle);
            resp.setVehicleId(vehicleCreated.getVehicleId());
            resp.setStatusCode(200);
            return resp;
        }
        
        resp.setVehicleId(-1L);
        resp.setStatusCode(409);
        return resp;
    }
}
