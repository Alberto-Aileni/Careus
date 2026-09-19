package com.careus.careus.dto.response;

import java.time.LocalDate;
import java.util.List;

public record CharacterBasicResponseDTO(
        Long id,
        String name,
        String birthPlace,
        List<String> nacionalidades,
        List<String> idiomas,
        String description,
        String imageUrl,
        LocalDate birthDate,
        LocalDate passingDate
){}
