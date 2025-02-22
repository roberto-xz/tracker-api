
package com.rdtech.tracker_api.service.Packages;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rdtech.tracker_api.dto.packages.PackageDeletedResponseDto;
import com.rdtech.tracker_api.entity.PackageEntity;
import com.rdtech.tracker_api.repository.PackageRepository;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@Service
public class DeletePackageService {
    private final PackageRepository packageRepository;

    @Autowired
    public DeletePackageService(PackageRepository repo) {
        this.packageRepository = repo;
    }

    public PackageDeletedResponseDto run(Long packgeId) {
        PackageDeletedResponseDto res = new PackageDeletedResponseDto();
        Optional<PackageEntity> packageFnd = packageRepository.findById(packgeId);

        if (packageFnd.isPresent()) {
            packageRepository.deleteById(packgeId);
            res.setMessagem("O pacote foi excluido");
            res.setStatusCode(200);
            return res;
        }

        res.setMessagem("O pacote não existe");
        res.setStatusCode(404);
        return res;
    } 
}
