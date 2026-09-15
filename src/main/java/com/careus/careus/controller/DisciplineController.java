package com.careus.careus.controller;

import com.careus.careus.mapper.DisciplineMapper;
import com.careus.careus.model.DisciplineService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisciplineController {

    public final DisciplineService disciplineService;

    public final DisciplineMapper disciplineMapper;

    public DisciplineController(DisciplineService disciplineService, DisciplineMapper disciplineMapper) {
        this.disciplineService = disciplineService;
        this.disciplineMapper = disciplineMapper;
    }


}
