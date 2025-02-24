package com.rdtech.tracker_api.repository;
/**
 *
 * @date 22/02/2025
 * @author Juci-x
 *
 **/

import com.rdtech.tracker_api.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status,Long> {
    boolean existsByStatusText(String statusText);
    Status getByStatusText(String statusText);
}
