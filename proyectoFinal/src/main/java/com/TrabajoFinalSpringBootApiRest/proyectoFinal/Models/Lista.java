package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idLista;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "codigo_venta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "codigo_producto")
    private Producto producto;
    public Lista() {
    }

    public Lista(int idLista, Venta venta, Producto producto) {
        this.idLista = idLista;
        this.venta = venta;
        this.producto = producto;
    }

    public int getIdLista() {
        return idLista;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }
}
