package com.careus.careus.controller;

import com.careus.careus.dto.response.CountryFullResponseDTO;
import com.careus.careus.mapper.CountryMapper;
import com.careus.careus.model.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {

    public final CountryService countryService;

    public final CountryMapper countryMapper;

    public CountryController(CountryService countryService, CountryMapper countryMapper) {
        this.countryService = countryService;
        this.countryMapper = countryMapper;
    }

    @GetMapping("/country/{id}")
    public ResponseEntity<Optional<CountryFullResponseDTO>> getCountryById(Long id){
        Optional<CountryFullResponseDTO> country = countryService.getCountryById(id);
        return ResponseEntity.ok(country);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<CountryFullResponseDTO>> getCountryByName(String name){
        List<CountryFullResponseDTO> countrys = countryService.getCountryByName(name);
        return ResponseEntity.ok(countrys);
    }

    @GetMapping("/country")
    public ResponseEntity<List<CountryFullResponseDTO>> getCountrys(){
        List<CountryFullResponseDTO> countrys = countryService.getCountrys();
        return ResponseEntity.ok(countrys);
    }

    @GetMapping("/character/{id}")
    public ResponseEntity<List<CountryFullResponseDTO>> getCountrysFromCharacter(Long id){
        List<CountryFullResponseDTO> countrys = countryService.getCountrysFromCharacter(id);
        return ResponseEntity.ok(countrys);
    }
}
