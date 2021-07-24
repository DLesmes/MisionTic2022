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
        //Ejercicio5();
        //AlumnoMateria();
        //Ejercicio6();
        //Ejercicio7();
        
        Libros book= new Libros("El quijote de la mancha",
        1298983,"Miguel de Cervantes",1605);
        
        Pagina pag1= new Pagina("En un lugar de la Mancha...",1);
        Pagina pag2= new Pagina(".. no ha mucho tiempo que vivía ...",2);
        
        book.agregarPagina(pag1);
        book.agregarPagina(pag2);
        
        for(int i=0;i<=book.getNumPaginas();i++){
        // System.out.println(book.getPaginas(i).getContenido());
        System.out.println(book.getPaginas(i).getContenido());
        }
        
    }
    
    public static void Ejercicio7(){
        Actor actor1 = new Actor("Harrison ford",310855);
        Actor actor2 = new Actor("Carrie Fisher",11270);
        Actor actor3 = new Actor("Jhon Williams", 170945);
        Actor actor4 = new Actor("Michael J Fox",122176);
        
        Actor listaActores[] = new Actor[4];
        listaActores[0] = actor1;
        listaActores[1] = actor2;
        listaActores[2]= actor3;
        listaActores[3]= actor4;
        
        String nombrePelicula, nombreDirector;
        int duracionPelicula;
        System.out.println("Ingrese el titulo de la pelicula");
        nombrePelicula = datos.nextLine();
        
        System.out.println("Ingrese el director de la pelicula");
        nombreDirector = datos.nextLine();
        
        System.out.println("Ingrese la duración de la pelicula");
        duracionPelicula= datos.nextInt();
        
        Pelicula movie = new Pelicula(nombrePelicula,nombreDirector,duracionPelicula,listaActores);
        movie.mostrarPelicula();
        
//        for (int i=0;i<listaActores.length;i++)
//        { System.out.println("Actor "+ listaActores[i].getNombre());
//            
//        }
        
    }
    
    public static void Ejercicio6(){
        int base,altura,lado;
        String tipoTriangulo;
        
        System.out.println("Ingrese el tipo de triangulo");
        tipoTriangulo = datos.nextLine();
        
        System.out.println("Ingrese la base del triangulo");
        base = datos.nextInt();
       
        System.out.println("Ingrese la altura del triangulo");
        altura = datos.nextInt();
        
        System.out.println("Ingrese el lado del cuadrado");
        lado = datos.nextInt();
        
        Triangulo triangulo = new Triangulo(tipoTriangulo,base,altura);
        triangulo.infoTriangulo();
        
        Cuadrado square = new Cuadrado("Cuadrado",lado);
        square.infoCuadrado();
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
    
    public static void AlumnoMateria(){
        Alumno alm1 = new Alumno("Jorge", "Bucaramanga",90900,10909109);
        Alumno alm2 = new Alumno("Ángela", "Giron",0,1094980);
        Alumno alm3 = new Alumno("Irma", "Florida",0,10909098);
        
        // Array que almacena 
        Alumno listaAlumnos[] = new Alumno[3];
        listaAlumnos[0] = alm1;
        listaAlumnos[1] = alm2;
        listaAlumnos[2]=alm3;
        //long codigo, String nombre, Alumno[] alumnos, int creditos
        Materia materia = new Materia(12314, "Fisica",listaAlumnos,8 );
        materia.ingresoNota(10, 85);
        
        int i =0;
        while(i<listaAlumnos.length)
        {   System.out.println("Lista alumnos nombre " + listaAlumnos[i].getNombre());
            
            i++;
        }
        
    }
}
