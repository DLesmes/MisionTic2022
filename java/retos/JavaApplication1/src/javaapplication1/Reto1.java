/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author asf
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(calcularPorcentajeBono(10,500000));
        System.out.println(calcularPorcentajeBono(9,500000));
        System.out.println(calcularPorcentajeBono(5,500000));
        System.out.println(calcularPorcentajeBono(4,500000));
        System.out.println(calcularPorcentajeBono(3,500000));
        System.out.println(calcularPorcentajeBono(2,500000));
        System.out.println(calcularPorcentajeBono(1,500000));
        System.out.println(calcularPorcentajeBono(23,500000));
    }
    public static double calcularPorcentajeBono(int anios,float bono) {
        double porcentaje;
        //tu codigo aca
        if (anios >= 10){
            porcentaje = 0.3;
        } else if (anios >= 5 && anios < 10){
            porcentaje = 0.2;
        } else if (anios >= 3 && anios < 5){
            porcentaje = 0.1;
        } else {
            porcentaje = 0.05;
        }   
        return porcentaje*bono;
    }
}
