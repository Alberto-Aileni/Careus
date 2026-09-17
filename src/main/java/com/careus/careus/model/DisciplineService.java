package com.careus.careus.model;

import com.careus.careus.dto.response.DisciplineFullResponseDTO;
import com.careus.careus.entity.Discipline;
import com.careus.careus.mapper.CountryMapper;
import com.careus.careus.mapper.DisciplineMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplineService {

    private final DisciplineRepository disciplineRepository;

    private final DisciplineMapper disciplineMapper;

    public DisciplineService(DisciplineRepository disciplineRepository, DisciplineMapper disciplineMapper) {
        this.disciplineRepository = disciplineRepository;
        this.disciplineMapper = disciplineMapper;
    }

    public Optional<DisciplineFullResponseDTO> getDisciplineById(Long id){
        return disciplineRepository.findById(id)
                .map(disciplineMapper::toFullResponseDTO);
    }

    public List<DisciplineFullResponseDTO> getDisciplines(){
        return disciplineRepository.findAll()
                .stream()
                .map(disciplineMapper::toFullResponseDTO)
                .toList();
    }

    public List<DisciplineFullResponseDTO> getDisciplinesByname(String name){
        return disciplineRepository.findByName(name)
                .stream()
                .map(disciplineMapper::toFullResponseDTO)
                .toList();
    }

    public List<DisciplineFullResponseDTO> getDiscipliesFromCharacter(Long id){
        return disciplineRepository.findByCharacters_Id(id)
                .stream()
                .map(disciplineMapper::toFullResponseDTO)
                .toList();
    }
}
