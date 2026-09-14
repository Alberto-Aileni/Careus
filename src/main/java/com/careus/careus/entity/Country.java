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

    public Country(Long id, String name, String description, String flagUrl, LocalDate formationDate, LocalDate dismatleDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.flagUrl = flagUrl;
        this.formationDate = formationDate;
        this.dismatleDate = dismatleDate;
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
}
