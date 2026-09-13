package com.careus.careus.model;

import com.careus.careus.entity.Work;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {

    private final WorkRepository workRepository;

    public WorkService(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    public List<Work> getWorks(){
        return workRepository.findAll();
    }
}
