/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea3j40;

/**
 *
 * @author Carlos_Garcia
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    // constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public String verPersona(){
        String mensaje = "La persona " + getNombre() + 
        " tiene " + getEdad() +" años";
        return mensaje;
    }
    
    
}
