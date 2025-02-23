
package com.rdtech.tracker_api.service.Packages;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.historics.HistoricOfPackageDto;
import com.rdtech.tracker_api.dto.packages.PackageGetRequestDto;
import com.rdtech.tracker_api.dto.packages.PackageGetResponseDto;
import com.rdtech.tracker_api.entity.HistoricOfPackageEntity;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.repository.HistoricOfPackageRepository;
import com.rdtech.tracker_api.repository.PackageRepository;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@Service
public class GetPackageService {
    PackageRepository packageRepository;
    HistoricOfPackageRepository historicPackageRepository;

    @Autowired
    public GetPackageService(PackageRepository r, HistoricOfPackageRepository h) {
        this.packageRepository = r;
        this.historicPackageRepository = h;
    }

    public PackageGetResponseDto run(PackageGetRequestDto req) {
        PackageGetResponseDto res = new PackageGetResponseDto();
        List<HistoricOfPackageDto> historicDto = new ArrayList<>();

        Optional<PackageEntity> packageById = packageRepository.findById(req.getPackageId());
        
        if (packageById.isPresent()) {
            PackageEntity packageFd = packageById.get();
            List<HistoricOfPackageEntity> historics = historicPackageRepository.findByPackageId(req.getPackageId());
            
            // usar mapper depois
            res.setPackageId(packageFd.getPackageId());
            res.setTrackerCode(packageFd.getTrackerCode());
            res.setContainerId(packageFd.getContainerId());
            res.setUserUUID(packageFd.getUserUUID());
            res.setStateOrigen(packageFd.getStateOrigem());
            res.setCityOrigen(packageFd.getCityOrigem());
            res.setStateDestine(packageFd.getStateDestine());
            res.setCityDestine(packageFd.getCityDestine());
            res.setNeighborhood(packageFd.getNeighborhood());
            res.setStreetAddress(packageFd.getStreetAdress());
            res.setHomeNumber(packageFd.getHomeNumber());
            res.setDescription(packageFd.getDescription());
            
            // criando a lista de dtos 
            for (HistoricOfPackageEntity row: historics) {
                HistoricOfPackageDto tmp = new HistoricOfPackageDto(
                    row.getContainerId(),
                    row.getDataChanged(),
                    row.getCityChanged(),
                    row.getStateChanged()
                );
                historicDto.add(tmp);
            }
            
            res.setHistoric(historicDto);
            return res;
        }
        
        else if(packageRepository.existsByTrackerCode(req.getTrackerCode())){}
        return null;
    }
}
