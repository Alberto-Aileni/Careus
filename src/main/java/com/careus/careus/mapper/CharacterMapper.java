package com.careus.careus.mapper;

import org.springframework.stereotype.Component;
import com.careus.careus.dto.response.CharacterResponseDTO;
import com.careus.careus.entity.Character;

@Component
public interface CharacterMapper {

    CharacterResponseDTO toResponseDTO(Character character);

}
