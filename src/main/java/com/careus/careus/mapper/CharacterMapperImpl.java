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
    public CharacterResponseDTO toResponseDTO(Character character){

        return new CharacterResponseDTO(
                character.getId(),
                character.getName(),
                character.getBirthPlace(),
                character.getNacionalidades(),
                character.getIdiomas(),
                character.getDescription(),
                character.getImageUrl(),
                character.getBirthDate(),
                character.getPassingDate(),
                mapCountrys(character.getPaises()),
                mapDisciplines(character.getDisciplines()),
                mapWorks(character.getWorks()),
                mapIdeas(character.getIdeas())
        );
    }

    private List<CountryResponseDTO> mapCountrys(Set<Country> countries){
        return countries.stream().map(c -> new CountryResponseDTO(
                c.getId(),
                c.getName(),
                c.getDescription(),
                c.getFlagUrl(),
                c.getFormationDate(),
                c.getDismatleDate()
        )).toList();
    }

    private List<DisciplineResponseDTO> mapDisciplines(Set<Discipline> disciplines){
        return disciplines.stream().map(c -> new DisciplineResponseDTO(
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
