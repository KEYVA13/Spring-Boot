package com.CrudCompleto.crud.Controllers;

import com.CrudCompleto.crud.Models.Persona;
import com.CrudCompleto.crud.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    IPersonaService persona;

    @GetMapping("/list")

    public List<Persona> listaPersonas(){
        return persona.getPersonas();
    }

    @GetMapping("list/{id}")
    public Persona listaID(@PathVariable int id){
        return persona.getPersona(id);
    }

    @PostMapping("/addPersona")
    public String addPersona(@RequestBody Persona p){
        persona.savePersona(p);
        return "Se inserto con exito";
    }

    @DeleteMapping("/deletePersona/{id}")
    public String borrarPersona(@PathVariable int id){
        persona.deletePersona(id);
        return "Se borro cone exito";
    }
    @PutMapping("/editPersona/{id}")

    public String editPersona(@PathVariable int id,
                              @RequestParam String nombre,
                              @RequestParam String apellido,
                              @RequestParam int edad){
        persona.updatePersona(id,nombre,apellido,edad);
        return "Se actualizaron los datos correctamente";
    }

    @PutMapping("/editPersona")
    public Persona editPersona(@RequestBody Persona p){
        persona.DiferenteUpdatePersona(p);
        return persona.getPersona(p.getId());
    }

}
