package com.ClinicaVeterinaria.consigna2.Controllers;

import com.ClinicaVeterinaria.consigna2.Models.Mascota;
import com.ClinicaVeterinaria.consigna2.Service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    IMascotaService mascotaService;

    @GetMapping("/Mascota/traer")
    public List<Mascota> getMascotas(){

        return mascotaService.getMascotas();
    }

    @GetMapping("/Mascota/traer/{id}")
    public Mascota getMascota(@PathVariable int id){

        return mascotaService.getMascota(id);
    }

    @DeleteMapping("/Mascota/delete/{id}")
    public void deleteMascota(@PathVariable int id){
        mascotaService.deleteMascota(id);
    }

    @PostMapping("/Mascota/Crear")
    public void addMascota(@RequestParam Mascota mascota){
        mascotaService.saveMascota(mascota);
    }

    @PutMapping("/Mascota/Editar")
    public void updateMascota(@RequestBody Mascota mascota){
        mascotaService.updateMascota(mascota);
    }

    @GetMapping("/Mascota/filtro")
    public List<Mascota> filtroMascotas(@RequestParam String especie,@RequestParam String raza){
        return mascotaService.listadoFiltro(especie,raza);
    }

}
