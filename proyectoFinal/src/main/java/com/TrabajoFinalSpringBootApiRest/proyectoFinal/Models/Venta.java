package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Venta {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    private int idVenta;
    private Date fecha;
    private Double total;

    @OneToMany
    private List<Lista> lista;

    @OneToOne
    @JoinColumn(name = "id_clientecompra", referencedColumnName = "id_cliente")

    private Cliente unCliente;


    public Venta() {
    }

    public Venta(int codigo_venta, Date fecha, Double total, Cliente unCliente) {
        this.idVenta = codigo_venta;
        this.fecha = fecha;
        this.total = total;
        this.lista = new ArrayList<Lista>();
        this.unCliente = unCliente;
    }

    public int getCodigo_venta() {
        return idVenta;
    }

    public void setCodigo_venta(int codigo_venta) {
        this.idVenta = codigo_venta;
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

    public List<Lista> getListaProductos() {
        List<Lista> copia = new ArrayList<Lista>();
        for (Lista p : this.lista){
            copia.add(p);
        }
        return copia;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.lista = lista;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }
}
