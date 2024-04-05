package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductoService {
    public List<Producto> getProductos();
    public Producto getProducto(int id);

    public void saveProducto(Producto producto);

    public void deleteProducto(int id);

    public void updateProducto(int id,String nombre, String marca, Double costo,Double cantDisponible);

    public List<Producto> getListaStockMenor(int nro);
}
