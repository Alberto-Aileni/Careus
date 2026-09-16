package com.careus.careus.controller;

import com.careus.careus.dto.response.DisciplineFullResponseDTO;
import com.careus.careus.mapper.DisciplineMapper;
import com.careus.careus.model.DisciplineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DisciplineController {

    public final DisciplineService disciplineService;

    public final DisciplineMapper disciplineMapper;

    public DisciplineController(DisciplineService disciplineService, DisciplineMapper disciplineMapper) {
        this.disciplineService = disciplineService;
        this.disciplineMapper = disciplineMapper;
    }

    @GetMapping("/discipline/id")
    public ResponseEntity<Optional<DisciplineFullResponseDTO>> getCuntryById(Long id){
        Optional<DisciplineFullResponseDTO> discipline = disciplineService.getDisciplineById(id);
        return ResponseEntity.ok(discipline);
    }

    @GetMapping("/disciplines")
    public ResponseEntity<List<DisciplineFullResponseDTO>> getCountrys(){
        List<DisciplineFullResponseDTO> disciplines = disciplineService.getDisciplines();
        return ResponseEntity.ok(disciplines);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<DisciplineFullResponseDTO>> getCountrysByName(String name){
        List<DisciplineFullResponseDTO> disciplines = disciplineService.getDisciplinesByname(name);
        return ResponseEntity.ok(disciplines);
    }

    @GetMapping("/Characters/{id}")
    public ResponseEntity<List<DisciplineFullResponseDTO>> getConutrysFromCharacter(Long id){
        List<DisciplineFullResponseDTO> disciplines = disciplineService.getDiscipliesFromCharacter(id);
        return ResponseEntity.ok(disciplines);
    }


}
