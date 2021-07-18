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
public class Asalariado {
    
    private String nombre;
    private long dni;
    private int diasVacaciones;
    private double salario;

    public Asalariado(String nombre, long dni, int diasVacaciones, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public double getSalario() {
        return salario;
    }
    
    public void infoAsalariado(){
        System.out.println("--------------");
        System.out.println("Nombre del asalariado " + getNombre());
        System.out.println("Identificación "+ getDni());
        System.out.println("Salario base "+getSalario());
        System.out.println("--------------");
    }
    
}
