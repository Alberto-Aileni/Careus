package com.careus.careus.model;

import com.careus.careus.dto.response.CountryFullResponseDTO;
import com.careus.careus.entity.Country;
import com.careus.careus.mapper.CountryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    private final CountryMapper countryMapper;

    public CountryService(CountryRepository countryRepository, CountryMapper countryMapper) {
        this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    public Optional<CountryFullResponseDTO> getCountryById(Long id){
        return countryRepository.findById(id)
                .map(countryMapper::toFullResponseDTO);
    }

    public List<CountryFullResponseDTO> getCountrys(){
        return countryRepository.findAll()
                .stream()
                .map(countryMapper::toFullResponseDTO)
                .toList();
    }

    public List<CountryFullResponseDTO> getCountryByName(String name){
        return countryRepository.findByName(name)
                .stream()
                .map(countryMapper::toFullResponseDTO)
                .toList();
    }

    public List<CountryFullResponseDTO> getCountrysFromCharacter(Long id){
        return countryRepository.findByCharacters_Id(id)
                .stream()
                .map(countryMapper::toFullResponseDTO)
                .toList();

    }

}
