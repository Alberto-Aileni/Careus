package com.careus.careus.mapper;

import com.careus.careus.dto.response.CharacterBasicResponseDTO;
import com.careus.careus.dto.response.CountryBasicResponseDTO;
import com.careus.careus.dto.response.CountryFullResponseDTO;
import com.careus.careus.entity.Character;
import com.careus.careus.entity.Country;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class CountryMapperImpl implements CountryMapper{


    @Override
    public CountryFullResponseDTO toFullResponseDTO(Country country) {
        return new CountryFullResponseDTO(
                country.getId(),
                country.getName(),
                country.getDescription(),
                country.getFlagUrl(),
                country.getFormationDate(),
                country.getDismatleDate(),
                mapCharacters(country.getCharacters())
        );
    }

    @Override
    public CountryBasicResponseDTO toBasicResponseDTO(Country country){
        return new CountryBasicResponseDTO(
                country.getId(),
                country.getName(),
                country.getDescription(),
                country.getFlagUrl(),
                country.getFormationDate(),
                country.getDismatleDate()
        );
    }

    private List<CharacterBasicResponseDTO> mapCharacters(Set<Character> characters){
        return characters.stream().map(c -> new CharacterBasicResponseDTO(
                c.getId(),
                c.getName(),
                c.getBirthPlace(),
                c.getNacionalities(),
                c.getLanguage(),
                c.getDescription(),
                c.getImageUrl(),
                c.getBirthDate(),
                c.getPassingDate()
                )
        ).toList();
    }
}
