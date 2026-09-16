package com.careus.careus.controller;

import com.careus.careus.mapper.CharacterMapper;
import com.careus.careus.model.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.careus.careus.dto.response.CharacterResponseDTO;

import java.util.List;

@RestController
public class CharacterController {

    private final CharacterService characterService;

    private final CharacterMapper characterMapper;

    public CharacterController(CharacterService characterService, CharacterMapper characterMapper) {
        this.characterService = characterService;
        this.characterMapper = characterMapper;
    }

    @GetMapping("/characters")
    public ResponseEntity<List<CharacterResponseDTO>> getCharacters(){
        List<CharacterResponseDTO> characters = characterService.getCharacters();
        return ResponseEntity.ok(characters);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<CharacterResponseDTO>> getCharacterByName(@PathVariable String name){
        List<CharacterResponseDTO> characters = characterService.getCharacterByName(name);
        return ResponseEntity.ok(characters);
    }

    @GetMapping("/country/{id}")
    ResponseEntity<List<CharacterResponseDTO>> getCharactersByCountry(@PathVariable Long id){
        List<CharacterResponseDTO> characters = characterService.getCharacterFromCountry(id);
        return ResponseEntity.ok(characters);
    }

    @GetMapping("/discipline/{id}")
    ResponseEntity<List<CharacterResponseDTO>> getCharactersByDiscipline(@PathVariable Long id){
        List<CharacterResponseDTO> characters = characterService.getCharactersFromDiscipline(id);
        return ResponseEntity.ok(characters);
    }
}