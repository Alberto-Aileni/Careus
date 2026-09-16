package com.careus.careus.mapper;

import com.careus.careus.dto.response.DisciplineResponseDTO;
import com.careus.careus.entity.Discipline;

public class DisciplineMapperImpl implements DisciplineMapper{
    @Override
    public DisciplineResponseDTO toResponseDTO(Discipline discipline) {
        return new DisciplineResponseDTO(
                discipline.getId(),
                discipline.getName(),
                discipline.getDescription()
        );
    }
}
