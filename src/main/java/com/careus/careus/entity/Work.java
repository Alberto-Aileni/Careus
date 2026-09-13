package com.careus.careus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
public class Work {

    @Id
    @Column(name = "id_work", unique = true)
    private long id;

    private String nombre;

    private String descripcion;

    private String Language;

    private Date creationDate;
}
