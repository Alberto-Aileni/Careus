package com.careus.careus.mapper;

import com.careus.careus.dto.response.WorkResponseDTO;
import com.careus.careus.entity.Work;

public class WorkMapperImpl implements WorkMapper{
    @Override
    public WorkResponseDTO toResponseDTO(Work work) {
        return new WorkResponseDTO(
                work.getId(),
                work.getNombre(),
                work.getDescripcion(),
                work.getLanguage(),
                work.getCreationDate()
        );
    }
}
