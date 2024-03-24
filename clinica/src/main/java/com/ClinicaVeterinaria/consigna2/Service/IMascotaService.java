package com.ClinicaVeterinaria.consigna2.Service;

import com.ClinicaVeterinaria.consigna2.Models.Mascota;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMascotaService {

    public List<Mascota> getMascotas();

    public Mascota getMascota(int id);

    public void saveMascota(Mascota mascota);

    public void updateMascota(Mascota mascota);

    public void deleteMascota(int id);

    public List<Mascota> listadoFiltro(String Especie,String raza);


}
