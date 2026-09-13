package com.careus.careus.entity;

import jakarta.persistence.*;

import java.util.*;
import java.time.LocalDate;

@Entity
@Table(name = "persona")
public class Character {

    @Id
    @Column(name = "id_character", unique = true)
    private long id;

    private String name;

    private String birthPlace;

    @ElementCollection
    @CollectionTable(
            name = "character_nationality",
            joinColumns = @JoinColumn(name = "id_character")
    )
    @Column(name = "nacionalidad")
    private List<String> nacionalidades = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "personaje_idiomas",
            joinColumns = @JoinColumn(name = "id_character")
    )
    @Column(name = "idioma")
    private List<String> idiomas = new ArrayList<>();

    private String description;

    private String imageUrl;

    private LocalDate birthDate;

    private LocalDate passingDate;

    @ManyToMany
    @JoinTable(
            name = "characters_countrys",
            joinColumns = @JoinColumn(name = "id_character"),
            inverseJoinColumns = @JoinColumn(name = "id_country")
    )
    private Set<Country> paises = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "characters_disciplines",
            joinColumns = @JoinColumn(name = "id_character"),
            inverseJoinColumns = @JoinColumn(name = "id_discipline")
    )
    private Set<Discipline> disciplines = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "id_work")
    private List<Work> works = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "id_idea")
    private List<Idea> ideas = new ArrayList<>();
}