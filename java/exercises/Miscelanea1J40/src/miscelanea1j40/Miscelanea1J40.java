/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea1j40;

import java.util.Scanner;

/**
 *
 * @author Carlos_Garcia
 */
public class Miscelanea1J40 { 
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       //System.out.println(calcularPorcentajeBono(23,500000));
        Scanner datos_teclado = new Scanner(System.in);
        //variables_java();
        //ejercicio3(datos_teclado);
        //ejercicio4(datos_teclado);
        int preguntas = 100, correctas=30;
        
        System.out.println(Ejemplo4TipoReto(10, 8));
        System.out.println(Ejemplo4TipoReto(100, 50));
        System.out.println(Ejemplo4TipoReto(preguntas, correctas));
        System.out.println(Ejemplo4TipoReto(12,5));
     
        //ejercicio6(datos_teclado);
        
        int contador=1;
        
        while(contador<=100){
            int dato;
            dato = contador++;
            System.out.print(" " + dato);
            //contador = contador+1;
        }
        
        int numeros, x=1;
        
        System.out.println("\nIngrese el valor final");
        numeros = datos_teclado.nextInt();
        
        while(x<=numeros){
            System.out.print(" "+x);
            x = x+1;
        }
        
        //CICLOS FOR 
        
        for (int i=0; i<5; i++){
            System.out.println(i);
        }
        
        for (int i=0; i<=10; i=i+2){
            System.out.print(" "+i);
        }
        
    }        

    static void ejercicio6(Scanner datos_teclado) {
        float sueldo, aumento,sueldoTotal;
        int antiguedad;
        System.out.println("Ingrese el sueldo del empleado");
        sueldo = datos_teclado.nextFloat();
        System.out.println("Ingrese la antiguedad en años ");
        antiguedad = datos_teclado.nextInt();
        if(sueldo <1000000 && antiguedad >=10){
            aumento = sueldo*0.2f;
            sueldoTotal = sueldo+aumento;
            System.out.println("El nuevo sueldo es "+sueldoTotal);
        } else if(sueldo<1000000 && antiguedad<10){
            aumento = sueldo*0.05f;
            sueldoTotal = sueldo+aumento;
            System.out.println("El nuevo sueldo es "+ sueldoTotal);
        } else {
            System.out.println("El sueldo es "+ sueldo);
        }
    }

    static void ejercicio5(Scanner datos_teclado) {
        int numero1, numero2, numero3;
        System.out.println("Ingrese el valor 1");
        numero1 = datos_teclado.nextInt();
        System.out.println("Ingrese el valor 2");
        numero2 = datos_teclado.nextInt();
        System.out.println("Ingrese el valor 3");
        numero3 = datos_teclado.nextInt();
        if( numero1>numero2 && numero1>numero3){
            System.out.println("El número mayor es "+numero1);
        } else {
            if(numero2 >numero3){
                System.out.println("El número mayor es" +numero2);
            } else {
                System.out.println("El mayor es " + numero3);
            }
        }
    }

    public static double Ejemplo4TipoReto(int totalPreguntas, int TotalCorrectas){
        double porcentaje;
        porcentaje = (TotalCorrectas*100)/totalPreguntas;
        if (porcentaje>=90){
            //System.out.println("Nivel es máximo " + porcentaje);
        } else if (porcentaje >=75 && porcentaje<90) {
            //System.out.println("Nivel es medio "+ porcentaje);
        } else if (porcentaje >=50 && porcentaje<75){
            //System.out.println("Nivel es regular " + porcentaje);
        } else {
            //System.out.println("Fuera de nivel " + porcentaje);
        }
        return porcentaje;
    }
    
    static void ejercicio4(Scanner datos_teclado) {
        int totalPreguntas, totalCorrectas;
        double porcentaje;
        System.out.println("Ingrese el total de preguntas");
        totalPreguntas = datos_teclado.nextInt();
        System.out.println("Ingrese el total de preguntas contestadas correctamente");
        totalCorrectas = datos_teclado.nextInt();
        porcentaje = (totalCorrectas*100)/totalPreguntas;
        if (porcentaje>=90){
            System.out.println("Nivel es máximo " + porcentaje);
        } else if (porcentaje >=75 && porcentaje<90) {
            System.out.println("Nivel es medio "+ porcentaje);
        } else if (porcentaje >=50 && porcentaje<75){
            System.out.println("Nivel es regular " + porcentaje);
        } else {
            System.out.println("Fuera de nivel " + porcentaje);
        }
    }
    
    static void ejercicio3(Scanner scaner){
        int numero1, numero2, numero3;
        double promedio;
        System.out.println("Ingrese el valor 1");
        numero1 = scaner.nextInt();
        
        System.out.println("Ingrese el valor 2");
        numero2 = scaner.nextInt();
        
        System.out.println("Ingrese el valor 3");
        numero3 = scaner.nextInt();
        
        promedio = (double)(numero1+numero2+numero3)/3; //casting explicito
        
        if (promedio>=7){
            System.out.printf("Promocionado con prom %.3f",promedio);
        } else {
            if (promedio>= 4){
            System.out.printf("Regular con prom %.3f " , promedio);
            } else {
            System.out.printf("Reprobado con prom %.4f" , promedio);
            }
        }
    }

    static void variables_java() {
        //ejercicio1(datos_teclado);
        //DECLARACION DE VARIABLES EN JAVA
        int valor1;
        String cadena;
        double valor_doble;
        float valor_float;
        boolean valor_boleano;
        
        //INICIALIZAR LAS VARIABLES
        valor1 = 10;
        valor_doble = 32.5;
        cadena = "Hola "+valor1+ " mision tic " + String.valueOf(valor_doble); //concatenar
        valor_float = (float) 45.98; //parsing o casting explicito
        valor_float = 34.3f;
        System.out.println(cadena);
        System.out.println("Tipo de dato de la variable cadena " + cadena.getClass().getSimpleName());//type(variable) el tipo de dato de la variable
        System.out.println("Tipo de dato de la variable valor1 " + ((Object)valor1).getClass().getSimpleName());//casting type(variable) el tipo de dato de la variable
        System.out.println("Tipo de dato de la variable valor_doble " + ((Object)valor_doble).getClass().getSimpleName());
        //getSimpleName() devuelve el nombre simple de la clase eje String, Double, Integer
        //CONSTANTE
        final double PI = 3.14159;
    }
    
     
    static void ejercicio1(Scanner datos_teclado) {
        float sueldo;
        System.out.println("Ingrese el sueldo:");
        sueldo = datos_teclado.nextFloat();
        
        if (sueldo>3000){
            System.out.println("La persona debe pagar impuestos");
        } else {
            System.out.println("La persona NO debe pagar impuestos");
        }
        
    }
    
    public static double calcularPorcentajeBono(int anios,int bono) {
        double porcentaje=0.3;
        //tu codigo aca
        
        return porcentaje*bono;
    }
    
    
}
