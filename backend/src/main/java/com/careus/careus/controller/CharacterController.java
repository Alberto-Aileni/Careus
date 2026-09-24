package com.careus.careus.controller;

import com.careus.careus.mapper.CharacterMapper;
import com.careus.careus.model.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.careus.careus.dto.response.CharacterFullResponseDTO;


import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class CharacterController {

    private final CharacterService characterService;

    private final CharacterMapper characterMapper;

    public CharacterController(CharacterService characterService, CharacterMapper characterMapper) {
        this.characterService = characterService;
        this.characterMapper = characterMapper;
    }

    @GetMapping("/character/characters")
    public ResponseEntity<List<CharacterFullResponseDTO>> getCharacters(){
        List<CharacterFullResponseDTO> characters = characterService.getCharacters();
        return ResponseEntity.ok(characters);
    }

    @GetMapping("/character/id/{id}")
    public ResponseEntity<Optional<CharacterFullResponseDTO>> getCharacetersById(@PathVariable Long id){
        Optional<CharacterFullResponseDTO> character = characterService.getCharactersById(id);
        return ResponseEntity.ok(character);
    }

    @GetMapping("/character/name/{name}")
    public ResponseEntity<List<CharacterFullResponseDTO>> getCharacterByName(@PathVariable String name){
        List<CharacterFullResponseDTO> characters = characterService.getCharacterByName(name);
        return ResponseEntity.ok(characters);
    }

    @GetMapping("/character/work/{id}")
    public ResponseEntity<List<CharacterFullResponseDTO>> getCharacterFromWork(@PathVariable Long id){
        List<CharacterFullResponseDTO> characters = characterService.getCharactersFromWork(id);
        return ResponseEntity.ok(characters);
    }

    @GetMapping("/character/idea/{id}")
    public ResponseEntity<List<CharacterFullResponseDTO>> getCharacetersFromIdea(@PathVariable Long id){
        List<CharacterFullResponseDTO> characters = characterService.getCharactersFromIdea(id);
        return ResponseEntity.ok(characters);
    }

    @GetMapping("/character/country/{id}")
    ResponseEntity<List<CharacterFullResponseDTO>> getCharactersByCountry(@PathVariable Long id){
        List<CharacterFullResponseDTO> characters = characterService.getCharacterFromCountry(id);
        return ResponseEntity.ok(characters);
    }

    @GetMapping("/character/discipline/{id}")
    ResponseEntity<List<CharacterFullResponseDTO>> getCharactersByDiscipline(@PathVariable Long id){
        List<CharacterFullResponseDTO> characters = characterService.getCharactersFromDiscipline(id);
        return ResponseEntity.ok(characters);
    }
}