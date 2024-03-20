package com.CrudCompleto.crud.Service;

import com.CrudCompleto.crud.Models.Mascota;
import com.CrudCompleto.crud.Reposity.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    IMascotaRepository mascota;

    @Override
    public List<Mascota> getMascotas() {
        return mascota.findAll();
    }

    @Override
    public Mascota getMascota(int id) {
        return mascota.findById(id).orElse(null);
    }

    @Override
    public void deleteMascota(int id) {
        mascota.deleteById(id);
    }

    @Override
    public void saveMascota(Mascota M) {
        mascota.save(M);
    }

    @Override
    public void updateMascota(Mascota m) {
        this.saveMascota(m);
    }
}
