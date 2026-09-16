package com.careus.careus.mapper;

import com.careus.careus.dto.response.CharacterResponseDTO;
import com.careus.careus.dto.response.CountryResponseDTO;
import com.careus.careus.entity.Character;
import com.careus.careus.entity.Country;

import java.util.List;
import java.util.Set;

public class CountryMapperImpl implements CountryMapper{


    @Override
    public CountryResponseDTO toResponseDTO(Country country) {
        return new CountryResponseDTO(
                country.getId(),
                country.getName(),
                country.getDescription(),
                country.getFlagUrl(),
                country.getFormationDate(),
                country.getDismatleDate()
        );
    }
}
