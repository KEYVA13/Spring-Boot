package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto;

public class DatosCliente {
    private int codigo_venta;
    private Double total;
    private Double cantidadProductos;
    private String nombreCliente;
    private String apellidoCliente;

    public DatosCliente(int codigo_venta, Double total, Double cantidadProductos, String nombreCliente, String apellidoCliente) {
        this.codigo_venta = codigo_venta;
        this.total = total;
        this.cantidadProductos = cantidadProductos;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }

    public DatosCliente() {
    }

    public int getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(int codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Double cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
}
