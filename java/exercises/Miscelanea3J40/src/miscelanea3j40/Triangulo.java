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
public class Triangulo extends Figura{
 
    private int base,altura;

    public Triangulo(String tipo,int base, int altura) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return (double)(getBase()*getAltura()/2);
    }
    
    public void infoTriangulo(){
        System.out.println("Triangulo creado");
        System.out.println("Tipo de triangulo "+ super.getTipo());
        System.out.println("El área del triangulo es "+ area());
    }
    
}
