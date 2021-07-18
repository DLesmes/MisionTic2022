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
public class Miscelanea3J40 {

    /**
     * @param args the command line arguments
     */
    static Scanner datos = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        Ejercicio5();
    }
    
    public static void Ejercicio1(){
        
        Persona person = new Persona("Pedro", 30);
        System.out.println("Objeto de la clase persona creado "
        + person.verPersona());
        
        Empleado elEmpleado = new Empleado(1000000,"Javier",25);
        System.out.println("Objeto empleado creado "
        + elEmpleado.verEmpleado());
        
    }
    
    public static void Ejercicio2(){
        System.out.println("Escribe el nombre del club");
        String Nombreclub = datos.nextLine();
        
        Club elclub = new Club(Nombreclub);
        System.out.println("El club " + elclub.getNombreClub());
        elclub.socioMayor();
    }
    
    public static void Ejercicio3(){
        
        Asalariado empAsalariado = new Asalariado("Pedro elias",19891221,21,200000);
        empAsalariado.infoAsalariado();
        
        EmpleadoDistribucion emplDistr = new EmpleadoDistribucion("Camila", 910912123,31,1500000,"Centro");
        emplDistr.datosEmpleDis();
        
        EmpleadoProduccion emplProduccion = new EmpleadoProduccion("Julio",109123112,20,2100000,"Noche");
        emplProduccion.infoEmpleProd();
    }
    
    public static void Ejercicio4(){
        Empleados empleados= new Empleados(235231,"Pedro Gomez", "Jefe despachos", 1000000);
        System.out.println("Datos objeto empleado\n"+empleados.verEmpleados());
        
        Gerente elGerente = new Gerente(9109201, "Alfredo Diaz", "Gerente",2500000,800000," Audi Q4");
        System.out.println("Datos del objeto gerente\n"+elGerente.muestraGerente());
    }

    public static void Ejercicio5(){
        
        Libro book = new Libro(10923, "Cien años de soledad", 300000, "Alfaguara");
        System.out.println("Objeto libro\n"+book.verLibro());
        
        Cd elCD= new Cd(983100, "Queen ", 90000, "Rock");
        System.out.println("Objeto CD\n"+elCD.infoCD());
    }
}
