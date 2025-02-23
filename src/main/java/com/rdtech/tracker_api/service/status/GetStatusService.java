package com.rdtech.tracker_api.service.status;

import com.rdtech.tracker_api.dto.status.StatusGetResponseDto;
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
public class GetStatusService {
    private final StatusRepository statusRepository;

    @Autowired
    public GetStatusService(StatusRepository resp) {
        this.statusRepository = resp;
    }

    public StatusGetResponseDto run(Long statusID){
        Optional<Status> statusOptional = statusRepository.findById(statusID);
        StatusGetResponseDto resp = new StatusGetResponseDto();

        if(statusOptional.isPresent()){
            Status status = statusOptional.get();
            resp.setStatusText(status.getStatusText());
            return resp;
        }else{
            resp.setStatusText("Status não encontrado");
            return resp;
        }

    }

}
