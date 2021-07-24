package reto3;


import reto3.Alimento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asf
 */
public class Animal {
    protected double peso, altura;
    protected Alimento alimsIngeridos [];

    public Animal(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public Alimento[] getAlimsingeridos() {
        return alimsIngeridos;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
        this.alimsIngeridos = alimsIngeridos;
    }
    
    public double getIMC(){
        return this.peso/(this.altura*this.altura);
    }
}
