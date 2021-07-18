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
public class Mueble {
    
    //atributos
    private String Color;
    private double Alto,Ancho,Largo;
    private String Material;
    
    //constructor

    public Mueble(String Color, double Alto, double Ancho, double Largo, String Material) {
        this.Color = Color;
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Largo = Largo;
        this.Material = Material;
    }
    
    private double volumenMueble(){
        double volumen;
        volumen = this.Alto*this.Ancho*this.Largo;
        return volumen;
    }
    
    public void infoMueble(){
        System.out.println("\n");
        System.out.println("Color del mueble " + Color);
        System.out.println("Material del mueble " + Material);
        System.out.println("Dimensiones del mueble:");
        System.out.println("Alto " +Alto);
        System.out.println("Ancho "+Ancho);
        System.out.println("Largo " +Largo);
        System.out.println("Volumen del mueble " + this.volumenMueble() + " m^2");
        
    }
    
}
