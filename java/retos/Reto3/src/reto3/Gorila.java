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
public class Gorila extends Animal {

    public Gorila(double peso, double altura){
        super(peso, altura);
        //this.peso = peso;
        //this.altura = altura;            
    }

    
    public double getPesoAlims(){
        int meal_weight = 0;
        for (Alimento portion : alimsIngeridos){
            meal_weight += portion.getGramos();
        }
        return meal_weight;
    }

    @Override
    public double getIMC() {
        double total_weight = 0;
        total_weight = this.peso+ this.getPesoAlims()/1000;
        return total_weight/(this.altura*this.altura);
    }
}
