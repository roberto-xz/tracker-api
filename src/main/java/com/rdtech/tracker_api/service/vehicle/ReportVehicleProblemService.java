
package com.rdtech.tracker_api.service.vehicle;
import java.util.Map;
import java.util.Optional;

import com.rdtech.tracker_api.entity.VehicleEntity;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.repository.VehicleRepository;

@Service
public class ReportVehicleProblemService {
    private final VehicleRepository vehicle;
    
    
    public ReportVehicleProblemService(VehicleRepository vehicle) {
        this.vehicle = vehicle;
    }


    public Map<String,Object> run(long vehicleId, Integer problemLevel){
        //busca o veiculo pelo Id
        Optional<VehicleEntity> optionalVehicle = vehicle.findById(vehicleId);

        //verifica se o veiculo foi encontrado
        if(optionalVehicle.isEmpty()){
            return Map.of("message", "Veículo não encontrado","StatusCode", 404);
        }

        //Atualiza os campos veiculo
        VehicleEntity vehicleEntity = optionalVehicle.get();
        vehicleEntity.setVehicleAsProblem(true);
        vehicleEntity.setVehicleProblemLevel(problemLevel);

        //salva as alterações
        vehicle.save(vehicleEntity);

        //retorna mensagem de sucesso
        return Map.of("message", "Problema reportado com sucesso","StatusCode", 200);
    }
}
