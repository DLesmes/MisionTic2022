/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneaj40_4;

import java.util.Calendar;

/**
 *
 * @author Carlos_Garcia
 */
public class Reloj {
    
    public static long hora(){
        return Calendar.getInstance().getTimeInMillis();
    }
    
}
