package com.rdtech.tracker_api.controller.status;

import com.rdtech.tracker_api.dto.status.StatusGetResponseDto;
import com.rdtech.tracker_api.service.status.GetStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class GetStatusController {
    @Autowired
    GetStatusService getStatus;

    @GetMapping("/get/{statusId}")
    public StatusGetResponseDto run(@PathVariable Long statusId) {
        StatusGetResponseDto resp = getStatus.run(statusId);
        return resp;
    }
}
