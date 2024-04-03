package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Reposity;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteReposity extends JpaRepository<Cliente,Integer> {
}
