package com.careus.careus.dto.response;

import java.util.Date;

public record WorkResponseDTO(
        Long id,
        String name,
        String descripcion,
        String language,
        Date creationDate
        ) {}