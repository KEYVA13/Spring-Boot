package com.CrudCompleto.crud.Controllers;

import com.CrudCompleto.crud.Models.Mascota;
import com.CrudCompleto.crud.Service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    IMascotaService mascota;

    @PostMapping("/addMascota")
    public String addMascota(@RequestBody Mascota m){
        mascota.saveMascota(m);
        return "se inserto con exito";
    }
}
