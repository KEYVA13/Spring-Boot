package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto;

public class VentaInfo {
    private Double monto;
    private Double cantidadTotalVentas;

    public VentaInfo() {
    }

    public VentaInfo(Double monto, Double cantidadTotalVentas) {
        this.monto = monto;
        this.cantidadTotalVentas = cantidadTotalVentas;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getCantidadTotalVentas() {
        return cantidadTotalVentas;
    }

    public void setCantidadTotalVentas(Double cantidadTotalVentas) {
        this.cantidadTotalVentas = cantidadTotalVentas;
    }
}
