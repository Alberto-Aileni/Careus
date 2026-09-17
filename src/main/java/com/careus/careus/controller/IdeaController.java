package com.careus.careus.controller;

import com.careus.careus.dto.response.IdeaResponseDTO;
import com.careus.careus.entity.Idea;
import com.careus.careus.mapper.IdeaMapper;
import com.careus.careus.model.CharacterService;
import com.careus.careus.model.IdeaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class IdeaController {

    public final IdeaService ideaService;

    public final IdeaMapper ideaMapper;

    public IdeaController(IdeaService ideaService, IdeaMapper ideaMapper) {
        this.ideaService = ideaService;
        this.ideaMapper = ideaMapper;
    }

    @GetMapping("/idea/ideas")
    public ResponseEntity<List<IdeaResponseDTO>> getideas(){
        List<IdeaResponseDTO> ideas = ideaService.getIdeas();
        return ResponseEntity.ok(ideas);
    }

    @GetMapping("/idea/id/¨{id}")
    public ResponseEntity<Optional<IdeaResponseDTO>> getIdeasById(Long id){
        Optional<IdeaResponseDTO> idea = ideaService.getIdeaById(id);
        return ResponseEntity.ok(idea);
    }

    @GetMapping("/idea/name/{name}")
    public ResponseEntity<List<IdeaResponseDTO>> getIdeasByName(String name){
        List<IdeaResponseDTO> ideas = ideaService.getIdeaByName(name);
        return ResponseEntity.ok(ideas);
    }
}
