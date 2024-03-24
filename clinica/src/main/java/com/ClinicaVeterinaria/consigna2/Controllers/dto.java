package com.ClinicaVeterinaria.consigna2.Controllers;

import com.ClinicaVeterinaria.consigna2.Dto.Dto;
import com.ClinicaVeterinaria.consigna2.Service.IDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class dto {

    @Autowired
    IDtoService dtoService;

    @GetMapping("/datosConvinados")
    public List<Dto> listadoConvinado(){

        return dtoService.getListado();

    }


}
