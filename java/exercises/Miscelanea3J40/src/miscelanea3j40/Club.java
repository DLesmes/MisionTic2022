/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea3j40;

import java.util.Scanner;

/**
 *
 * @author Carlos_Garcia
 */
public class Club {
    
    private String nombreClub;
    private Socio socio1, socio2, socio3;
    private Scanner datosClub;

    public Club(String nombreClub) {
        this.nombreClub = nombreClub;
        this.datosClub = new Scanner(System.in);
        
        this.socio1 = new Socio(datosClub);
        this.socio2 = new Socio(datosClub);
        this.socio3 = new Socio(datosClub);
    }

    public String getNombreClub() {
        return nombreClub;
    }
    
    public void socioMayor(){
        System.out.println("El socio de mayor antigüedad");
        if(socio1.getAntiguedad()>socio2.getAntiguedad() 
           && socio1.getAntiguedad() >socio3.getAntiguedad())
        {   System.out.println(socio1.getNombreSocio());
        } else {
            if(socio2.getAntiguedad()>socio3.getAntiguedad())
            { System.out.println(socio2.getNombreSocio());
            } else {
                System.out.println(socio3.getNombreSocio());
            }
        }
        
    }
    
}
