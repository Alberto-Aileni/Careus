package com.careus.careus.mapper;

import com.careus.careus.dto.response.CountryBasicResponseDTO;
import com.careus.careus.dto.response.CountryFullResponseDTO;
import com.careus.careus.entity.Country;
import org.springframework.stereotype.Component;

@Component
public interface CountryMapper {

    CountryFullResponseDTO toFullResponseDTO(Country country);

    CountryBasicResponseDTO toBasicResponseDTO(Country country);

}
