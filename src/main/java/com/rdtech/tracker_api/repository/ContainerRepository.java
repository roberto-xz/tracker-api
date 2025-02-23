
package com.rdtech.tracker_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rdtech.tracker_api.entity.ContainerEntity;

/**
 *****
 * @date 23/02/2025
 * @author roberto-xz
 *****
 */
public interface ContainerRepository extends JpaRepository<ContainerEntity, Long> {
    @Query("SELECT c FROM ContainerEntity c WHERE c.stateDestine = :stateDestine AND c.numPackages < c.maxPackages")
    ContainerEntity getByStateDestine(@Param("stateDestine") String stateDestine);
}
