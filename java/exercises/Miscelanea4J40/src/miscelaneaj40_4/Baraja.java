/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneaj40_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos_Garcia
 */
public class Baraja {
    
    private static String [] palo={"Bastos", "Copas","Oros","Diamantes"};
    private static String [] cartas={"As","2","3","4","5","6","7","sota"};
    
    private ArrayList<String> mazo;

    public Baraja() {
        mazo = new ArrayList<>(40);
        for(String p:palo){
            for(String c:cartas){
                mazo.add(c+" de "+p);
            }
        }
    }
    //barajar las cartas
    
    public List<String> repartir(int num){
        int numCartas = mazo.size();
        List<String> vistaMano = mazo.subList(numCartas- num, numCartas);
        List<String> mano = new ArrayList<>(vistaMano);
        vistaMano.clear();
        return mano;
    }
    
}
