package com.careus.careus.mapper;

import com.careus.careus.dto.response.IdeaResponseDTO;
import com.careus.careus.entity.Idea;
import org.springframework.stereotype.Component;

@Component
public interface IdeaMapper {

    IdeaResponseDTO toResponseDTO(Idea idea);

}
