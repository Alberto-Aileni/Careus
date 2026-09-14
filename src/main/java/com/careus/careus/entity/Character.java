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

    public Character(long id, String name, String birthPlace, List<String> nacionalidades, List<String> idiomas, String description, String imageUrl, LocalDate birthDate, LocalDate passingDate, Set<Country> paises, Set<Discipline> disciplines, List<Work> works, List<Idea> ideas) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.nacionalidades = nacionalidades;
        this.idiomas = idiomas;
        this.description = description;
        this.imageUrl = imageUrl;
        this.birthDate = birthDate;
        this.passingDate = passingDate;
        this.paises = paises;
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

    public List<String> getNacionalidades() {
        return nacionalidades;
    }

    public void setNacionalidades(List<String> nacionalidades) {
        this.nacionalidades = nacionalidades;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
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

    public Set<Country> getPaises() {
        return paises;
    }

    public void setPaises(Set<Country> paises) {
        this.paises = paises;
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