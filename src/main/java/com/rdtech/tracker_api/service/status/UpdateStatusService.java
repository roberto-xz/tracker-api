package com.rdtech.tracker_api.service.status;

import com.rdtech.tracker_api.dto.status.StatusUpdateRequestDto;
import com.rdtech.tracker_api.dto.status.StatusUpdatedResponseDto;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 * @date 23/02/2025
 * @author Juci-x
 *
 **/

@Service
public class UpdateStatusService {
    private final StatusRepository statusRepository;

    @Autowired
    public UpdateStatusService(StatusRepository rep) {
        this.statusRepository = rep;
    }

    public StatusUpdatedResponseDto run(StatusUpdateRequestDto req) {
        StatusUpdatedResponseDto resp = new StatusUpdatedResponseDto();
        Optional<Status> statusExist = statusRepository.findById(req.getStatusId());

        if (statusExist.isPresent()) {
            Status status = statusExist.get();
            status.setStatusText(req.getStatusText());
            statusRepository.save(status);
            resp.setStatusId(req.getStatusId());
            resp.setMessage("Status atualizados com sucesso!");
            return resp;
        }else{
            resp.setStatusId(req.getStatusId());
            resp.setMessage("Status não encontrado!");
            return resp;

        }
    }
}
