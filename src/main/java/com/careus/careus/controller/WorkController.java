package com.careus.careus.controller;

import com.careus.careus.dto.response.WorkResponseDTO;
import com.careus.careus.mapper.WorkMapper;
import com.careus.careus.model.WorkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;
import java.util.Optional;

@RestController
public class WorkController {

    public final WorkService workService;

    public final WorkMapper workMapper;

    public WorkController(WorkService workService, WorkMapper workMapper) {
        this.workService = workService;
        this.workMapper = workMapper;
    }

    @GetMapping("/work/works")
    public ResponseEntity<List<WorkResponseDTO>> getWorks(){
        List<WorkResponseDTO> works = workService.getWorks();
        return ResponseEntity.ok(works);
    }
    
    @GetMapping("/work/id/{id}")
    public ResponseEntity<Optional<WorkResponseDTO>> getWorkById(Long id){
        Optional<WorkResponseDTO> work = workService.getWorkById(id);
        return ResponseEntity.ok(work);
    }

    @GetMapping("/work/name/{name}")
    public ResponseEntity<List<WorkResponseDTO>> getWorksByName(String name){
        List<WorkResponseDTO> works = workService.getWorksByName(name);
        return ResponseEntity.ok(works);
    }
}
