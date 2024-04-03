package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models;

import jakarta.persistence.*;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.List;

@Entity
public class Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int codigo_producto;
    private String nombre;
    private String marca;
    private Double costo;
    private Double cantidad;

    public Producto() {
    }

    public Producto(int codigo_producto, String nombre, String marca, Double costo, Double cantidad_disponible) {
        this.codigo_producto = codigo_producto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantidad = cantidad_disponible;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad_disponible) {
        this.cantidad = cantidad_disponible;
    }
}
