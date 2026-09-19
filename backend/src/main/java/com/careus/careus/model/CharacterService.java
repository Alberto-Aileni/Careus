package com.careus.careus.model;

import com.careus.careus.mapper.CharacterMapper;
import com.careus.careus.mapper.IdeaMapper;
import org.springframework.stereotype.Service;
import com.careus.careus.dto.response.CharacterFullResponseDTO;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    public CharacterService(CharacterRepository characterRepository, CharacterMapper characterMapper) {
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;
    }

    public Optional<CharacterFullResponseDTO> getCharactersById(Long id){
        return characterRepository.findById(id)
                .map(characterMapper::toFullResponseDTO);
    }

    public List<CharacterFullResponseDTO> getCharacters(){
        return characterRepository.findAll()
                .stream()
                .map(characterMapper::toFullResponseDTO)
                .toList();
    }

    public List<CharacterFullResponseDTO> getCharacterFromCountry(Long id){
        return characterRepository.findByCountrys_Id(id)
                .stream()
                .map(characterMapper::toFullResponseDTO)
                .toList();
    }

    public List<CharacterFullResponseDTO> getCharacterByName(String name){
        return characterRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(characterMapper::toFullResponseDTO)
                .toList();
    }

    public List<CharacterFullResponseDTO> getCharactersFromWork(Long id){
        return characterRepository.findByWorks_Id(id)
                .stream()
                .map(characterMapper::toFullResponseDTO)
                .toList();
    }

    public List<CharacterFullResponseDTO> getCharactersFromIdea(Long id){
        return characterRepository.findByIdeas_Id(id)
                .stream()
                .map(characterMapper::toFullResponseDTO)
                .toList();
    }

    public List<CharacterFullResponseDTO> getCharactersFromDiscipline(Long id){
        return characterRepository.findByDisciplines_Id(id)
                .stream()
                .map(characterMapper::toFullResponseDTO)
                .toList();
    }
}
