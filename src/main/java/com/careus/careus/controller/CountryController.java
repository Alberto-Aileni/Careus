package com.careus.careus.controller;

import com.careus.careus.mapper.CountryMapper;
import com.careus.careus.model.CountryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    public final CountryService countryService;

    public final CountryMapper countryMapper;

    public CountryController(CountryService countryService, CountryMapper countryMapper) {
        this.countryService = countryService;
        this.countryMapper = countryMapper;
    }
}
