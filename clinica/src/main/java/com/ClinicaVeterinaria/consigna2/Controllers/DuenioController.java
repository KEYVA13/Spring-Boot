package com.ClinicaVeterinaria.consigna2.Controllers;

import com.ClinicaVeterinaria.consigna2.Models.Duenio;
import com.ClinicaVeterinaria.consigna2.Service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    IDuenioService duenioService;

    @GetMapping("/Duenio/traer")
    public List<Duenio> getDuenios(){

        return duenioService.getDuenios();
    }

    @GetMapping("/Duenio/traer/{id}")
    public Duenio getDuenio(@PathVariable int id){

        return duenioService.getDuenio(id);
    }

    @DeleteMapping("/Duenio/delete/{id}")
    public void deleteDuenio(@PathVariable int id){
        duenioService.deleteDuenio(id);
    }

    @PostMapping("/Duenio/Crear")
    public void addDuenio(@RequestParam Duenio duenio){
        duenioService.saveDuenio(duenio);
    }

    @PutMapping("/Duenio/Editar")
    public void updateDuenio(@RequestBody Duenio duenio){
        duenioService.updateDuenio(duenio);
    }



}
