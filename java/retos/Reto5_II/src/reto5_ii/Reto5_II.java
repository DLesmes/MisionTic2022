/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5_ii;

import CONTROLADOR.ControladorContactos;
import MODELO.ConsultasContacto;
import MODELO.Contactos;
import VISTA.JFContactos;

/**
 *
 * @author asf
 */
public class Reto5_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contactos contacto = new Contactos();
        ConsultasContacto consultas = new ConsultasContacto();
        JFContactos vista = new JFContactos();
        
        ControladorContactos controller = new ControladorContactos(contacto, consultas, vista);
        controller.iniciaVista();
        vista.setVisible(true);
    }
    
}
