/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneaj40_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Carlos_Garcia
 */
public class AgendaTelefonica {
    
    private Map<String,Integer> agenda;

    public AgendaTelefonica() {
        agenda = new HashMap<String,Integer>();
        
    }
    
    public void addTelefono(String nombre, int telefono){
        agenda.put(nombre, telefono);
    }
    
    public int consulta(String nombre){
        Integer tel = agenda.get(nombre);
        if(tel==null){
            return 0;
        } else {
            return tel.intValue();
        }
    }
    
    public boolean estaIncluido(String nombre){
        return agenda.containsKey(nombre);
    }
    
    public void mostrarAgenda(){
        Set<Map.Entry<String,Integer>> lista = agenda.entrySet();
        System.out.println();
        System.out.println("Nombre - Telefono");
        for(Map.Entry<String,Integer> listado:lista){
            System.out.println(listado.getKey()+" - "+ listado.getValue());
        }
        
    }
    
}
