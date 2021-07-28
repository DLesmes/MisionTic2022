/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneaj40_4;

/**
 *
 * @author Carlos_Garcia
 */
public class FichaVehiculo {
    
    private String modelo,placa;
    private long entrada,reparacion,salida;

    public FichaVehiculo(String modelo, String placa, long entrada) {
        this.modelo = modelo;
        this.placa = placa;
        this.entrada = entrada;
        this.reparacion=0;
        this.salida=0;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    
    public void modificaFechaEntrada(long fecha_entrada){
        entrada = fecha_entrada;
    }
    
    public void modificaFechaSalida(long fecha_salida){
        salida = fecha_salida;
    }
    
    public void modificaFechaReparacion(long fecha_reparacion){
        reparacion=fecha_reparacion;
    }
    
    public boolean estaArreglado(){
        if(reparacion!=0){
            
            return true;
        } else {
            return  false;
        }
    }
    
    
    public long fechaReparacion(){
        return  reparacion;
    }
    
    public long fechaSalida(){
        return salida;
    }
}

