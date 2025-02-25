
package com.rdtech.tracker_api.service.Packages;

import java.util.Map;
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

    public Object run(Long packgeId) {
        Optional<PackageEntity> packageFnd = packageRepository.findById(packgeId);

        if (packageFnd.isPresent()) {
            packageRepository.deleteById(packgeId);
            Map<String,Object> response = Map.of("message", "O Pacote foi Excludo","StatusCode", 200);
            return response;
        }

        Map<String,Object> response = Map.of("message", "O Pacote Não foi encontrado","StatusCode", 404);
        return response;
    } 
}
