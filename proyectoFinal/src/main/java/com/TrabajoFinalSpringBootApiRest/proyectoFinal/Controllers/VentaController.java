package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Controllers;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto.InfoVenta;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Venta;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class VentaController {

    @Autowired
    IVentaService venta;

    @PostMapping("/ventas/crear")
    public void saveVenta(@RequestBody Venta v){
        venta.saveVenta(v);
    }

    @GetMapping("/ventas")
    public List<Venta> getVenta(){
        return venta.getVentas();
    }

    @GetMapping("/ventas/{id}")
    public Venta getVenta(@PathVariable int id){
       return venta.getVenta(id);
    }

    @DeleteMapping("/ventas/eliminar/{id}")
    public void deleteVenta(@PathVariable int id){
        venta.deleteVenta(id);
    }

    @PutMapping("/ventas/editar/{id}")
    public void updateVenta(@PathVariable int id, Date fecha, Double total, Cliente cliente){
        venta.updateVenta(id,fecha,total,cliente);
    }

    @GetMapping("/Ventas/productos/{nroVenta}")
    public List<Venta> getLista(@PathVariable int nroVenta){
        return venta.getLista(nroVenta);
    }

    @GetMapping("/Ventas/{fecha}")
    public InfoVenta getVentasFecha(@PathVariable Date fecha){
            int costoTotal= venta.getMontoTotalDia(fecha);
            int cantidadVentas= venta.getCantidadVentasDia(fecha);
            InfoVenta informacion = new InfoVenta(costoTotal,cantidadVentas);
            return informacion;
    }
}
