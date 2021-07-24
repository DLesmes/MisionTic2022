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
public class Materia {
    
    private long codigo;
    private String nombre;
    private Alumno alumnos[];
    private int creditos, definitiva, porcentajetotal;

    public Materia(long codigo, String nombre, Alumno[] alumnos, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.creditos = creditos;
        this.definitiva=0;
        this.porcentajetotal=0;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getDefinitiva() {
        return definitiva;
    }

    public int getPorcentajetotal() {
        return porcentajetotal;
    }
    
    
    public void ingresoNota(int aporcentaje, int valor){
        int defparcia=0;
        if(porcentajetotal+aporcentaje<=100){
            porcentajetotal +=aporcentaje;
            definitiva +=(valor*(aporcentaje/100));
            defparcia = definitiva;
            System.out.println("El alumno tiene una definitiva "
                    +getDefinitiva()  );
        } else {
            System.out.println("El valor del porcentaje supera el "
                    + "100% "+getPorcentajetotal());
        }
    }
    
    
    
}
