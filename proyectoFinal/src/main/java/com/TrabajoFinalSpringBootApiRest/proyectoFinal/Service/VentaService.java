package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Venta;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Reposity.IVentaReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VentaService implements IVentaService{
    @Autowired
    IVentaReposity ventaReposity;


    @Override
    public List<Venta> getVentas() {
        return ventaReposity.findAll();
    }

    @Override
    public Venta getVenta(int id) {
        return ventaReposity.findById(id).orElse(null);
    }

    @Override
    public void saveVenta(Venta v) {
        ventaReposity.save(v);
    }

    @Override
    public void deleteVenta(int id) {
        ventaReposity.deleteById(id);
    }

    @Override
    public void updateVenta(int id, Date fecha, Double total, Cliente c) {
    Venta venta = this.getVenta(id);

    venta.setFecha(fecha);
    venta.setTotal(total);
    venta.setUnCliente(c);

    }

    public List<Venta> getLista(int nroVenta){
        return ventaReposity.findVentaWithListaByidVenta(nroVenta);
    }

    public int getMontoTotalDia(Date fecha){
        return ventaReposity.getMontoTotalDia(fecha);
    }
    public int getCantidadVentasDia(Date fecha){
        return ventaReposity.getCantidadVentasDia(fecha);
    }
}
