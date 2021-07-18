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
public class Empleado extends Persona{

    private int sueldo;

    public Empleado(int sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    public String verEmpleado(){
        String info_empleado= super.verPersona() + 
            " el sueldo es $ " + getSueldo();
        return info_empleado;
    }
    
}
