package com.careus.careus.mapper;

import com.careus.careus.dto.response.CountryResponseDTO;
import com.careus.careus.entity.Country;

public interface CountryMapper {

    CountryResponseDTO toResponseDTO(Country country);

}
