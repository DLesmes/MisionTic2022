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
public class Pelicula {
    
    private String titulo, director;
    private int duracion;
    private Actor actores[];
    private int numeroActores;

    public Pelicula(String titulo, String director, int duracion, Actor[] actores) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.actores = actores;
    }

   

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public Actor[] getActores() {
        return actores;
    }

    public int getNumeroActores() {
        return numeroActores;
    }
    
    
    public void mostrarPelicula(){
        System.out.println("Información de la pelicula");
        System.out.println("Titulo de la pelicula " +getTitulo());
        System.out.println("Director de la pelicula " + getDirector());
        System.out.println("Duración de la pelicula "+ getDuracion());
        System.out.println("Cantidad de actores en la pelicula " +getActores().length);
        
        for (int i=0;i<getActores().length;i++)
        { System.out.println("Actor "+ getActores()[i].getNombre());
        }
        
    }
    
}
