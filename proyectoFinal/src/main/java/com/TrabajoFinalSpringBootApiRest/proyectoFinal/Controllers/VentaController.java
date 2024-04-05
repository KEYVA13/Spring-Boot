package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Controllers;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto.DatosCliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto.VentaInfo;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Venta;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
public class VentaController {

    // Se inyecta el servicio de ventas
    @Autowired
    IVentaService venta;

    // Endpoint para crear una venta
    @PostMapping("/ventas/crear")
    public ResponseEntity<String> saveVenta(@RequestBody Venta v){
        try {
            venta.saveVenta(v);
            return ResponseEntity.ok("Se agregó la venta correctamente");
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al agregar la venta: " + ex.getMessage());
        }
    }

    // Endpoint para obtener todas las ventas
    @GetMapping("/ventas")
    public List<Venta> getVenta(){
        return venta.getVentas();
    }

    // Endpoint para obtener una venta por su ID
    @GetMapping("/ventas/{id}")
    public ResponseEntity<Venta> getVenta(@PathVariable int id){
        Venta ventaEncontrada = venta.getVenta(id);
        if (ventaEncontrada != null) {
            return ResponseEntity.ok(ventaEncontrada);
        } else {
            // Si la venta no se encuentra, se devuelve una respuesta de error
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Endpoint para eliminar una venta por su ID
    @DeleteMapping("/ventas/eliminar/{id}")
    public ResponseEntity<String> deleteVenta(@PathVariable int id){
        try {
            venta.deleteVenta(id);
            return ResponseEntity.ok("Se eliminó la venta con el id " + id);
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al eliminar la venta: " + ex.getMessage());
        }
    }

    // Endpoint para actualizar una venta por su ID
    @PutMapping("/ventas/editar/{id}")
    public ResponseEntity<String> updateVenta(@PathVariable int id,
                                              @RequestParam("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha,
                                              @RequestParam("total") Double total,
                                              @RequestParam("cliente") Cliente cliente){
        try {
            venta.updateVenta(id, fecha, total, cliente);
            return ResponseEntity.ok("Se modificó la venta con éxito");
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al modificar la venta: " + ex.getMessage());
        }
    }
    // Endpoint para obtener información de ventas para una fecha específica
    @GetMapping("/ventas/infoVentas")
    public ResponseEntity<VentaInfo> ventasInfo(@RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fecha){
        try {
            VentaInfo ventaInfo = venta.getVentasInfo(fecha);
            return ResponseEntity.ok(ventaInfo);
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    // Endpoint para obtener la venta de mayor total
    @GetMapping("/ventas/mayorVenta")
    public ResponseEntity<DatosCliente> getMayorVenta(){
        try {
            DatosCliente mayorVenta = venta.getMayorVenta();
            return ResponseEntity.ok(mayorVenta);
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }


}
