package com.careus.careus.model;

import com.careus.careus.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountrys(){
        return countryRepository.findAll();
    }


}
