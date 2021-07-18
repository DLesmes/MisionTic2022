/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea3j40;

import java.util.Scanner;

/**
 *
 * @author Carlos_Garcia
 */
public class Socio {
    
    private String nombreSocio;
    private int antiguedad;

    public Socio(Scanner datosSocio) {
        System.out.println("Ingrese el nombre del socio");
        this.nombreSocio = datosSocio.next();
        System.out.println("Ingrese la antigüedad del socio");
        this.antiguedad = datosSocio.nextInt();
        
    }

    public String getNombreSocio() {
        String name = nombreSocio+ " es el socio que tiene la mayor"
        + " antigüedad de " + getAntiguedad() + " años";
        return name;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
    
}
