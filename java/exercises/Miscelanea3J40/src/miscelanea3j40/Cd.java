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
public class Cd extends Producto{
    
    private String genero;

    public Cd(int PLU, String nombre, int precio,String genero) {
        super(PLU, nombre, precio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    
    public String infoCD(){
        String datosCD=super.verProducto() +"\ngenero musical "
        + getGenero();
        return datosCD;
    }
    
}
