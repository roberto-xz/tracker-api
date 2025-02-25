
package com.rdtech.tracker_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rdtech.tracker_api.entity.HistoricOfContainerEntity;


/**
 *****
 * @date 23/02/2015
 * @author roberto-xz
 *****
 */
@Repository
public interface HistoricOfContainerRepository extends JpaRepository<HistoricOfContainerEntity, Long>{
     List<HistoricOfContainerEntity> findByContainerId(Long containerId);
}
