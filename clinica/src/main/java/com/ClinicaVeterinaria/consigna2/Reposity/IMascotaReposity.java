package com.ClinicaVeterinaria.consigna2.Reposity;

import com.ClinicaVeterinaria.consigna2.Models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaReposity extends JpaRepository<Mascota, Integer> {
}
