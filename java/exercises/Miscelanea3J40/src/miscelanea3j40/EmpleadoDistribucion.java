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
public class EmpleadoDistribucion extends Asalariado{
    private String zona;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salario,String zona) {
        super(nombre, dni, diasVacaciones, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }
    
    @Override
    public double getSalario(){
        return super.getSalario()*(1+0.1);
    }
    
    public void datosEmpleDis(){
        System.out.println("\n**************");
        System.out.println("Nombre del empleado distribución "+ super.getNombre());
        System.out.println("El DNI del empleado distribución "+ super.getDni());
        System.out.println("Salario base " + super.getSalario());
        System.out.println("Salario total del empleado es $"+ getSalario());
        System.out.println("****************");
    }
    
}
