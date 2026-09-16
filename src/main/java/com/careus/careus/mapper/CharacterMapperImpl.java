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
        return countries.stream().map(cuntry -> new CountryBasicResponseDTO(
                cuntry.getId(),
                cuntry.getName(),
                cuntry.getDescription(),
                cuntry.getFlagUrl(),
                cuntry.getFormationDate(),
                cuntry.getDismatleDate()
        )).toList();
    }

    private List<DisciplineBasicResponseDTO> mapDisciplines(Set<Discipline> disciplines){
        return disciplines.stream().map(discipline -> new DisciplineBasicResponseDTO(
                discipline.getId(),
                discipline.getName(),
                discipline.getDescription()
        )).toList();
    }

    private List<WorkResponseDTO> mapWorks(List<Work> works){
        return works.stream().map(work -> new WorkResponseDTO(
                work.getId(),
                work.getNombre(),
                work.getDescripcion(),
                work.getLanguage(),
                work.getCreationDate()
        )).toList();
    }

    private List<IdeaResponseDTO> mapIdeas(List<Idea> ideas){
    return ideas.stream().map(idea -> new IdeaResponseDTO(
            idea.getId(),
            idea.getName(),
            idea.getDescription()
    )).toList();
    }


}
