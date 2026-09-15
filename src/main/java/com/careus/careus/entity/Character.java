package com.careus.careus.entity;

import jakarta.persistence.*;

import java.util.*;
import java.time.LocalDate;

@Entity
@Table(name = "character")
public class Character {

    @Id
    @Column(name = "id_character", unique = true)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_place")
    private String birthPlace;

    @ElementCollection
    @CollectionTable(
            name = "character_nationality",
            joinColumns = @JoinColumn(name = "id_character")
    )
    @Column(name = "nationalities")
    private List<String> nacionalities = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "character_language",
            joinColumns = @JoinColumn(name = "id_character")
    )
    @Column(name = "language")
    private List<String> language = new ArrayList<>();

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "passing_date")
    private LocalDate passingDate;

    @ManyToMany
    @JoinTable(
            name = "characters_countrys",
            joinColumns = @JoinColumn(name = "id_character"),
            inverseJoinColumns = @JoinColumn(name = "id_country")
    )
    private Set<Country> countrys = new HashSet<>();

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

    public Character(long id, String name, String birthPlace, List<String> nacionalities, List<String> language, String description, String imageUrl, LocalDate birthDate, LocalDate passingDate, Set<Country> countrys, Set<Discipline> disciplines, List<Work> works, List<Idea> ideas) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.nacionalities = nacionalities;
        this.language = language;
        this.description = description;
        this.imageUrl = imageUrl;
        this.birthDate = birthDate;
        this.passingDate = passingDate;
        this.countrys = countrys;
        this.disciplines = disciplines;
        this.works = works;
        this.ideas = ideas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public List<String> getNacionalities() {
        return nacionalities;
    }

    public void setNacionalities(List<String> nacionalities) {
        this.nacionalities = nacionalities;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getPassingDate() {
        return passingDate;
    }

    public void setPassingDate(LocalDate passingDate) {
        this.passingDate = passingDate;
    }

    public Set<Country> getCountrys() {
        return countrys;
    }

    public void setCountrys(Set<Country> countrys) {
        this.countrys = countrys;
    }

    public Set<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Set<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }
}