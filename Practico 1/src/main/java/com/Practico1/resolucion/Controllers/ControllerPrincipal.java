package com.Practico1.resolucion.Controllers;

import com.Practico1.resolucion.Paciente;
import com.Practico1.resolucion.Plato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerPrincipal {

    @GetMapping("/plato/{id}")
    public Plato listaPlato(@PathVariable int id){
        List<Plato> menu = new ArrayList<Plato>();
        menu.add(new Plato(1,"Pizza",1000,"Muchos gustos"));
        menu.add(new Plato(2,"Verduras",100,"Mucha variedad"));
        menu.add(new Plato(3,"Carne",113,"Muy tierna"));
        menu.add(new Plato(4,"Papas",1000,"Muy ricas"));
        menu.add(new Plato(5,"Rabas",1000,"No te la pierdas"));

        if(id >= 0 && id < menu.size()){
            return menu.get(id);
        }else{
            return null;
        }
    }

    @GetMapping("/Pacientes")
    public List<Paciente> listaPacientes(){
        List<Paciente> lista = new ArrayList<Paciente>();
        lista.add(new Paciente(1,1234,"Kevin","Gonzalez", LocalDate.of(2003,03,13)));
        lista.add(new Paciente(2,4321,"Santi","Suarez", LocalDate.of(2000,04,12)));
        lista.add(new Paciente(3,1357,"Valentino","Cancina", LocalDate.of(2007,01,11)));
        lista.add(new Paciente(4,7421,"Diego","Gonzalez", LocalDate.of(2004,07,24)));

        return lista;
    }


    @GetMapping("/PacientesMenoresDeEdad")
    public List<Paciente> PacientesMenoresDeEdad(){
        List<Paciente> lista = new ArrayList<Paciente>();
        List<Paciente> listaMenores = new ArrayList<Paciente>();
        LocalDate fechaActual = LocalDate.now();
        lista.add(new Paciente(1,1234,"Kevin","Gonzalez", LocalDate.of(1900,03,13)));
        lista.add(new Paciente(2,4321,"Santi","Suarez", LocalDate.of(2000,04,12)));
        lista.add(new Paciente(3,1357,"Valentino","Cancina", LocalDate.of(2007,01,11)));
        lista.add(new Paciente(4,7421,"Diego","Gonzalez", LocalDate.of(2004,07,24)));


        for(Paciente p : lista){
            Period anios = Period.between(p.getFecha(),fechaActual);
            if(anios.getYears() < 18 ){
                System.out.println("cant anios " + anios.getYears());
                listaMenores.add(p);
            }
        }

        return listaMenores;
    }


}
