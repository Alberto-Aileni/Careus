package com.careus.careus.dto.response;

import java.util.List;

public record DisciplineFullResponseDTO(
        Long id,
        String name,
        String description,
        List<CharacterBasicResponseDTO> characters
) {}