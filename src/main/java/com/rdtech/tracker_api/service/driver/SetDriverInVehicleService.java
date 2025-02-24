package com.rdtech.tracker_api.service.driver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.driver.SetDriverInVehicleRequestDto;
import com.rdtech.tracker_api.dto.driver.SetDriverInVehicleResponseDto;
import com.rdtech.tracker_api.entity.Driver;
import com.rdtech.tracker_api.entity.VehicleEntity;
import com.rdtech.tracker_api.repository.DriverRepository;
import com.rdtech.tracker_api.repository.VehicleRepository;

/**
 *****
 * @date 24/02/2015
 * @author roberto-xz
 *****
 */
@Service
public class SetDriverInVehicleService {
    private final VehicleRepository vehicleRepository;
    private final DriverRepository  driverRepository;

    @Autowired
    public SetDriverInVehicleService(VehicleRepository v, DriverRepository d) {
        this.vehicleRepository = v;
        this.driverRepository = d;
    }

    public SetDriverInVehicleResponseDto run(SetDriverInVehicleRequestDto req) {
        Optional<VehicleEntity> vehicle = this.vehicleRepository.findById(req.getVehicleId());
        Optional<Driver> driver = this.driverRepository.findById(req.getDriverId());
        SetDriverInVehicleResponseDto resp = new SetDriverInVehicleResponseDto();
        
        if(!vehicle.isPresent()){
            resp.setMessage("Veículo não Encontado");
            resp.setStatusCode(404);
            return resp;
        } 

        if (!driver.isPresent()){
            resp.setMessage("Motorista não Encontado");
            resp.setStatusCode(404);
            return resp;
        }

        VehicleEntity tempVehicle = vehicle.get();
        tempVehicle.setDriverId(req.getDriverId());

        resp.setMessage("O motorista foi vinculado o veículo com sucesso");
        resp.setStatusCode(200);
        return resp;
    }
}
