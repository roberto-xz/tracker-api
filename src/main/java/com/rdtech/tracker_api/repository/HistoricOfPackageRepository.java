
package com.rdtech.tracker_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rdtech.tracker_api.entity.HistoricOfPackageEntity;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@Repository
public interface HistoricOfPackageRepository extends JpaRepository<HistoricOfPackageEntity, Long>{
    List<HistoricOfPackageEntity> findByPackageId(Long packageId);
}
