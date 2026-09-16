package com.careus.careus.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "discipline")
public class Discipline {

    @Id
    @Column(name = "id_discipline", unique = true)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(name = "characters_disciplines",
            joinColumns = @JoinColumn(name = "id_discipline"),
            inverseJoinColumns = @JoinColumn(name = "id_character")
    )
    private Set<Character> characters = new HashSet<>();

    public Discipline(Long id, String name, String description, Set<Character> characters) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }
}
