package com.rdtech.tracker_api.service.status;

/**
 *
 * @date 22/02/2025
 * @author Juci-x
 *
 **/

import com.rdtech.tracker_api.dto.status.StatusCreateRequestDto;
import com.rdtech.tracker_api.dto.status.StatusCreatedResponseDto;
import com.rdtech.tracker_api.entity.Status;
import com.rdtech.tracker_api.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateStatusService {
    private final StatusRepository statusRepository;

    @Autowired
    public CreateStatusService(StatusRepository rep) {
        this.statusRepository = rep;
    }

    public StatusCreatedResponseDto run(StatusCreateRequestDto req){
        StatusCreatedResponseDto resp = new StatusCreatedResponseDto();
        Status status = new Status();
        status.setStatusText(req.getStatusText());

        if (statusRepository.existsByStatusText(req.getStatusText())){
            resp.setStatusId(-1L);
            resp.setMessage("Status já existente");
            return resp;
        } else{
            Status createdStatus = statusRepository.save(status);
            resp.setStatusId(createdStatus.getStatusID());
            resp.setMessage("Status criado com sucesso");
            return resp;
        }

    }
}
