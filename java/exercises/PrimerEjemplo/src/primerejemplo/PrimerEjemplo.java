/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejemplo; 

import java.util.Scanner;


/**
 *
 * @author Carlos_Garcia
 */
public class PrimerEjemplo {

    /**
     * @param args the command line arguments
     */
    //declarar variables en java
    int Valor1=0, valor2, valor3;
    float Suma;
    String nombre_Usuario;
    double resultado;
    final double PI=3.1416; //constante y no puede cambiar
    static final double euler=2.7;
    
    public static void main(String[] args) {
         suma();
        //        System.out.println("Ingrese su nombre");
//datos de entrada a traves de la clase scanner
Scanner dato_por_teclado = new Scanner(System.in);
//almacena en la variable name
//        String name = dato_por_teclado.nextLine();
//        
//        System.out.println("Ingrese su edad");
//        int edad = dato_por_teclado.nextInt();
//        //datos de salida
//        System.out.println("Su nombre es: "+name + " su edad es: " +edad);
    }

    private static void suma() {
        // TODO code application logic here

        //datos de entrada a traves de la clase scanner
        Scanner dato_por_teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor 1");
        int sumador1, sumador2, resultado;
        sumador1 = dato_por_teclado.nextInt();
        System.out.println("Ingrese el valor 2");
        sumador2 = dato_por_teclado.nextInt();
        resultado = sumador1+sumador2;
        System.out.println("La suma es: " + resultado);
        
        //CONDICIONALES EN JAVA
        if (sumador1>sumador2){
            System.out.println("el mayor es " +sumador1);
        }
        else if(sumador1==sumador2)
        {
            System.out.println("ambos numeros son iguales");
        }
        else{
            System.out.println("el mayor es "+ sumador2);
        }
    }
    
}
