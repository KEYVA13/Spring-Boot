package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Reposity;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoReposity extends JpaRepository<Producto,Integer> {
    @Query("SELECT p FROM Producto p WHERE p.cantidad < ?1")
    List<Producto> findProductosWithCantidadMenorA(int cantidad);
}
