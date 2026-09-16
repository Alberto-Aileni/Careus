package com.careus.careus.model;

import com.careus.careus.dto.response.WorkResponseDTO;
import com.careus.careus.entity.Work;
import com.careus.careus.mapper.WorkMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkService {

    private final WorkRepository workRepository;

    private final WorkMapper workMapper;

    public WorkService(WorkRepository workRepository, WorkMapper workMapper) {
        this.workRepository = workRepository;
        this.workMapper = workMapper;
    }

    public Optional<WorkResponseDTO> getWorkById(Long id){
        return workRepository.findById(id)
                .map(workMapper::toResponseDTO);
    }

    public List<WorkResponseDTO> getWorks(){
        return workRepository.findAll()
                .stream()
                .map(workMapper::toResponseDTO)
                .toList();
    }

    public List<WorkResponseDTO> getWorksByName(String name){
        return workRepository.findByName(name)
                .stream()
                .map(workMapper::toResponseDTO)
                .toList();
    }
}
