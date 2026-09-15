package com.careus.careus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "work")
public class Work {

    @Id
    @Column(name = "id_work", unique = true)
    private long id;

    @Column(name = "name")
    private String nombre;

    @Column(name = "description")
    private String descripcion;

    @Column(name = "language")
    private String language;

    @Column(name = "creation_date")
    private Date creationDate;

    public Work(long id, String nombre, String descripcion, String language, Date creationDate) {
        this.id = id;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
