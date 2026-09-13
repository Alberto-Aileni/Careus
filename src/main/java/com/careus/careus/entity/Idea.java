package com.careus.careus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Idea {
    @Id
    @Column(name = "id_idea", unique = true)
    private long id;

    private String name;

    private String description;

}
