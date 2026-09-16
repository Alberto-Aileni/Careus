package com.careus.careus.model;

import com.careus.careus.dto.response.IdeaResponseDTO;
import com.careus.careus.entity.Idea;
import com.careus.careus.mapper.IdeaMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdeaService {

    private final IdeaRepository ideaRepository;

    private final IdeaMapper ideaMapper;

    public IdeaService(IdeaRepository ideaRepository, IdeaMapper ideaMapper) {
        this.ideaRepository = ideaRepository;
        this.ideaMapper = ideaMapper;
    }

    public Optional<IdeaResponseDTO> getIdeaById(Long id){
        return ideaRepository.findById(id)
                .map(ideaMapper::toResponseDTO);
    }

    public List<IdeaResponseDTO> getIdeas(){
        return ideaRepository.findAll()
                .stream()
                .map(ideaMapper::toResponseDTO)
                .toList();
    }

    public List<IdeaResponseDTO> getIdeaByName(String name){
        return ideaRepository.findByName(name)
                .stream()
                .map(ideaMapper::toResponseDTO)
                .toList();
    }
}
