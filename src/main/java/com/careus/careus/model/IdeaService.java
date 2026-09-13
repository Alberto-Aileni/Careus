package com.careus.careus.model;

import com.careus.careus.entity.Idea;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeaService {

    private final IdeaRepository ideaRepository;

    public IdeaService(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    public List<Idea> getIdeas(){
        return ideaRepository.findAll();
    }
}
