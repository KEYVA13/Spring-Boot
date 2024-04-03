package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Controllers;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Producto;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductosController {

    @Autowired
    IProductoService producto;

    @PostMapping("/productos/crear")
    public void saveProducto(@RequestBody Producto p){
        producto.saveProducto(p);
    }

    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return producto.getProductos();
    }

    @GetMapping("/productos/{id}")
    public Producto getProductos(@PathVariable int id){
       return producto.getProducto(id);
    }

    @DeleteMapping("/productos/eliminar/{id}")
    public void deleteProducto(@PathVariable int id){
        producto.deleteProducto(id);
    }

    @PutMapping("/productos/editar/{id}")
    public void updateProducto(@PathVariable int id,String nombre, String marca, Double costo, Double cantDisponible){
        producto.updateProducto(id,nombre,marca,costo,cantDisponible);
    }

    @GetMapping("/Productos/cantidadProductos/{cant}")
    public List<Producto> listaFiltradoXCantidad(@PathVariable int cant){
        return producto.listaFiltradoXCantidad(cant);
    }
}
