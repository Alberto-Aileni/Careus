package com.careus.careus.mapper;

import com.careus.careus.dto.response.CharacterBasicResponseDTO;
import com.careus.careus.dto.response.DisciplineBasicResponseDTO;
import com.careus.careus.dto.response.DisciplineFullResponseDTO;
import com.careus.careus.entity.Character;
import com.careus.careus.entity.Discipline;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class DisciplineMapperImpl implements DisciplineMapper{
    @Override
    public DisciplineFullResponseDTO toFullResponseDTO(Discipline discipline) {
        return new DisciplineFullResponseDTO(
                discipline.getId(),
                discipline.getName(),
                discipline.getDescription(),
                mapCharacters(discipline.getCharacters())
        );
    }

    @Override
    public DisciplineBasicResponseDTO toBasicResponseDTO(Discipline discipline) {
        return new DisciplineBasicResponseDTO(
                discipline.getId(),
                discipline.getName(),
                discipline.getDescription()
        );
    }

    private List<CharacterBasicResponseDTO> mapCharacters(Set<Character> characters){
        return characters.stream().map(character -> new CharacterBasicResponseDTO(
                character.getId(),
                character.getName(),
                character.getBirthPlace(),
                character.getNacionalities(),
                character.getLanguage(),
                character.getDescription(),
                character.getImageUrl(),
                character.getBirthDate(),
                character.getPassingDate()
                )
        ).toList();
    }
}
