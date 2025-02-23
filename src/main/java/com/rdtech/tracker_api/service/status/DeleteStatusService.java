package com.rdtech.tracker_api.service.status;

import com.rdtech.tracker_api.dto.status.StatusDeletedResponseDto;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 *
 * @date 22/02/2025
 * @author Juci-x
 *
 **/

@Service
public class DeleteStatusService {
    private final StatusRepository statusRepository;

    @Autowired
    public DeleteStatusService(StatusRepository resp) {

        this.statusRepository = resp;
    }

    public StatusDeletedResponseDto run(Long statusId) {
        Optional<Status> status = statusRepository.findById(statusId);
        StatusDeletedResponseDto resp = new StatusDeletedResponseDto();

        if (status.isPresent()) {
            statusRepository.deleteById(statusId);
            resp.setStatusId(statusId);
            resp.setMessage("Status deletado com sucesso");
            return resp;
        }else{
            resp.setStatusId(statusId);
            resp.setMessage("Status não encontrado");
            return resp;
        }

    }
}
