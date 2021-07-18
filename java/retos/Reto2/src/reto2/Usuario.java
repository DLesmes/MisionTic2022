/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author asf
 */
public class Usuario {
    String nombre;
    int id;
    String email;
    int age;
    String area;
    boolean es_jefe;
    double nomina;

    public Usuario(String nombre, int id, String email, int age, String area, boolean es_jefe) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.age = age;
        this.area = area;
        this.es_jefe = es_jefe;
        this.nomina = nomina();
        
    }
    
    public void info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Identificacion: "+this.id);
        System.out.println("Email: "+this.email);
        System.out.println("Edad: "+this.age);
        System.out.println("Area: "+this.area);
        System.out.println("Salario: "+this.nomina);
    }
    
    public float nomina() {
    float salario, nomina;
    switch (this.area) {
        case "administrativa":
        salario = 3500000.0f;
            if (this.es_jefe) {
                salario += 3000000.0f;
            }
            break;
        case "desarrollo":
        salario = 4500000.0f;
            if (this.es_jefe) {
                salario += 2500000.0f;
            }
            break;
        default:
            salario = 0.0f;
            break;
    }
    nomina = salario - 0.08f*salario;
    if (salario > 3634104) {
        nomina = nomina - 0.01f*salario;
    }
    return nomina;
    }
     
}
