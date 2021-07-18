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
public class Gerente extends Empleados{
    
    private int bono;
    private String auto;

    public Gerente(int dni, String nombre, String posicion, int salario,int bono, String auto) {
        super(dni, nombre, posicion, salario);
        this.bono = bono;
        this.auto = auto;
    }

    public int getBono() {
        return bono;
    }

    public String getAuto() {
        return auto;
    }
    
    public String muestraGerente(){
        double sueldoTotal = this.bono+super.getSalario();
        String datosGerente= super.verEmpleados() + " bono $ " +getBono()+
        " auto"+getAuto()+ " sueldo total del gerente $ "+sueldoTotal ;
        return datosGerente;
    }
    
}
