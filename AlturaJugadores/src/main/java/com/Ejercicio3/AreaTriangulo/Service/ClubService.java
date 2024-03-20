package com.Ejercicio3.AreaTriangulo.Service;

import com.Ejercicio3.AreaTriangulo.Model.Jugador;
import com.Ejercicio3.AreaTriangulo.Reposity.ClubReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {
    @Autowired
    ClubReposity repository;
    public double addJugadores(List<Jugador> jugadores){
        repository.addJugadores(jugadores);
        Double promedio = sacarPromedio(jugadores);
        return promedio;
    }

    public Double sacarPromedio(List<Jugador> jugadores){
        Double resultado = 0.0;
        for (Jugador j : jugadores){
            resultado += j.getAltura();
        }
        return (resultado/ 5);
    }
}
