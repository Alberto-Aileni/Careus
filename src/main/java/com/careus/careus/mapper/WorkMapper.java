package com.careus.careus.mapper;

import com.careus.careus.dto.response.WorkResponseDTO;
import com.careus.careus.entity.Work;

public interface WorkMapper {

    WorkResponseDTO toResponseDTO(Work work);

}
