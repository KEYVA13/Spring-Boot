package com.ClinicaVeterinaria.consigna2.Service;

import com.ClinicaVeterinaria.consigna2.Models.Duenio;
import com.ClinicaVeterinaria.consigna2.Reposity.IDuenioReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService{

    @Autowired
    IDuenioReposity duenioReposity;
    @Override
    public List<Duenio> getDuenios() {
        return duenioReposity.findAll();
    }

    @Override
    public Duenio getDuenio(int id) {
        return duenioReposity.findById(id).orElse(null);
    }

    @Override
    public void saveDuenio(Duenio duenio) {
    duenioReposity.save(duenio);
    }

    @Override
    public void deleteDuenio(int id) {
    duenioReposity.deleteById(id);
    }

    @Override
    public void updateDuenio(Duenio duenio) {
    this.saveDuenio(duenio);
    }
}
