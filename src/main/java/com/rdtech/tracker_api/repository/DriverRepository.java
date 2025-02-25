package com.rdtech.tracker_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rdtech.tracker_api.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long>{
    boolean existsByDriverRegisterCode(String driverRegisterCode);
    Optional<Driver> findFirstByIsAvailableTrue();
}
