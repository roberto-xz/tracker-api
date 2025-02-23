package com.rdtech.tracker_api.service.vehicle;

import com.rdtech.tracker_api.dto.vehicle.VehicleDeletedResponseDto;
import com.rdtech.tracker_api.entity.VehicleEntity;
import com.rdtech.tracker_api.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 * @date 23/02/2025
 * @author Juci-x
 *
 **/

@Service
public class DeleteVehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public DeleteVehicleService(VehicleRepository rep) {
        this.vehicleRepository = rep;
    }

    public VehicleDeletedResponseDto run(Long vehicleId) {
        Optional<VehicleEntity> vehicle = vehicleRepository.findById(vehicleId);
        VehicleDeletedResponseDto resp = new VehicleDeletedResponseDto();

        if (vehicle.isPresent()) {
            vehicleRepository.deleteById(vehicleId);
            resp.setMessage("Veículo deletado");
            resp.setStatusCode(200);
            return resp;
        }else{
            resp.setMessage("Veículo não encontrado");
            resp.setStatusCode(404);
            return resp;
        }
    }
}
