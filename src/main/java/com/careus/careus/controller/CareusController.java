package com.careus.careus.controller;

import com.careus.careus.model.CharacterService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CareusController {

    private final CharacterService playerService;

    public CareusController(CharacterService playerService) {
        this.playerService = playerService;
    }


}
