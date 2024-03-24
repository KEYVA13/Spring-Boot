package com.ClinicaVeterinaria.consigna2.Service;

import com.ClinicaVeterinaria.consigna2.Models.Duenio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDuenioService {

    public List<Duenio> getDuenios();
    public Duenio getDuenio(int id);

    public void saveDuenio(Duenio duenio);
    public void deleteDuenio(int id);

    public void updateDuenio(Duenio duenio);

}
