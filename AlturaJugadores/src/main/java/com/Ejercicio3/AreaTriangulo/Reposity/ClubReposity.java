package com.Ejercicio3.AreaTriangulo.Reposity;

import com.Ejercicio3.AreaTriangulo.Model.Jugador;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClubReposity {

    public void addJugadores(List<Jugador> jugadores){
        List<Jugador> listaEquipo = new ArrayList<Jugador>();

        for( Jugador jugador : jugadores){
            listaEquipo.add(jugador);
        }
    }
}
