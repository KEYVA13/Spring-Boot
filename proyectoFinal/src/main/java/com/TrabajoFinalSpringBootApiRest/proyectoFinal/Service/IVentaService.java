package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Venta;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public interface IVentaService {

    public List<Venta> getVentas();
    public Venta getVenta(int id);
    public void saveVenta(Venta v);
    public void deleteVenta(int id);
    public void updateVenta(int id, Date fecha, Double total, Cliente c);

    public List<Venta> getLista(int nroVenta);

    public int getMontoTotalDia(Date fecha);
    public int getCantidadVentasDia(Date fecha);
}
