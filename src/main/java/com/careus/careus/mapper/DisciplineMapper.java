package com.careus.careus.mapper;

import com.careus.careus.dto.response.DisciplineResponseDTO;
import com.careus.careus.entity.Discipline;

public interface DisciplineMapper {

    DisciplineResponseDTO toResponseDTO(Discipline discipline);
}
