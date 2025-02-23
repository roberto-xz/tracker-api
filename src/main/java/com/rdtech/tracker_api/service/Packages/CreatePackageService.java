
package com.rdtech.tracker_api.service.Packages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.rdtech.tracker_api.dto.packages.PackageCreateRequestDto;
import com.rdtech.tracker_api.dto.packages.PackageCreatedResponseDto;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.event.packages.PackageCreatedEvent;
import com.rdtech.tracker_api.repository.PackageRepository;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@Service
public class CreatePackageService {
    private final PackageRepository packageRepository;
    private final ApplicationEventPublisher event;

    @Autowired
    public CreatePackageService(PackageRepository repo, ApplicationEventPublisher event) {
        this.packageRepository = repo;
        this.event = event;
    }

    public PackageCreatedResponseDto run(PackageCreateRequestDto req) {
        PackageCreatedResponseDto res = new PackageCreatedResponseDto();
        PackageEntity packageEntity   = new PackageEntity();

        // usar mapper , se der tempo
        packageEntity.setUserUUID(req.getUserUUID());
        packageEntity.setStateOrigem(req.getStateOrigen());
        packageEntity.setCityOrigem(req.getCityOrigen());
        packageEntity.setStateDestine(req.getStateDestine());
        packageEntity.setCityDestine(req.getCityDestine());
        packageEntity.setNeighborhood(req.getNeighborhood());
        packageEntity.setStreetAdress(req.getStreetAddress());
        packageEntity.setHomeNumber(req.getHomeNumber());
        packageEntity.setDescription(req.getDescription());

        PackageEntity packageCreated = this.packageRepository.save(packageEntity);
        
        res.setPackageId(packageCreated.getPackageId());
        res.setTrackerCode(null);
        res.setStatusId(null);
        res.setStatusCode(200);

        /**
         *****
         * @date 23/02/2025
         * @author roberto-xz
         *****
        */
        // dispara o evento para os observers
        this.event.publishEvent(new PackageCreatedEvent(this, packageCreated));
        return res;
    }
}
