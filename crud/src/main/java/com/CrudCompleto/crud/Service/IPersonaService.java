package com.CrudCompleto.crud.Service;

import com.CrudCompleto.crud.Models.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersonas();
    public Persona getPersona(int id);

    public void deletePersona(int id);
    public void savePersona(Persona P);
    public void updatePersona(int id, String nombre, String apellido,int edad);

}
