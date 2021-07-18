/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea2j40;

/**
 *
 * @author Carlos_Garcia
 */
public class Empleado {
    
    //atributos
    private String nombre, apellido;
    private int edad, antiguedad;
    private double sueldo;
    
    //constructor

    public Empleado(String nombre, String apellido, int edad, int antiguedad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }
    
    private String impuesto(){
        double salario;
        String mensaje;
        
        salario= this.sueldo;
        if(salario > 3043218){
            mensaje = "Si";
        } else {
            mensaje = "No";
        }
        return mensaje;
    }
    
    public void datosEmpleado(){
        System.out.println("\n");//salto de linea
        System.out.println("Empleado");
        System.out.println("Nombres " + nombre);
        System.out.println("Apellidos " + apellido);
        System.out.println("Edad " + edad);
        System.out.println("Antiguedad " +antiguedad);
        System.out.println("Sueldo " + sueldo);
        System.out.println("Debe pagar impuestos ? "+ this.impuesto());
    }
    
}
