
package com.rdtech.tracker_api.service.Packages;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.packages.PackageTrackerResponseDto;
import com.rdtech.tracker_api.entity.HistoricOfContainerEntity;
import com.rdtech.tracker_api.entity.HistoricOfPackageEntity;
import com.rdtech.tracker_api.entity.HistoricOfTransportEntity;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.repository.HistoricOfContainerRepository;
import com.rdtech.tracker_api.repository.HistoricOfPackageRepository;
import com.rdtech.tracker_api.repository.HistoricOfTransportRepository;
import com.rdtech.tracker_api.repository.PackageRepository;

/**
 *****
 * @date 23/02/2015
 * @author roberto-xz
 *****
 */

@Service
public class TrackerPackageService {
    private final PackageRepository pkgRepo;
    private final HistoricOfPackageRepository   pkgHistoric; // para obeter os containers
    private final HistoricOfContainerRepository cntHistoric; // para obter os veiculos
    private final HistoricOfTransportRepository trsHistoric; // para obter os check-ins
    
    @Autowired
    public TrackerPackageService(
            PackageRepository pkgRepo, 
            HistoricOfPackageRepository pkgHistoric,
            HistoricOfContainerRepository cntHistoric, 
            HistoricOfTransportRepository trsHistoric) {
        this.pkgRepo = pkgRepo;
        this.pkgHistoric = pkgHistoric;
        this.cntHistoric = cntHistoric;
        this.trsHistoric = trsHistoric;
    }

    public List<PackageTrackerResponseDto> run(String trackerCode) {
        List<PackageTrackerResponseDto> res = new ArrayList<>();

        List<HistoricOfPackageEntity> historicPackageList; // lista para salvar o historico dos pacotes
        List<Long> vehiclesIdList = new ArrayList<>();     // lista para salvar os ids dos veículo.

        // verifica se há um pacote com o código de rastreio fornecido.
        if (pkgRepo.existsByTrackerCode(trackerCode)) {
            PackageEntity pkg = pkgRepo.getByTrackerCode(trackerCode); // obtém o pacote
            
            // obtem o histórico do pacote
            historicPackageList = pkgHistoric.findByPackageId(pkg.getPackageId());
            
            // para cada container no histórico, pega o id do véiculo
            // e salva em uma lista
            historicPackageList.forEach(row -> {
                Long containerId = row.getContainerId();
                Optional<HistoricOfContainerEntity> container = cntHistoric.findById(containerId);
                
                if (container.isPresent()) {
                    vehiclesIdList.add(container.get().getContainerId());
                }
            });

            // se a lista de veículos não for vazia
            if (!vehiclesIdList.isEmpty()) {
                vehiclesIdList.forEach(vehicleId -> {
                    HistoricOfTransportEntity transport = trsHistoric.getByVehicleId(vehicleId);
                    PackageTrackerResponseDto rowAuxDto = new PackageTrackerResponseDto();
                    
                    if (transport != null) {
                        rowAuxDto.setStateLastCheckin(transport.getStateLastCheckin());
                        rowAuxDto.setCityLastCheckin(transport.getCityLastCheckin());
                        rowAuxDto.setStateDestine(transport.getStateDestine());
                        rowAuxDto.setCityDestine(transport.getCityDestine());
                        rowAuxDto.setDateArrived(transport.getDateArrived());
                        rowAuxDto.setDateLeave(transport.getDateLeave());
                        rowAuxDto.setEstimatedTime2Nstop(transport.getEstimatedTimeToNextStop());
                    }
                    res.add(rowAuxDto);
                });
                return res;
            }
        }
        return null;
    }
}
