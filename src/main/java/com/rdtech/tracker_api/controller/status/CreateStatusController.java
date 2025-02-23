package com.rdtech.tracker_api.controller.status;

import com.rdtech.tracker_api.dto.status.StatusCreateRequestDto;
import com.rdtech.tracker_api.dto.status.StatusCreatedResponseDto;
import com.rdtech.tracker_api.service.status.CreateStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @date 22/02/2025
 * @author Juci-x
 *
 **/

@RestController
@RequestMapping("/api/status")
public class CreateStatusController {
    @Autowired
    private CreateStatusService createStatus;

    @PostMapping("/create")
    public StatusCreatedResponseDto run(@RequestBody StatusCreateRequestDto req) {
        StatusCreatedResponseDto resp = createStatus.run(req);

        if(resp.getStatusId() != -1L){}
        return resp;
    }

}
