package com.Practico1.resolucion;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Paciente {
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fecha;

    public Paciente() {
    }

    public Paciente(int id,int dni, String nombre, String apellido, LocalDate fecha){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
