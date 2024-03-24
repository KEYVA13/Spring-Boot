package com.ClinicaVeterinaria.consigna2.Service;

import com.ClinicaVeterinaria.consigna2.Dto.Dto;
import com.ClinicaVeterinaria.consigna2.Models.Duenio;
import com.ClinicaVeterinaria.consigna2.Models.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

@Service
public class DtoService implements IDtoService{
    @Autowired
    IMascotaService mascotaService;
    @Autowired
    IDuenioService duenioService;

    public List<Dto> getListado(){
        Dto usuario = new Dto();
        List<Dto> listaDto = new ArrayList<Dto>();

        List<Mascota> listaMascotas = new ArrayList<Mascota>();

        listaMascotas = mascotaService.getMascotas();

        for (Mascota mascota : listaMascotas){
            usuario.setApellido_duenio(mascota.getId_duenio().getApellido());
            usuario.setEspecie(mascota.getEspecie());
            usuario.setRaza(mascota.getRaza());
            usuario.setNombre_duenio(mascota.getId_duenio().getNombre());
            usuario.setNombre_mascota(mascota.getNombre());

            listaDto.add(usuario);
        }

        return listaDto;

    }

}
