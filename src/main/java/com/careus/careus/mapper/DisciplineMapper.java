package com.careus.careus.mapper;

import com.careus.careus.dto.response.DisciplineBasicResponseDTO;
import com.careus.careus.dto.response.DisciplineFullResponseDTO;
import com.careus.careus.entity.Discipline;
import org.springframework.stereotype.Component;

@Component
public interface DisciplineMapper {

    DisciplineFullResponseDTO toFullResponseDTO(Discipline discipline);

    DisciplineBasicResponseDTO toBasicResponseDTO(Discipline discipline);

}
