

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
public class Libros {
    
    
    //atributos
    
    private String titulo;
    private long ISBN;
    private String autor;
    private int anyoPublicacion;
    
    //atributos de la composición
    
    private Pagina[] paginas;
    private int numPaginas;

    public Libros(String titulo, long ISBN, String autor, int anyoPublicacion) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        
        this.paginas = new Pagina[100];
        for (int i=0;i<99;i++){
            this.paginas[i] = new Pagina("",0);
        }
        this.numPaginas =0;
    }

    public String getTitulo() {
        return titulo;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }
    
    public void agregarPagina(Pagina nueva_pag){
        if(this.numPaginas<99){
            this.paginas[this.numPaginas]= nueva_pag;
            this.numPaginas++;
            System.out.println("Pagina agregada");
        } 
    }

    public Pagina getPaginas(int numPag) {
        for(int i=0; i<this.numPaginas;i++){
            if(this.paginas[i].getNumero()==numPag){
                return this.paginas[i];
            }
        }
        return this.paginas[0];
    }
    
    
    
}
