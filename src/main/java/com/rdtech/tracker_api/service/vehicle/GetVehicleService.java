package com.rdtech.tracker_api.service.vehicle;

import com.rdtech.tracker_api.dto.vehicle.VehicleGetResponseDto;
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
public class GetVehicleService {
    private final VehicleRepository vehicleRepository;



    @Autowired
    public GetVehicleService(VehicleRepository resp) {
        this.vehicleRepository = resp;
    }

    public VehicleGetResponseDto run(Long vehicleId) {
        Optional<VehicleEntity> vehicle = vehicleRepository.findById(vehicleId);
        VehicleGetResponseDto resp = new VehicleGetResponseDto();

        if (vehicle.isPresent()) {

            resp.setVehicleId(vehicle.get().getVehicleId());
            resp.setDriverID(vehicle.get().getDriverId());
            resp.setVehicleType(vehicle.get().getVehicleType());
            resp.setVehiclePlate(vehicle.get().getVehiclePlate());
            resp.setVehicleCapacity(vehicle.get().getVehicleCapacity());
            resp.setVehicleAsProblem(vehicle.get().getVehicleAsProblem());
            resp.setVehicleProblemLevel(vehicle.get().getVehicleProblemLevel());
            //resp.setHistoric(List<HistoricOfTransportDto>historic); //não consegui add

            return resp;
        }else{
            resp.setVehicleId(-1L);
            return resp;

        }
    }


}
