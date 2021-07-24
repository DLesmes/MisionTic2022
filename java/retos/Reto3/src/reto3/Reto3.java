/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

/**
 *
 * @author asf
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alimento banana = new Alimento(120);
        Alimento raices = new Alimento(60);
        Alimento platano = new Alimento(78.5);
        Gorila gorila = new Gorila(150.5, 1.67);

        Alimento alimentos[] = new Alimento[3];
        alimentos[0] = banana;
        alimentos[1] = raices;
        alimentos[2] = platano;
        gorila.setAlimsIngeridos(alimentos);

        System.out.println(gorila.getPeso());
        System.out.println(gorila.getPesoAlims());        
        System.out.println(Math.round(gorila.getIMC()));
    }
    
}
