package com.ClinicaVeterinaria.consigna2.Dto;

import jakarta.persistence.Entity;

public class Dto {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_duenio;
    private String apellido_duenio;

    public Dto() {
    }

    public Dto(String nombre_mascota, String especie, String raza, String nombre_duenio, String apellido_duenio) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenio = nombre_duenio;
        this.apellido_duenio = apellido_duenio;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
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

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public String getApellido_duenio() {
        return apellido_duenio;
    }

    public void setApellido_duenio(String apellido_duenio) {
        this.apellido_duenio = apellido_duenio;
    }
}
