package com.careus.careus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "work")
@NoArgsConstructor
public class Work {

    @Id
    @Column(name = "id_work", unique = true)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String descripcion;

    @Column(name = "language")
    private String language;

    @Column(name = "creation_date")
    private Date creationDate;

    public Work(long id, String name, String descripcion, String language, Date creationDate) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        language = language;
        this.creationDate = creationDate;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        language = language;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
