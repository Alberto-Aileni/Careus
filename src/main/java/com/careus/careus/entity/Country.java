package com.careus.careus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Country {
    @Column(name = "id_country", unique = true)
    private Long id;

    private String name;

    private String description;

    private String flagUrl;

    private LocalDate formationDate;

    private LocalDate dismatleDate;

}
