package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto;

public class InfoVenta {
    private int costoTotal;
    private int cantidadVentas;

    public InfoVenta() {
    }

    public InfoVenta(int costoTotal, int cantidadVentas) {
        this.costoTotal = costoTotal;
        this.cantidadVentas = cantidadVentas;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }


}
