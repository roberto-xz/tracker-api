
package com.rdtech.tracker_api.service.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.driver.DriverCheckinRequestDto;
import com.rdtech.tracker_api.dto.driver.DriverCheckinResponseDto;
import com.rdtech.tracker_api.entity.HistoricOfTransportEntity;
import com.rdtech.tracker_api.repository.DriverRepository;
import com.rdtech.tracker_api.repository.HistoricOfTransportRepository;
import com.rdtech.tracker_api.repository.VehicleRepository;

@Service
public class MakeCheckInService {
    private final HistoricOfTransportRepository historic;
    private final VehicleRepository vehicle;
    private final DriverRepository   driver;

    @Autowired
    public MakeCheckInService(HistoricOfTransportRepository historic, VehicleRepository vehicle, DriverRepository driver) {
        this.historic = historic;
        this.vehicle = vehicle;
        this.driver = driver;
    }


    public DriverCheckinResponseDto run(DriverCheckinRequestDto req) {
        DriverCheckinResponseDto res = new DriverCheckinResponseDto();
        HistoricOfTransportEntity transpotEntity = new HistoricOfTransportEntity();

        Long driverId = req.getDriverId();
        Long vehicleId = req.getVehicleId();

        if (!this.driver.existsById(driverId )) {
            res.setMessage("O motorista não foi encontrado");
            res.setStatusCode(404);
            return res;
        }

        if (!this.vehicle.existsById(vehicleId)) {
            res.setMessage("O Véiculo não foi encontrado");
            res.setStatusCode(404);
            return res;
        }

        transpotEntity.setVehicleId(req.getVehicleId());
        transpotEntity.setDriverId(req.getDriverId());
        transpotEntity.setStateLastCheckin(req.getStateCheckin());
        transpotEntity.setCityLastCheckin(req.getCityCheckin());
        transpotEntity.setStateDestine(req.getStateDestine());
        transpotEntity.setCityDestine(req.getCityDestine());
        transpotEntity.setDateArrived(req.getDateArrived());
        transpotEntity.setDateLeave(req.getDateLeave());
        transpotEntity.setEstimatedTimeToNextStop(req.getEstimatedTime2Nstop());
        transpotEntity.setCityDestine(req.getCityDestine());
        transpotEntity.setStatusId( -1L);

        this.historic.save(transpotEntity);
        res.setMessage("Checkin realizado");
        res.setStatusCode(200);
        return res;

    }
}
