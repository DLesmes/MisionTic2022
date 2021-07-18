/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea2j40;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos_Garcia
 */
public class Miscelanea2J40 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada_info = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio7();
    }

    private static void ejercicio1() {
        String name, specie;
        int age;
        
        System.out.println("Ingrese el nombre del animal:");
        name = entrada_info.nextLine();
        
        System.out.println("Ingrese la edad del animal:");
        age = entrada_info.nextInt();
        
        System.out.println("Ingrese la especie del animal:");
        entrada_info.nextLine();
        specie = entrada_info.nextLine();
        
        Animal animal1 = new Animal(name,age,specie);
        animal1.datosAnimal();
    }
    
    private static void ejercicio2(){
        String nombre, direccion, url, comentario;
        int telefono;
        double valoracion;
        
        System.out.println("Ingrese el nombre del lugar");
        nombre = entrada_info.nextLine();
        
        System.out.println("Ingrese la direccion del lugar");
        direccion = entrada_info.nextLine();
        
        System.out.println("Ingrese el telefono del lugar");
        telefono = entrada_info.nextInt();
        
        System.out.println("Ingrese la url del lugar");
        entrada_info.nextLine();
        url = entrada_info.nextLine();
        
        System.out.println("Ingrese un comentario sobre el lugar");
        comentario = entrada_info.nextLine();
        
        System.out.println("Ingrese una valoración al lugar");
        entrada_info.useLocale(Locale.ENGLISH);//escribir punto decimal para los decimales del float
        valoracion = entrada_info.nextDouble();
        
        Lugar elLugar = new Lugar(nombre, direccion, telefono, url, comentario, valoracion);
        elLugar.verLugar();
    }
    
    private static void ejercicio3(){
        int documento,edad;
        String nombres, apellidos, profesion;
        
        System.out.println("Ingrese el nombre del profesor");
        nombres=entrada_info.nextLine();
        
        System.out.println("Ingrese el apellido del profesor");
        apellidos=entrada_info.nextLine();
        
        System.out.println("Ingrese el documento del profesor");
        documento = entrada_info.nextInt();
        
        System.out.println("Ingrese la edad del profesor");
        edad = entrada_info.nextInt();
        
        System.out.println("Ingrese la profesión del profesor");
        entrada_info.nextLine();
        profesion = entrada_info.nextLine();
        
      //Clase    objeto      = instacia o cracion del objeto.
        Profesor elProfesor = new Profesor(documento,nombres,apellidos,edad,profesion);
        elProfesor.mostrarProfesor();
        
    }
    
    private static void ejercicio4(){

        String PLACA, COLOR, MARCA;
        int YEAR, CAP_PASAJEROS, CILINDRAJE, VEL_ACTUAL;
        
        System.out.println("Ingrese la placa del auto");
        PLACA= entrada_info.nextLine();
        
        System.out.println("Ingrese el color del auto");
        COLOR= entrada_info.nextLine();
        
        System.out.println("Ingrese la marca del auto");
        MARCA= entrada_info.nextLine();
        
        System.out.println("Ingrese el año del auto");
        YEAR = entrada_info.nextInt();
        
        System.out.println("Ingrese la capacidad de pasajeros del auto");
        CAP_PASAJEROS = entrada_info.nextInt();
        
        System.out.println("Ingrese el cilindraje del auto");
        CILINDRAJE = entrada_info.nextInt();
        
        System.out.println("Ingrese la velocidad actual del auto");
        VEL_ACTUAL= entrada_info.nextInt();
        
        Automovil auto1= new Automovil(PLACA, COLOR, YEAR, MARCA, CAP_PASAJEROS, CILINDRAJE, VEL_ACTUAL);
        auto1.datosAuto();
        
        Automovil auto = new Automovil("IPU105", "Blanco", 2017,"Renault", 5, 1600,80);
        auto.datosAuto();
    }
    
    private static void ejercicio5(){
        
        String color, material;
        double largo,ancho, alto;
        
        System.out.println("Ingrese el color del mueble");
        color = entrada_info.nextLine();
        
        System.out.println("Ingrese el material del mueble");
        material = entrada_info.nextLine();
        
        System.out.println("Ingrese el ancho del mueble");
        entrada_info.useLocale(Locale.ENGLISH);
        ancho = entrada_info.nextDouble();
        
        System.out.println("Ingrese el alto del mueble");
        entrada_info.useLocale(Locale.ENGLISH);
        alto = entrada_info.nextDouble();
        
        System.out.println("Ingrese el largo del mueble");
        entrada_info.useLocale(Locale.ENGLISH);
        largo = entrada_info.nextDouble();
        
        Mueble mueble1= new Mueble(color,alto,ancho,largo,material);
        mueble1.infoMueble();
        
        Mueble elMueble = new Mueble("Blanco",2.3,1.5,1.8,"Pino");
        elMueble.infoMueble();
    }
    
    private static void ejercicio6(){
        String MODELO,MARCA;
        int PRECIO,CAPACIDAD,PESO,TAM_PANTALLA;
        
        System.out.println("Ingrese la marca del teléfono");
        MARCA = entrada_info.nextLine();
        
        System.out.println("Ingrese el modelo del teléfono");
        MODELO = entrada_info.nextLine();
        
        System.out.println("Ingrese el precio del teléfono");
        PRECIO = entrada_info.nextInt();
        
        System.out.println("Ingrese la capacidad del teléfono");
        CAPACIDAD = entrada_info.nextInt();
        
        System.out.println("Ingrese el tamaño de la pantalla");
        TAM_PANTALLA = entrada_info.nextInt();
        
        System.out.println("Ingrese el peso del teléfono");
        PESO = entrada_info.nextInt();
        
        Telefono movil1 = new Telefono(MARCA,MODELO,PRECIO,CAPACIDAD,TAM_PANTALLA, PESO);
        movil1.infoTelefono();
        
        Telefono movil = new Telefono("Samsung", "J4", 500000,16,5,220);
        movil.infoTelefono();
    }
    
    private static void ejercicio7(){
        String NAME, LASTNAME;
        int AGE,SALARIO, ANTIGUEDAD;
        
        System.out.println("Ingrese el nombre del empleado");
        NAME = entrada_info.nextLine();
        
        System.out.println("Ingrese el apellido del empleado");
        LASTNAME = entrada_info.nextLine();
        
        System.out.println("Ingrese la edad del empleado");
        AGE = entrada_info.nextInt();
        
        System.out.println("Ingrese la antiguedad del empleado");
        ANTIGUEDAD = entrada_info.nextInt();
        
        System.out.println("Ingrese el salario del empleado");
        SALARIO= entrada_info.nextInt();
        
        Empleado empleado1 = new Empleado(NAME,LASTNAME,AGE,ANTIGUEDAD,SALARIO);
        empleado1.datosEmpleado();
        
        Empleado elEmpleado = new Empleado("Juan Carlos", "Alvarez", 45, 5, 2000000);
        elEmpleado.datosEmpleado();
                
    
    }
}
