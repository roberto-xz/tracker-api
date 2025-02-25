
package com.rdtech.tracker_api.service.Packages;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.packages.PackageUpdateRequestDto;
import com.rdtech.tracker_api.dto.packages.PackageUpdatedResponseDto;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.repository.PackageRepository;


/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */
@Service
public class UpdatePackageService {
    PackageRepository packageRepository;

    @Autowired
    public UpdatePackageService(PackageRepository repo){
        this.packageRepository = repo;
    }

    public PackageUpdatedResponseDto run(PackageUpdateRequestDto req) {
        Optional<PackageEntity> packageFind = packageRepository.findById(req.getPackageId());
        PackageUpdatedResponseDto res = new PackageUpdatedResponseDto();

        if (packageFind.isPresent()) {
            PackageEntity packagAt = packageFind.get();
            packagAt.setStateDestine(req.getStateDestine());
            packagAt.setCityDestine(req.getCityDestine());
            packagAt.setStreetAdress(req.getStreetAddress());
            packagAt.setNeighborhood(req.getNeighborhood());
            packagAt.setHomeNumber(req.getHomeNumber());

            packageRepository.save(packagAt);
            res.setMessagem("o pacote foi atualizado");
            res.setStatusCode(200);
            return res;
            
        }
        res.setMessagem("Pacote não encontrado");
        res.setStatusCode(404);
        return res;
    }

}
