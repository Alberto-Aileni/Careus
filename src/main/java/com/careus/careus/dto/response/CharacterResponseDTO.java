package com.careus.careus.dto.response;

import java.time.LocalDate;
import java.util.List;

public record CharacterResponseDTO(
        Long id,
        String name,
        String birthPlace,
        List<String> nacionalidades,
        List<String> idiomas,
        String description,
        String imageUrl,
        LocalDate birthDate,
        LocalDate passingDate,
        List<CountryResponseDTO> countrys,
        List<DisciplineResponseDTO> disciplines,
        List<WorkResponseDTO> works,
        List<IdeaResponseDTO> ideas
        ) {}





