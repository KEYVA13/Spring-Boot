package com.CrudCompleto.crud.Reposity;

import com.CrudCompleto.crud.Models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota,Integer> {

}
