package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;
    private Date fecha;
    private Double total;

    @OneToOne
    @JoinColumn(name = "codigo_producto", referencedColumnName = "codigo_producto")
    private Producto producto;


    @OneToOne
    @JoinColumn(name = "id_clientecompra", referencedColumnName = "id_cliente")
    private Cliente unCliente;

    public Venta() {
    }

    public Venta(int idVenta, Date fecha, Double total, Producto producto, Cliente unCliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = total;
        this.producto = producto;
        this.unCliente = unCliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }
}
