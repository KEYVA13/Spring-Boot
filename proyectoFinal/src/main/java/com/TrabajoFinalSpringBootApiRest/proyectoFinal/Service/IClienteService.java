package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Service;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClienteService {
    public List<Cliente> getClientes();
    public Cliente getCliente(int id);

    public void saveCliente(Cliente c);

    public void deleteCliente(int id);

    public void updateCliente(int id,String nombre, String apellido, String dni);
}
