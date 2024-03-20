package com.Ejercicio3.AreaTriangulo.Controllers;

import com.Ejercicio3.AreaTriangulo.Service.CalculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    CalculosService calculos;

    @GetMapping("/CalcularArea/{base}/{altura}")
    public int areaTriangulo(@PathVariable int base,
                             @PathVariable int altura){

        return calculos.calcularArea(base,altura);
    }

    @GetMapping("/sumar")
    public int sumar(@RequestParam int numeroU,
                     @RequestParam int numeroD){

        return calculos.suma(numeroU,numeroD);

    }

    @GetMapping("/resta")
    public int resta(@RequestParam int n1,
                     @RequestParam int n2){

        return calculos.resta(n1,n2);

    }
    @GetMapping("/multiplicacion")
    public int multiplicacion(@RequestParam int n1,
                     @RequestParam int n2){

        return calculos.multiplicacion(n1,n2);

    }
    @GetMapping("/division")
    public int division(@RequestParam int n1,
                     @RequestParam int n2){

        return calculos.division(n1,n2);

    }
}
