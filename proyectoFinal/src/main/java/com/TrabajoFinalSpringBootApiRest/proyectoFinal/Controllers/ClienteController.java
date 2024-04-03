package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Controllers;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    IClienteService cliente;

    @PostMapping("/clientes/crear")
    public void saveCliente(@RequestBody Cliente c){
        cliente.saveCliente(c);
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return cliente.getClientes();
    }

    @GetMapping("/clientes/{id}")
    public Cliente getClientes(@PathVariable int id){
       return cliente.getCliente(id);
    }

    @DeleteMapping("/clientes/eliminar/{id}")
    public void deleteCliente(@PathVariable int id){
        cliente.deleteCliente(id);
    }

    @PutMapping("/clientes/editar/{id}")
    public void updateCliente(@PathVariable int id,String nombre, String apellido, int dni){
        cliente.updateCliente(id,nombre,apellido,dni);
    }

}