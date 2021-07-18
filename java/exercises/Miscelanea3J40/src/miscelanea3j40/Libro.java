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
public class Libro extends Producto{

    private String Editorial;

    public Libro(int PLU, String nombre, int precio,String Editorial) {
        super(PLU, nombre, precio);
        this.Editorial = Editorial;
    }

    public String getEditorial() {
        return Editorial;
    }
    
    public String verLibro(){
        String mensaje = super.verProducto()+ "\neditorial del libro "+
        getEditorial();
        return mensaje;
    }
    
}
