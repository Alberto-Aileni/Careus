package com.careus.careus.controller;

import com.careus.careus.entity.Idea;
import com.careus.careus.mapper.IdeaMapper;
import com.careus.careus.model.CharacterService;
import com.careus.careus.model.IdeaService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdeaController {

    public final IdeaService ideaService;

    public final IdeaMapper ideaMapper;

    public IdeaController(IdeaService ideaService, IdeaMapper ideaMapper) {
        this.ideaService = ideaService;
        this.ideaMapper = ideaMapper;
    }
}
