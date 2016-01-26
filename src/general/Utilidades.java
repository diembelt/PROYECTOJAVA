/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;
import entidad.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Declaracion de la clase Utilidades  
 * La clase Utilidades contiene multiples acciones como leer numeros enteros,decimales y texto
 * Contiene metodos para limpiar pantalla y obtener objetos duplicados en el proyecto 
 * @version 1.0, 13/12/15
 * @author GRUPO : HURTARES-BELTRAN-CORONEL-ESCOBAR
 */
public class Utilidades {
    
    /**
     * Método que lee un número entero ingresado
     * @return n que es el numero entero que ha ingresado el usuario
     */
    
    public static int leerNumeroEntero(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int n = 0;
        try{
            n = sc.nextInt();
        }catch(Exception e){
            return -1;
        }
        return n;
    }
    
    /**
     * Método que lee un número decimal ingresado
     * @return n que es el numero decimal que ha ingresado el usuario
     */
    public static float leerNumeroDecimal(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        float n = 0;
        try{
            n = sc.nextFloat();
        }catch(Exception e){
           return -1; 
        }    
        return n;
    }
    
    
    /**
     * Método que lee un String ingresado
     * @return texto que es texto que ha ingresado el usuario
     */
    public static String leerTexto(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = sc.nextLine();
        return texto;
    }
    
    /**
     * Método que simula una limpieza de pantalla
     * 
     */
    public static void limpiarPantalla(){
        for (int i = 0; i < 15; i++)
            System.out.println("");
    }
    
    /**
     * Método que busca un id perteneciente a los actuadores
     * @return true o false dependiendo si el id es correcto o incorrecto
     */
    public static boolean idDuplicadoAc(ArrayList registros, String id){
        for(int i=0;i<registros.size(); i++){
           Actuador p = (Actuador)registros.get(i);            
            if(p.getId().equals(id)){
                System.out.println("EL ID YA ESTA REGISTRADO");
                return true;
            }    
        }    
        return false;
    }   
    
    /**
     * Método que busca un id perteneciente a los sensores
     * @return true o false dependiendo si el id es correcto o incorrecto
     */
    public static boolean idDuplicadoSen(ArrayList registros, String id){
        for(int i=0;i<registros.size(); i++){
           Sensor p = (Sensor)registros.get(i);            
            if(p.getId().equals(id)){
                System.out.println("EL ID YA ESTA REGISTRADO");
                return true;
            }    
        }    
        return false;
    }  
    
}
