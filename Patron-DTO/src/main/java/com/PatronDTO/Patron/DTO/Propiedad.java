package com.PatronDTO.Patron.DTO;

public class Propiedad {
    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private Double metros_cuadrados;
    private Double valor_alquiler;


    public Propiedad(Long id_propiedad, String tipo_propiedad, String direccion, Double metros_cuadrados, Double valor_alquiler) {
        this.id_propiedad = id_propiedad;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        this.valor_alquiler = valor_alquiler;
    }

    public Long getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(Long id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public String getTipo_propiedad() {
        return tipo_propiedad;
    }

    public void setTipo_propiedad(String tipo_propiedad) {
        this.tipo_propiedad = tipo_propiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(Double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public Double getValor_alquiler() {
        return valor_alquiler;
    }

    public void setValor_alquiler(Double valor_alquiler) {
        this.valor_alquiler = valor_alquiler;
    }
}
