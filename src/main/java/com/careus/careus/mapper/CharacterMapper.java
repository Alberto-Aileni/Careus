package com.careus.careus.mapper;

import com.careus.careus.dto.response.CharacterBasicResponseDTO;
import org.springframework.stereotype.Component;
import com.careus.careus.dto.response.CharacterFullResponseDTO;
import com.careus.careus.entity.Character;

@Component
public interface CharacterMapper {

    CharacterFullResponseDTO toFullResponseDTO(Character character);

    CharacterBasicResponseDTO toBasicResponseDTO(Character character);
}
