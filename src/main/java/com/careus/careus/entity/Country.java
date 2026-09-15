package com.careus.careus.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "id_country", unique = true)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "flag_url")
    private String flagUrl;

    @Column(name = "formation_date")
    private LocalDate formationDate;

    @Column(name = "dismatle_date")
    private LocalDate dismatleDate;

    @ManyToMany
    @JoinTable(name = "countrys_characters",
            joinColumns = @JoinColumn(name = "id_country"),
            inverseJoinColumns = @JoinColumn(name = "id_character")
    )
    private Set<Character> characters = new HashSet<>();

    public Country(Long id, String name, String description, String flagUrl, LocalDate formationDate, LocalDate dismatleDate, Set<Character> characters) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.flagUrl = flagUrl;
        this.formationDate = formationDate;
        this.dismatleDate = dismatleDate;
        this.characters = characters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }

    public LocalDate getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(LocalDate formationDate) {
        this.formationDate = formationDate;
    }

    public LocalDate getDismatleDate() {
        return dismatleDate;
    }

    public void setDismatleDate(LocalDate dismatleDate) {
        this.dismatleDate = dismatleDate;
    }

    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }
}
