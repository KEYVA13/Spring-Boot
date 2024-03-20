package com.Ejercicio3.AreaTriangulo.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculosService {

    public int calcularArea(int area,int altura){
        return  ((area *altura) / 2);
    }

    public int suma(int n1,int n2){
        return  n1 + n2;
    }

    public int resta(int n1,int n2){
        return  n1 - n2;
    }

    public int division(int n1,int n2) {
        if (n2 != 0) {
            return n1 / n2;
        }
        return -1;
        //hacer aviso etc
    }

    public int multiplicacion(int n1,int n2){
        return  n1 * n2;
    }

}
