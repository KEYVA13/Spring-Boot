package com.CrudCompleto.crud.Service;

import com.CrudCompleto.crud.Models.Persona;
import com.CrudCompleto.crud.Reposity.IPersonaReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    IPersonaReposity persona;

    @Override
    public List<Persona> getPersonas() {
        return persona.findAll();
    }

    @Override
    public Persona getPersona(int id) {
        return persona.findById(id).orElse(null);
    }

    @Override
    public void deletePersona(int id) {
        persona.deleteById(id);
    }

    @Override
    public void savePersona(Persona p) {
        persona.save(p);
    }

    @Override
    public void updatePersona(int id, String nombre, String apellido, int edad) {
    Persona usuario = this.getPersona(id);

    usuario.setNombre(nombre);
    usuario.setApellido(apellido);
    usuario.setEdad(edad);

    persona.save(usuario);
    }

    public void DiferenteUpdatePersona(Persona p){
        this.savePersona(p);
    }
}
