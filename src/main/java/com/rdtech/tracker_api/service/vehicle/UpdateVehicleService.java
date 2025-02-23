package com.rdtech.tracker_api.service.vehicle;

import com.rdtech.tracker_api.dto.vehicle.VehicleGetResponseDto;
import com.rdtech.tracker_api.dto.vehicle.VehicleUpdateRequestDto;
import com.rdtech.tracker_api.dto.vehicle.VehicleUpdatedResponseDto;
import com.rdtech.tracker_api.entity.Driver;
import com.rdtech.tracker_api.entity.VehicleEntity;
import com.rdtech.tracker_api.repository.DriverRepository;
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
public class UpdateVehicleService {
    private final VehicleRepository vehicleRepository;
    private final DriverRepository driverRepository;

    @Autowired
    public UpdateVehicleService(VehicleRepository veRep, DriverRepository driRep) {
        this.vehicleRepository = veRep;
        this.driverRepository = driRep;
    }

    public VehicleUpdatedResponseDto run(VehicleUpdateRequestDto req){
        VehicleUpdatedResponseDto resp = new VehicleUpdatedResponseDto();

        //Verificando se o veículo existe
        Optional<VehicleEntity>vehicleExist = vehicleRepository.findById(req.getVehicleId());

        if(!vehicleExist.isPresent()){
            resp.setMessagem("Veículo não encontrado");
            resp.setStatusCode(404);
            return resp;
        }

        //Obtem Ve[iculo existente
        VehicleEntity vehicle = vehicleExist.get();

        //Verificando se o motorista existe
        if(req.getDriverID() != null) {
            Optional<Driver> driverExist = driverRepository.findById(req.getDriverID());
            if (!driverExist.isPresent()) {
                resp.setMessagem("Motorista não encontrado");
                resp.setStatusCode(404);
                return resp;
            }

            //Atribui o motorista ao veiculo
            vehicle.setDriverId(req.getDriverID());
        }

        //Atualiza os Campos
        if(req.getVehicleAsProblem() != null) {
            vehicle.setVehicleAsProblem(req.getVehicleAsProblem());
        }
        if(req.getVehicleProblemLevel() != null) {
            vehicle.setVehicleProblemLevel(req.getVehicleProblemLevel());
        }

        //Salva as alterações no BD
        vehicleRepository.save(vehicle);
        resp.setMessagem("Veículo atualizado com sucesso");
        resp.setStatusCode(200);
        return resp;
    }
}
