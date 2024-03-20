package com.CrudCompleto.crud.Reposity;

import com.CrudCompleto.crud.Models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaReposity extends JpaRepository<Persona,Integer> {}
