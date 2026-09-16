package com.careus.careus.mapper;

import com.careus.careus.dto.response.*;
import com.careus.careus.entity.*;
import com.careus.careus.entity.Character;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class CharacterMapperImpl implements CharacterMapper{

    @Override
    public CharacterFullResponseDTO toFullResponseDTO(Character character){
        return new CharacterFullResponseDTO(
                character.getId(),
                character.getName(),
                character.getBirthPlace(),
                character.getNacionalities(),
                character.getLanguage(),
                character.getDescription(),
                character.getImageUrl(),
                character.getBirthDate(),
                character.getPassingDate(),
                mapCountrys(character.getCountrys()),
                mapDisciplines(character.getDisciplines()),
                mapWorks(character.getWorks()),
                mapIdeas(character.getIdeas())
        );
    }

    @Override
    public CharacterBasicResponseDTO toBasicResponseDTO(Character character){
        return new CharacterBasicResponseDTO(
                character.getId(),
                character.getName(),
                character.getBirthPlace(),
                character.getNacionalities(),
                character.getLanguage(),
                character.getDescription(),
                character.getImageUrl(),
                character.getBirthDate(),
                character.getPassingDate()
        );
    }

    private List<CountryBasicResponseDTO> mapCountrys(Set<Country> countries){
        return countries.stream().map(c -> new CountryBasicResponseDTO(
                c.getId(),
                c.getName(),
                c.getDescription(),
                c.getFlagUrl(),
                c.getFormationDate(),
                c.getDismatleDate()
        )).toList();
    }

    private List<DisciplineBasicResponseDTO> mapDisciplines(Set<Discipline> disciplines){
        return disciplines.stream().map(c -> new DisciplineBasicResponseDTO(
                c.getId(),
                c.getName(),
                c.getDescription()
        )).toList();
    }

    private List<WorkResponseDTO> mapWorks(List<Work> works){
        return works.stream().map(c -> new WorkResponseDTO(
                c.getId(),
                c.getNombre(),
                c.getDescripcion(),
                c.getLanguage(),
                c.getCreationDate()
        )).toList();
    }

    private List<IdeaResponseDTO> mapIdeas(List<Idea> ideas){
    return ideas.stream().map(c -> new IdeaResponseDTO(
            c.getId(),
            c.getName(),
            c.getDescription()
    )).toList();
    }


}
