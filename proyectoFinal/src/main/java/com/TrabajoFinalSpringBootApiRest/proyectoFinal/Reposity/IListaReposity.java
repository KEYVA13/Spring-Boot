package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Reposity;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Lista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IListaReposity extends JpaRepository<Lista,Integer> {
}
