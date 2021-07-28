/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneaj40_4;

import java.util.LinkedList;

/**
 *
 * @author Carlos_Garcia
 */
public class GestionReparaciones {
    
    private LinkedList<FichaVehiculo> listaVehiculos= new LinkedList<>();
    
    public void addVehiculo(String modelo,String placa){
        long fecha = Reloj.hora();
        FichaVehiculo fichaAuto = new FichaVehiculo(modelo, placa, fecha);
        listaVehiculos.add(fichaAuto);
    }
    
    public void reparado(String matricula){
        boolean encontrado=false;
        int i=0;
        while(!encontrado&& i<listaVehiculos.size()){
            if(listaVehiculos.get(i).getPlaca().equals(matricula) &&
               listaVehiculos.get(i).fechaReparacion()==0)
            {
                listaVehiculos.get(i).modificaFechaReparacion(Reloj.hora());
                encontrado = true;
            } else {
                i++;
            }
        }
        if(encontrado==true){
            System.out.println("Fecha de reparacion fue cambiada "
                    + " del vehiculo "+matricula);
        } else {
            System.out.println("Error al cambiar la fecha "
                    +" del vehiculo" +matricula);
        }
    }

    public void fechaSalidaTaller(String matricula){
        boolean encontrado= false;
        int i=0;
        
        while(!encontrado&& i<listaVehiculos.size()){
            if(listaVehiculos.get(i).getPlaca().equals(matricula)&&
               listaVehiculos.get(i).fechaSalida()==0 &&
               listaVehiculos.get(i).estaArreglado())
            {
            listaVehiculos.get(i).modificaFechaSalida(Reloj.hora());
            encontrado=true;
            } else { 
            i++;
            }
        }
        if(encontrado==true){
            System.out.println("Fecha de salida modificada..!" +matricula);
        } else {
            System.out.println("Hubo un error al cambiar la fecha de "
            + "salida del vehiculo "+ matricula);
        }
    }
    
    public void listaAutos(){
        System.out.println("Lista de autos para reparar");
        for(int i=0; i<listaVehiculos.size();i++){
            System.out.println(listaVehiculos.get(i).getPlaca());
        }
    }
    
    public boolean eliminarPrimerRegistro(){
        if(listaVehiculos.isEmpty()){
            System.out.println("No hay vehiculos para reparar");
            return  false;
        } else {
            System.out.println("Se elimina el vehiculo "+listaVehiculos.get(0).getPlaca());
            listaVehiculos.removeFirst();
            return true;
        }
    }

}
