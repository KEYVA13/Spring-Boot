package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Reposity.IClienteReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    IClienteReposity clienteReposity;

    @Override
    public List<Cliente> getClientes() {
        return clienteReposity.findAll();
    }

    @Override
    public Cliente getCliente(int id) {
        return clienteReposity.findById(id).orElse(null);
    }

    @Override
    public void saveCliente(Cliente c) {
        clienteReposity.save(c);
    }

    @Override
    public void deleteCliente(int id) {
        clienteReposity.deleteById(id);
    }

    @Override
    public void updateCliente(int id, String nombre, String apellido, int dni) {
        Cliente usuario = this.getCliente(id);

        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setDni(dni);

        this.saveCliente(usuario);
    }
}
