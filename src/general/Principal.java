/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;
import entidad.*;


import java.util.ArrayList;

/**
 * Declaracion de la clase Principal del proyecto  
 * Contiene las opciones que se puede realizar en el proyecto 
 * @version 1.0, 13/12/15
 * @author GRUPO : HURTARES-BELTRAN-CORONEL-ESCOBAR
 */



public class Principal {
    public static ArrayList<Sensor> sensores = new ArrayList<Sensor>();
    public static ArrayList<Actuador> actuadores = new ArrayList<Actuador>();
    
    /**
     * Genera el metodo principal contiene el programa principal, menus, opciones.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sensor.ingresarSensores();
        Actuador.ingresarActuadores();
        int op=0;
        int op2=0;
        int op3=0;
        do{
            Utilidades.limpiarPantalla();
            Menu.imprimirMenuPrincipal();
            op = Utilidades.leerNumeroEntero("INGRESE LA OPCION DESEADA:");                                 
            
            //Con este switch podemos elegir las opciones del menú de acuerdo al número que se ingresa
            switch(op){
                case 1:
                    Menu.imprimirIngresar();
                    op2 = Utilidades.leerNumeroEntero("ELIJA LA OPCION QUE DESEA INGRESAR:"); 
                        if (op2==1){
                            Opcion.ingresarSensor(sensores);
                            break;}
                        else if (op2==2){
                            Opcion.ingresarActuador(actuadores);
                            break;}
                        else {
                            System.out.println("OPCION INCORRECTA");
                            Utilidades.leerTexto("PRESIONE ENTER PARA REGRESAR AL MENU PRINCIPAL...");
                            op2 = 0;
                            break;}
                    
                case 2:
                    Menu.imprimirConsultar();
                    op2 = Utilidades.leerNumeroEntero("ELIJA LA OPCION QUE DESEA INGRESAR:"); 
                        if (op2==1){
                            Opcion.consultarSensor();
                            break;}
                        else if (op2==2){
                            Opcion.consultarActuador();
                            break;}
                        else {
                            System.out.println("OPCION INCORRECTA");
                            Utilidades.leerTexto("PRESIONE ENTER PARA REGRESAR AL MENU PRINCIPAL...");
                            op2 = 0;
                            break;}  
                    
                case 3:
                    Menu.imprimirEditar();
                    op2 = Utilidades.leerNumeroEntero("ELIJA LA OPCION QUE DESEA INGRESAR:"); 
                        if (op2==1){
                            Opcion.EditarSensor(sensores);
                            break;}
                        else if (op2==2){
                           Opcion.EditarActuador(actuadores);
                            break;}
                        else {
                            System.out.println("OPCION INCORRECTA");
                            Utilidades.leerTexto("PRESIONE ENTER PARA REGRESAR AL MENU PRINCIPAL...");
                            op2 = 0;
                            break;} 
                case 4:
                    
                    Menu.imprimirEliminar();
                    op3 = Utilidades.leerNumeroEntero("ELIJA LA OPCION QUE DESEA INGRESAR:\n");
                        if (op3==1){
                            System.out.println("Usted va ha eliminar un sensor");
                            Opcion.eliminarSensor(sensores);
                            break;}
                        else if (op3==2){
                            System.out.println("Usted va ha eliminar un actuador");
                            Opcion.eliminarActuador(actuadores);
                            break;}
                        else {
                            System.out.println("OPCION INCORRECTA");
                            Utilidades.leerTexto("PRESIONE ENTER PARA REGRESAR AL MENU PRINCIPAL...");
                            op3 = 0;
                    break;}
                
                
                case 5:
                    Opcion.verIntegrantes();                
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la app...");
                    break;
                default:
                    System.out.println("La opción ingresada es incorrecta");
                    Utilidades.leerTexto("Presione enter para continuar...");
            }
        }while(op!=0);
    }
    
}
