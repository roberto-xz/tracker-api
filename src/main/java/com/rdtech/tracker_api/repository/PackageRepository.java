package com.rdtech.tracker_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rdtech.tracker_api.entity.PackageEntity;

/**
 *****
 * @date 22/02/2015
 * @author roberto-xz
 *****
 */

@Repository
public interface PackageRepository extends JpaRepository<PackageEntity, Long>{}
