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
public class Cuadrado extends Figura{
    
    private int lado;

    public Cuadrado(String tipo,int lado) {
        super(tipo);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public double area() {
        return (double)(getLado()*getLado());
    }
    
    public void infoCuadrado(){
        System.out.println("\nCuadrado creado");
        System.out.println("El área del cuadrado es "+area());
    }
    
}
