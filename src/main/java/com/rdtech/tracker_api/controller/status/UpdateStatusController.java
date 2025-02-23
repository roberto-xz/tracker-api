package com.rdtech.tracker_api.controller.status;

import com.rdtech.tracker_api.dto.status.StatusUpdateRequestDto;
import com.rdtech.tracker_api.dto.status.StatusUpdatedResponseDto;
import com.rdtech.tracker_api.service.status.UpdateStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @date 22/02/2025
 * @author Juci-x
 *
 **/

@RestController
@RequestMapping("/api/status")
public class UpdateStatusController {
    @Autowired
    private UpdateStatusService updateStatus;

    @PutMapping("/update/{statusId}")
    public StatusUpdatedResponseDto run (@PathVariable Long statusId,@RequestBody StatusUpdateRequestDto req){
        StatusUpdatedResponseDto resp = updateStatus.run(req);

        if(resp.getStatusId() != -1L){}
        return resp;
    }
}
