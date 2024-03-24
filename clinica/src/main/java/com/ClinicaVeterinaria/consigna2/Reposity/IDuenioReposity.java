package com.ClinicaVeterinaria.consigna2.Reposity;

import com.ClinicaVeterinaria.consigna2.Models.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioReposity extends JpaRepository<Duenio,Integer> {}
