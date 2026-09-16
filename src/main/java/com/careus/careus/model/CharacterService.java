package com.careus.careus.model;

import com.careus.careus.mapper.CharacterMapper;
import org.springframework.stereotype.Service;
import com.careus.careus.dto.response.CharacterResponseDTO;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    public CharacterService(CharacterRepository characterRepository, CharacterMapper characterMapper) {
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;
    }

    public List<CharacterResponseDTO> getCharacters(){
        return characterRepository.findAll()
                .stream()
                .map(characterMapper::toResponseDTO)
                .toList();
    }

    public List<CharacterResponseDTO> getCharacterFromCountry(Long id){
        return characterRepository.findByCountrys_Id(id)
                .stream()
                .map(characterMapper::toResponseDTO)
                .toList();
    }

    public List<CharacterResponseDTO> getCharacterByName(String name){
        return characterRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(characterMapper::toResponseDTO)
                .toList();
    }

    public List<CharacterResponseDTO> getCharactersFromDiscipline(Long id){
        return characterRepository.findByDisciplines_Id(id)
                .stream()
                .map(characterMapper::toResponseDTO)
                .toList();
    }
}
