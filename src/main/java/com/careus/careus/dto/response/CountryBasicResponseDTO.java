package com.careus.careus.dto.response;

import java.time.LocalDate;

public record CountryBasicResponseDTO(
        Long id,
        String name,
        String description,
        String flagUrl,
        LocalDate formationDate,
        LocalDate dismatleDate
        ) {}