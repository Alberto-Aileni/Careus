package com.careus.careus.mapper;

import com.careus.careus.dto.response.WorkResponseDTO;
import com.careus.careus.entity.Work;
import org.springframework.stereotype.Component;

@Component
public interface WorkMapper {

    WorkResponseDTO toResponseDTO(Work work);

}
