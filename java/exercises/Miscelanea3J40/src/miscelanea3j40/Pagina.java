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
public class Pagina {
    
    //atributos de la clase
    private String contenido;
    private int numero;
    
    //constructor

    public Pagina(String contenido, int numero) {
        this.contenido = new String (contenido);
        this.numero = numero;
    }

    public String getContenido() {
        return contenido;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
}
