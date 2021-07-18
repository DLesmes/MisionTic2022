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
public class Empleados {
    
    private int dni;
    private String nombre, posicion;
    private int salario;

    public Empleados(int dni, String nombre, String posicion, int salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getSalario() {
        return salario;
    }
    
    public String verEmpleados(){
        String infoEmpleados="Empleado " + getNombre() + 
        " posición "+getPosicion() + " salario $"+getSalario();
        return infoEmpleados;
    }
    
    
}
