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
public class Animal {
    
    //ATRIBUTOS DE LA CLASE
    
    private String Nombre;
    private int Edad;
    private String Especie;
    
    //CONSTRUCTOR 
    public Animal(String Nombre, int Edad, String Especie) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Especie = Especie;
    }
    
    //METODO PARA MOSTRAR LA INFORMACIÓN POR CONSOLA
    public void datosAnimal(){
        System.out.println("--------------");
        System.out.println("Nombre del animal "+this.Nombre);
        System.out.println("La edad del animal "+this.Edad);
        System.out.println("Especie del animal "+this.Especie);
        System.out.println("--------------");
        
    }
    
}
