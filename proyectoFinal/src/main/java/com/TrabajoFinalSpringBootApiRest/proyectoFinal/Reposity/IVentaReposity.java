package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Reposity;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Dto.VentaInfo;
import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IVentaReposity extends JpaRepository<Venta,Integer> {
    @Query("SELECT v FROM Venta v WHERE v.fecha = :fechaVenta")
    List<Venta> obtenerDatosFecha(Date fechaVenta);

    @Query("SELECT v FROM Venta v WHERE v.total = (SELECT MAX(v2.total)FROM Venta v2)")
    Venta getMayorVenta();

}
