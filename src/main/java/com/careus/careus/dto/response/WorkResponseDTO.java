package com.careus.careus.dto.response;

import java.util.Date;

public record WorkResponseDTO(
        Long id,
        String nombre,
        String descripcion,
        String language,
        Date creationDate
        ) {}