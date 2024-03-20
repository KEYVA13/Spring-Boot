package com.CrudCompleto.crud.Service;

import com.CrudCompleto.crud.Models.Mascota;

import java.util.List;

public interface IMascotaService {
    public List<Mascota> getMascotas();
    public Mascota getMascota(int id);

    public void deleteMascota(int id);
    public void saveMascota(Mascota m);
    public void updateMascota(Mascota m);
}
