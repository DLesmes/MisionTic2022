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
public class Producto {

    private int PLU;
    private String nombre;
    private int precio;

    public Producto(int PLU, String nombre, int precio) {
        this.PLU = PLU;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPLU() {
        return PLU;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    public String verProducto(){
        System.out.println("Producto creado");
        String infoProducto= "Nombre "+getNombre()+ "\nPLU "+
        getPLU()+ " precio $ "+getPrecio() ;
        return infoProducto;
    }
    
}
