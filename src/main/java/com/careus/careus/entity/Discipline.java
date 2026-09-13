package com.careus.careus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Discipline {

    @Id
    @Column(name = "id_discipline", unique = true)
    private Long id;

    private String name;

    private String description;

}
