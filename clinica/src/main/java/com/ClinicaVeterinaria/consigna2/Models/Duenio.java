package com.ClinicaVeterinaria.consigna2.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    private int dni;
    private String nombre;
    private String apellido;
    private int celular;

    @OneToMany(mappedBy = "id_duenio")
    private List<Mascota> mascotas;

    public Duenio() {
    }

    public Duenio(int id, int dni, String nombre, String apellido, int celular) {
        this.id_duenio = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.mascotas = new ArrayList<>();
    }

    public int getId() {
        return id_duenio;
    }

    public void setId(int id) {
        this.id_duenio = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
