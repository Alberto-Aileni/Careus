package com.careus.careus.model;

import com.careus.careus.entity.Character;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> getCharacters(){
        return characterRepository.findAll();
    }

    public List<Character> getCharacterFromCountry(Long id){
        return characterRepository.FindByCountryId(id);
    }

    public List<Character> getCharacterByName(String name){
        return characterRepository.findByNameContainingIgnoreCase(name);
    }
}
