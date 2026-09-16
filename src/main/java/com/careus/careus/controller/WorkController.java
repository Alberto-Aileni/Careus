package com.careus.careus.controller;

import com.careus.careus.mapper.WorkMapper;
import com.careus.careus.model.WorkService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkController {

    public final WorkService workService;

    public final WorkMapper workMapper;

    public WorkController(WorkService workService, WorkMapper workMapper) {
        this.workService = workService;
        this.workMapper = workMapper;
    }
}
