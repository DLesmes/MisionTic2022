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
public class Actor {
    
    private String nombre;
    private int nacimiento;

    public Actor(String nombre, int nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNacimiento() {
        return nacimiento;
    }
    
    public void mostrarActor(){
        System.out.println("Nombre del actor "+getNombre());
        System.out.println("fecha nacimiento ddmmaa "+getNacimiento());
    }
 }
