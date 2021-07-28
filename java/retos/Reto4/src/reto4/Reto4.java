/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

/**
 *
 * @author asf
 */
public class Reto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.addTelefono("333333");
        u.addTelefono("111111");
        u.addTelefono("222222");
        u.addTelefono("222222");
        u.mostrarTelefonos();
    }
    
}
