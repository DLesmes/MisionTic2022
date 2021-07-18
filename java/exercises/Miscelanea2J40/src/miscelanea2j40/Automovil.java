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
public class Automovil {
        
    //atributos de la clase
    
    private String placa, color;
    private int anio;
    private String marca;
    private int capacidadPasajeros, cilindraje, velActual;
    
    //constructor

    public Automovil(String placa, String color, int anio, String marca, int capacidadPasajeros, int cilindraje, int velActual) {
        this.placa = placa;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.cilindraje = cilindraje;
        this.velActual = velActual;
    }
    
    int velocidad(){
        int nuevaVelocidad;
        if(this.velActual>=90 ){
            nuevaVelocidad = this.velActual-20;
        } else {
            nuevaVelocidad = this.velActual;
        }
        return nuevaVelocidad;
    }
    
    public void datosAuto(){
        System.out.println("\n");//salto de linea
        System.out.println("Objeto de la clase automovil creado");
        System.out.println("Placa " +placa);
        System.out.println("Color " +color);
        System.out.println("Año "+ anio);
        System.out.println("Marca "+ marca);
        System.out.println("Capacidad pasajeros " + capacidadPasajeros);
        System.out.println("Cilindraje " + cilindraje);
        System.out.println("Velocidad actual " + velActual);
        System.out.println("Nueva velocidad: " + this.velocidad());
    }
}
