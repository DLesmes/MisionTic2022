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
public class Telefono {
    
    private String marca,modelo;
    private int precio, capacidad,tamPantalla, peso;
    
    private double descuento;

    public Telefono(String marca, String modelo, int precio, int capacidad, int tamPantalla, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.capacidad = capacidad;
        this.tamPantalla = tamPantalla;
        this.peso = peso;
        this.descuento =this.descuento();
    }
    
    private double descuento(){
        double precioMovil, dcto;
        
        precioMovil = this.precio;
        if(precioMovil <750000){
            dcto = precioMovil*0.02;
        } else {
            dcto=0;
        }
        return dcto;
    }
    
    public void infoTelefono(){
        System.out.println("\n");//salto de linea
        System.out.println("Marca "+this.marca);
        System.out.println("Modelo " +this.modelo);
        System.out.println("Precio $ "+ this.precio);
        System.out.println("Capacidad " +this.capacidad + " [GB]");
        System.out.println("Tamaño de la pantalla " +this.tamPantalla);
        System.out.println("Precio del teléfono " + this.precio);
        System.out.println("Descuento " + this.descuento);
    }
    
}
