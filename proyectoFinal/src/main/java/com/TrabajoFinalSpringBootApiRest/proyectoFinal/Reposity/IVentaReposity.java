package com.TrabajoFinalSpringBootApiRest.proyectoFinal.Reposity;

import com.TrabajoFinalSpringBootApiRest.proyectoFinal.Models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IVentaReposity extends JpaRepository<Venta,Integer> {
    public List<Venta> findVentaWithListaByidVenta(int idVenta);

    @Query("SELECT SUM(v.total) FROM Venta v WHERE v.fecha = :fechaDia")
    public int getMontoTotalDia(@Param("fechaDia") Date fechaDia);

    @Query("SELECT COUNT(v.idVenta) FROM Venta v WHERE v.fecha = :fechaDia")
    public int getCantidadVentasDia(@Param("fechaDia") Date fechaDia);
}
