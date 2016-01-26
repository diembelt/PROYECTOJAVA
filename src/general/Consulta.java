/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;
import entidad.*;

import java.util.ArrayList;

/**
 * Declaracion de la clase Consulta  
 * Esta clase contienen los diferentes tipos de consulta de un objeto
 * @version 1.0, 13/12/15
 * @author GRUPO : HURTARES-BELTRAN-CORONEL-ESCOBAR
 */

public class Consulta {
    
    /**
     * Método que consulta si el id ingresado pertenece al registro de los sensores
     * @return resultado que es el valor del id consultado
     */
    public static ArrayList registrosPorIdSen(ArrayList registros, String id){
        ArrayList resultado = new ArrayList();
        for(int i=0;i<registros.size();i++){
            Sensor p = (Sensor)registros.get(i);
                if(p.getId().contains(id)){
                    resultado.add(p);
                }
        }
        return resultado;
    }    
    
    /**
     * Método que consulta si el id ingresado es igual a los id que estan registrados en  sensores
     * @return resultado que es el valor del id consultado
     */
    public static int indicePorIdSen(ArrayList registros, String id){
        for(int i=0;i<registros.size();i++){
            Sensor p = (Sensor)registros.get(i);
                if(p.getId().equals(id)){
                    return i;
                }
        }
        return -1;
    } 
    
    /**
     * Método que consulta si el id ingresado pertenece al registro de los actuadores
     * @return resultado que es el valor del id consultado
     */
    public static ArrayList registrosPorIdAc(ArrayList registros, String id){
        ArrayList resultado = new ArrayList();
        for(int i=0;i<registros.size();i++){
            Actuador p = (Actuador)registros.get(i);
                if(p.getId().contains(id)){
                    resultado.add(p);
                }
        }
        return resultado;
    }    
    
    /**
     * Método que consulta si el id ingresado es igual a los id que estan registrados en  actuadores
     * @return resultado que es el valor del id consultado
     */
    public static int indicePorIdAc(ArrayList registros, String id){
        for(int i=0;i<registros.size();i++){
            Actuador p = (Actuador)registros.get(i);
                if(p.getId().equals(id)){
                    return i;
                }
        }
        return -1;
    } 
    
}