package com.ClinicaVeterinaria.consigna2.Service;

import com.ClinicaVeterinaria.consigna2.Models.Mascota;
import com.ClinicaVeterinaria.consigna2.Reposity.IMascotaReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaReposity mascotaReposity;

    @Override
    public List<Mascota> getMascotas() {
        return mascotaReposity.findAll();
    }

    @Override
    public Mascota getMascota(int id) {
        return mascotaReposity.findById(id).orElse(null);
    }

    @Override
    public void saveMascota(Mascota mascota) {
    mascotaReposity.save(mascota);
    }

    @Override
    public void updateMascota(Mascota mascota) {
    this.saveMascota(mascota);
    }

    @Override
    public void deleteMascota(int id) {
    mascotaReposity.deleteById(id);
    }

    public List<Mascota> listadoFiltro(String Especie,String raza){
        List<Mascota> listadoMascotas = new ArrayList<Mascota>();
        List<Mascota> listadoCumplenMascotas = new ArrayList<Mascota>();

        listadoMascotas = this.getMascotas();
        for (Mascota m : listadoMascotas){
            if(m.getEspecie().equals(Especie) && m.getRaza().equals(raza)){
                listadoCumplenMascotas.add(m);
            }
        }

        return listadoCumplenMascotas;
    }


}
