package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Controllers;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Producto;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service.IProductoService;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductosController {

    // Se inyecta el servicio de productos
    @Autowired
    IProductoService producto;
    @Autowired
    IVentaService venta;

    // Endpoint para crear un producto
    @PostMapping("/productos/crear")
    public ResponseEntity<String> saveProducto(@RequestBody Producto p){
        try {
                producto.saveProducto(p);
            return ResponseEntity.ok("El producto fue creado correctamente");
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al crear el producto: " + ex.getMessage());
        }
    }

    // Endpoint para obtener todos los productos
    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return producto.getProductos();
    }

    // Endpoint para obtener un producto por su ID
    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> getProductos(@PathVariable int id){
        Producto productoEncontrado = producto.getProducto(id);
        if (productoEncontrado != null) {
            return ResponseEntity.ok(productoEncontrado);
        } else {
            // Si el producto no se encuentra, se devuelve una respuesta de error
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Endpoint para eliminar un producto por su ID
    @DeleteMapping("/productos/eliminar/{id}")
    public ResponseEntity<String> deleteProducto(@PathVariable int id){
        try {
            producto.deleteProducto(id);
            return ResponseEntity.ok("Se eliminó el producto con el id " + id);
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al eliminar el producto: " + ex.getMessage());
        }
    }

    // Endpoint para actualizar un producto por su ID
    @PutMapping("/productos/editar/{id}")
    public ResponseEntity<String> updateProducto(@PathVariable int id, String nombre, String marca, Double costo, Double cantDisponible){
        try {
            producto.updateProducto(id, nombre, marca, costo, cantDisponible);
            return ResponseEntity.ok("Se modificó el producto correctamente");
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al modificar el producto: " + ex.getMessage());
        }
    }

    // Endpoint para obtener la lista de productos con stock menor a un número específico
    @GetMapping("/productos/stockMenorA/{nro}")
    public ResponseEntity<List<Producto>> getListaStockMenor(@PathVariable int nro){
        try {
            List<Producto> listaProductos = producto.getListaStockMenor(nro);
            return ResponseEntity.ok(listaProductos);
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
