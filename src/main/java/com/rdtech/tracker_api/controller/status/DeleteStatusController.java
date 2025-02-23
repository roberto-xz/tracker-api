package com.rdtech.tracker_api.controller.status;

import com.rdtech.tracker_api.dto.status.StatusDeletedResponseDto;
import com.rdtech.tracker_api.service.status.DeleteStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class DeleteStatusController {
    @Autowired
    DeleteStatusService deleteStatus;

    @DeleteMapping("/delete/{statusId}")
    public StatusDeletedResponseDto run(@PathVariable Long statusId) {
        StatusDeletedResponseDto resp = deleteStatus.run(statusId);
        if(resp.getStatusId() != -1L){}
        return resp;
    }
}
