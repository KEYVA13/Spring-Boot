package com.ClinicaVeterinaria.consigna2.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mascota {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @ManyToOne
    @JoinColumn(name="id_duenio")
    @JsonIgnore
    private Duenio id_duenio;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String especie, String raza, String color, Duenio id_duenio) {
        this.id_mascota = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.id_duenio = id_duenio;
    }

    public int getId() {
        return id_mascota;
    }

    public void setId(int id) {
        this.id_mascota = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Duenio getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(Duenio id_duenio) {
        this.id_duenio = id_duenio;
    }
}
