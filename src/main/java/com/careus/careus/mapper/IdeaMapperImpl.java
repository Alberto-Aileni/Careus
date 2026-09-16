package com.careus.careus.mapper;

import com.careus.careus.dto.response.IdeaResponseDTO;
import com.careus.careus.entity.Idea;

public class IdeaMapperImpl implements IdeaMapper{
    @Override
    public IdeaResponseDTO toResponseDTO(Idea idea) {
        return new IdeaResponseDTO(
                idea.getId(),
                idea.getName(),
                idea.getDescription()
        );
    }
}
