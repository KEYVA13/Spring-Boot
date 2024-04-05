package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Controllers;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    // Se inyecta el servicio de clientes
    @Autowired
    IClienteService cliente;

    // Endpoint para crear un cliente
    @PostMapping("/clientes/crear")
    public ResponseEntity<String> saveCliente(@RequestBody Cliente c){
        try {
            cliente.saveCliente(c);
            return ResponseEntity.ok("El cliente fue creado correctamente");
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al crear el cliente: " + ex.getMessage());
        }
    }

    // Endpoint para obtener todos los clientes
    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return cliente.getClientes();
    }

    // Endpoint para obtener un cliente por su ID
    @GetMapping("/clientes/{id}")
    public ResponseEntity<Cliente> getClientes(@PathVariable int id){
        Cliente clienteEncontrado = cliente.getCliente(id);
        if (clienteEncontrado != null) {
            return ResponseEntity.ok(clienteEncontrado);
        } else {
            // Si el cliente no se encuentra, se devuelve una respuesta de error
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Endpoint para eliminar un cliente por su ID
    @DeleteMapping("/clientes/eliminar/{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable int id){
        try {
            cliente.deleteCliente(id);
            return ResponseEntity.ok("Se elimino el cliente con el id " + id);
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al eliminar el cliente: " + ex.getMessage());
        }
    }

    // Endpoint para actualizar un cliente por su ID
    @PutMapping("/clientes/editar/{id}")
    public ResponseEntity<String> updateCliente(@PathVariable int id, String nombre, String apellido, String dni){
        try {
            cliente.updateCliente(id, nombre, apellido, dni);
            return ResponseEntity.ok("Se actualizaron los datos del cliente con el id " + id);
        } catch (Exception ex) {
            // Si ocurre un error, se devuelve una respuesta de error con un mensaje específico
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hubo un error al actualizar el cliente: " + ex.getMessage());
        }
    }
}