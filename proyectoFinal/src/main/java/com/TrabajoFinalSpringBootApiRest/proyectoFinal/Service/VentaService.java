package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto.DatosCliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto.VentaInfo;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Producto;
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
    @Autowired
    IProductoService productoService;


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
        Producto p = productoService.getProducto(v.getProducto().getCodigo_producto());
        Double total =  p.getCosto() * p.getCantidad();
        v.setTotal(total);
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

    this.saveVenta(venta);
    }

    public VentaInfo getVentasInfo(Date fecha){

        List<Venta> listaDatos = ventaReposity.obtenerDatosFecha(fecha);
        VentaInfo info = new VentaInfo();

        Double contadorVentas = 0.0;
        Double montoTotal = 0.0;

        for (Venta v : listaDatos){
            contadorVentas++;
            montoTotal += v.getTotal();
        }

        info.setCantidadTotalVentas(contadorVentas);
        info.setMonto(montoTotal);

        return info;
    }

    public DatosCliente getMayorVenta(){

        Venta v = ventaReposity.getMayorVenta();
        DatosCliente info = new DatosCliente();

        info.setCodigo_venta(v.getIdVenta());
        info.setTotal(v.getTotal());
        info.setApellidoCliente(v.getUnCliente().getApellido());
        info.setNombreCliente(v.getUnCliente().getNombre());
        info.setCantidadProductos(v.getProducto().getCantidad());

        return info;
    }

}
