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
public class Profesor {
    
    //CREACION DE ATRIBUTOS
    private int documento;
    private String nombres, apellidos;
    private int edad;
    private String profesion;
    
    //CONSTRUCTOR

    public Profesor(int documento, String nombres, String apellidos, int edad, String profesion) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.profesion = profesion;
    }
    
    public void mostrarProfesor(){
        System.out.println("++++++++++++++++");
        System.out.println("[Profesor]:");
        System.out.println("Documento: "+this.documento);
        System.out.println("Nombres: "+this.nombres);
        System.out.println("Apellidos: "+this.apellidos);
        System.out.println("Edad: "+this.edad);
        System.out.println("Profesión: "+this.profesion);
        System.out.println("++++++++++++++++");
    }
    
}
