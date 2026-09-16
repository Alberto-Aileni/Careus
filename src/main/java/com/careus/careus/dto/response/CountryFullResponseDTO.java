package com.careus.careus.dto.response;

import java.time.LocalDate;
import java.util.List;

public record CountryFullResponseDTO(
        Long id,
        String name,
        String description,
        String flagUrl,
        LocalDate formationDate,
        LocalDate dismatleDate,
        List<CharacterBasicResponseDTO> characters
) {}
