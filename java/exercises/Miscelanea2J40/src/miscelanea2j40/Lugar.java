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
public class Lugar {
    
    //atributos de la clase lugar
    private String Nombre,Direccion;
    private int Telefono;
    private String url,Comentario;
    private double valoracion;
    
    //CONSTRUCTOR DE LA CLASE LUGAR

    public Lugar(String Nombre, String Direccion, int Telefono, String url, String Comentario, double valoracion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.url = url;
        this.Comentario = Comentario;
        this.valoracion = valoracion;
    }
    
    //creacion del metodo verLugar
    public void verLugar(){
        System.out.println("**************");
        System.out.println("Nombre "+ Nombre);
        System.out.println("Direccion " +this.Direccion);
        System.out.println("Telefono " +this.Telefono);
        System.out.println("Url " +this.url);
        System.out.println("Comentario " +this.Comentario);
        System.out.println("Valoracion " +this.valoracion);
        System.out.println("**************");
    }
    
    
}
