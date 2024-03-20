package com.Practico1.resolucion;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Plato {
    private int id;
    private String nombre;
    private int precio;
    private String descripcion;

    public Plato() {}

    public Plato(int id,String nombre,int precio,String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
}
