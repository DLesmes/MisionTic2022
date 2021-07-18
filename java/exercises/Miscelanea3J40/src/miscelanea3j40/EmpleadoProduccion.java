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
public class EmpleadoProduccion extends Asalariado{
    
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, double salario,String turno) {
        super(nombre, dni, diasVacaciones, salario);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }
    
    @Override
    public double getSalario(){
        return super.getSalario()*(1+0.15);
    }
    
    public void infoEmpleProd(){
        System.out.println("\n----------------");
        System.out.println("Nombre del empleado de producción "+super.getNombre());
        System.out.println("dni del empleado "+ super.getDni());
        System.out.println("salario base del empleado "+ super.getSalario());
        System.out.println("salario total del empleado "+getSalario());
        System.out.println("------------------");
    }
    
}
