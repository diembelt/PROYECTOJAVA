/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;

import java.util.ArrayList;
import entidad.*;
/**
 *
 * @author vr
 */


public class ValidadorA {
    
    public static boolean validarDuplicidad(ArrayList<Actuador> registros,String id){
        
        for (Actuador p:registros) {
            if(p.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    
}
