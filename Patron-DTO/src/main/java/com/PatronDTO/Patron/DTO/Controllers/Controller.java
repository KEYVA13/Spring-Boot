package com.PatronDTO.Patron.DTO.Controllers;

import com.PatronDTO.Patron.DTO.Inquilino;
import com.PatronDTO.Patron.DTO.Propiedad;
import com.PatronDTO.Patron.DTO.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO descripcion(@PathVariable Long id){
        Inquilino inquilino = new Inquilino(1L,"1234","Kevin","Gonzalez","Jugador de Futbol");
        Propiedad propiedad = new Propiedad(1L,"Depto","Actis", 500.0,100000.0);
        PropiedadDTO datosGenerales = new PropiedadDTO();

        datosGenerales.setDireccion(propiedad.getDireccion());
        datosGenerales.setTipo(propiedad.getTipo_propiedad());
        datosGenerales.setApellido_inquilino(inquilino.getApellido());
        datosGenerales.setNombre_inquilino(inquilino.getNombre());
        datosGenerales.setId_propiedad(propiedad.getId_propiedad());
        datosGenerales.setValor_alquiler(propiedad.getValor_alquiler());

        return datosGenerales;

    }

}
