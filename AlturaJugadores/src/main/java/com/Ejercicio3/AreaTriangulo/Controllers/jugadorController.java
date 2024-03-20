package com.Ejercicio3.AreaTriangulo.Controllers;

import com.Ejercicio3.AreaTriangulo.Model.Jugador;
import com.Ejercicio3.AreaTriangulo.Service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class jugadorController {

    @Autowired
    ClubService Club;

    @PostMapping("/addDB")
    public String addDB(@RequestBody List<Jugador> jugadores){

        Double resultado = Club.addJugadores(jugadores);

        return "Promedio de Altura del equipo es " + resultado;
    }
}
