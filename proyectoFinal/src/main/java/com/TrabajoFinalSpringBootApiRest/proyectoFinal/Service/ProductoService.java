package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Producto;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Reposity.IProductoReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    IProductoReposity productoReposity;
    @Override
    public List<Producto> getProductos() {
        return productoReposity.findAll();
    }

    @Override
    public Producto getProducto(int id) {
        return productoReposity.findById(id).orElse(null);
    }

    @Override
    public void saveProducto(Producto producto) {
        productoReposity.save(producto);
    }

    @Override
    public void deleteProducto(int id) {
        productoReposity.deleteById(id);
    }

    @Override
    public void updateProducto(int id,String nombre, String marca, Double costo, Double cantDisponible) {
        Producto p = this.getProducto(id);

        p.setNombre(nombre);
        p.setCosto(costo);
        p.setMarca(marca);
        p.setCantidad(cantDisponible);

        this.saveProducto(p);
    }

    public List<Producto> getListaStockMenor(int nro){
        return productoReposity.findProductosWithCantidadMenorA(nro);
    }
}
