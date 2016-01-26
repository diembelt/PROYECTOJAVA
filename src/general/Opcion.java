/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package general;
import entidad.*;
import java.util.ArrayList;
/**
 * Declaracion de la clase Opcion 
 * Contiene las diferentes opciones que se puede realizar en el proyecto tanto para sensores como actuadores 
 * @version 1.0, 13/12/15
 * @author GRUPO : HURTARES-BELTRAN-CORONEL-ESCOBAR
 */
public class Opcion {
    
     /**
     * Método que genera el ingreso de los datos-atributos del sensor
     */
    public static void ingresarSensor(ArrayList sensores){
        
        Utilidades.limpiarPantalla();
        System.out.println("--- INGRESO DE SENSOR---");    
        System.out.println(" ╔═══════════════════════════╗");
        String id = "";
        
        do{
        id           = Utilidades.leerTexto("Ingrese id:");  
            }while(Utilidades.idDuplicadoSen(sensores, id)); 
        
        String nombre       = Utilidades.leerTexto("Ingrese nombre:");
        String fabricante   = Utilidades.leerTexto("Ingrese fabricante:");
        String modelo       = Utilidades.leerTexto("Ingrese modelo:");
        String ubicacion    = Utilidades.leerTexto("Ingrese ubicacion:");
        String tipo         = Utilidades.leerTexto("Ingrese tipo:");
        float valorAlarma   = Utilidades.leerNumeroDecimal("Ingrese valorAlarma:");
        String descripcion  = Utilidades.leerTexto("Ingrese descripcion:");
        int estado          = Utilidades.leerNumeroEntero("Ingrese estado:");
        System.out.println(" ╚═══════════════════════════╝");
        Sensor s = new Sensor(id, nombre, fabricante, modelo, ubicacion, tipo, valorAlarma, descripcion, estado);
        //if para ingresar sensores
        if(Principal.sensores.add(s)){
            System.out.println("Se ingresó correctamente el sensor");
            Utilidades.leerTexto("Presione enter para regresar al menú principal...");
        }else{
            System.out.println("Ocurrió un error en el ingreso");
            Utilidades.leerTexto("Presione enter para regresar al menú principal...");
        }        
    }
    
     /**
     * Método que genera la consulta de los datos-atributos del sensor
     */
    public static void consultarSensor(){
        Utilidades.limpiarPantalla();
        System.out.println("--- CONSULTAR ---");
        //Apareceran los sensores existentes
        for(Sensor s:Principal.sensores)
            s.imprimirInfo();
        Utilidades.leerTexto("Presione enter para regresar al menú principal...");
    }
    
    
     /**
     * Método que genera la eliminacion de un sensor
     */
    public static void eliminarSensor(ArrayList sensores){
        String id = "";
        ArrayList resultado = null;        
        do{
            id = Utilidades.leerTexto("INGRESE EL ID DEL SENSOR QUE VA HA A ELIMINAR, SI DESEA REGRESAR AL MENU PRINCIPAL INGRESE CERO: ");                        
           
            
            if(id.equals("0"))return;
            
            resultado = Consulta.registrosPorIdSen(sensores, id);        
            if(resultado.size()==0)
                System.out.println("NO EXISTE EL SENSOR CON EL ID INDICADO");
            else if(resultado.size()>1)
                System.out.println("LA CONSULTA RETORNO MUCHOS REGISTROS Y SOLO SE PUEDE ELIMINAR UN ID A LA VEZ");
        }while(resultado.size()!=1);      
        Sensor p = (Sensor)resultado.get(0);
        sensores.remove(Consulta.indicePorIdSen(sensores,p.getId()));
        Utilidades.leerTexto("El sensor ha sido eliminado correctamente, presione enter para regresar al menú principal...");
        
    }
    
    /**
     * Método que genera el ingreso de los datos-atributos del actuador
     */
    public static void ingresarActuador(ArrayList actuadores){
        Utilidades.limpiarPantalla();
        
        System.out.println(" ╔═══════════════════════════╗");
        System.out.println("--- INGRESO DE ACTUADOR ---");    
        String id = "";
        
        do{
        id           = Utilidades.leerTexto("Ingrese id:");
           
            }while(Utilidades.idDuplicadoAc(actuadores, id));
        
        String nombre       = Utilidades.leerTexto("Ingrese nombre:");
        String fabricante   = Utilidades.leerTexto("Ingrese fabricante:");
        String modelo       = Utilidades.leerTexto("Ingrese modelo:");
        String ubicacion    = Utilidades.leerTexto("Ingrese ubicacion:");
        int estado          = Utilidades.leerNumeroEntero("Ingrese estado:");
        String tipo         = Utilidades.leerTexto("Ingrese tipo:");
        String descripcion  = Utilidades.leerTexto("Ingrese descripcion:");
        System.out.println(" ╚═══════════════════════════╝");
        Actuador a = new Actuador(id, nombre, fabricante, modelo, ubicacion, estado, tipo, descripcion);
        if(Principal.actuadores.add(a)){
            System.out.println("Se ingresó correctamente el actuador");
            Utilidades.leerTexto("Presione enter para regresar al menú principal...");
        }else{
            System.out.println("Ocurrió un error en el ingreso del actuador");
            Utilidades.leerTexto("Presione enter para regresar al menú principal...");
        }        
    }
    
    /**
     * Método que genera la consulta de los datos-atributos del actuador
     */
    public static void consultarActuador(){
        Utilidades.limpiarPantalla();
        System.out.println("--- CONSULTAR ---");
        for(Actuador a:Principal.actuadores)
            a.imprimirInfo();
        Utilidades.leerTexto("Presione enter para regresar al menú principal...");
    }
    
    /**
     * Método que genera la eliminacion de un actuador
     */
    public static void eliminarActuador(ArrayList actuadores){
        String id = "";
        ArrayList resultado = null;        
        do{
            id = Utilidades.leerTexto("INGRESE EL ID DEL ACTUADOR QUE VA HA A ELIMINAR, SI DESEA REGRESAR AL MENU PRINCIPAL INGRESE CERO: ");                        
   
            
            if(id.equals("0"))return;
            
            resultado = Consulta.registrosPorIdAc(actuadores, id);        
            if(resultado.size()==0)
                System.out.println("NO EXISTE EL ACTUADOR CON EL ID INDICADO");
            else if(resultado.size()>1)
                System.out.println("LA CONSULTA RETORNO MUCHOS REGISTROS Y SOLO SE PUEDE ELIMINAR UN ID A LA VEZ");
        }while(resultado.size()!=1);      
        Actuador p = (Actuador)resultado.get(0);
        actuadores.remove(Consulta.indicePorIdAc(actuadores,p.getId()));
        Utilidades.leerTexto("El actuador ha sido eliminado correctamente, presione enter para regresar al menú principal...");
    }
    
    
    
    
    /*
    
    public static void editar(){
        System.out.println("EDITAR");
        
        
    }
    
    */
    /**
     * Método que genera el submenú de Integrantes del proyecto
     */ 
    public static void verIntegrantes(){
        Utilidades.limpiarPantalla();
        System.out.println("--- VER INTEGRANTES ---");
        System.out.println("╔────────────╗");
        System.out.println("║-------Grupo-------║");
        System.out.println("║1. Andres Escobar  ║");
        System.out.println("║2. Andrea Hurtares ║");
        System.out.println("║3. Diego Beltran   ║");
        System.out.println("║4. Jose Coronel    ║");
        System.out.println("╚────────────╝");
        Utilidades.leerTexto("Presione enter para regresar al menú principal...");
    }
    
    
    /**
     * Método que genera la edicion de un sensor
     */ 
    public static void EditarSensor(ArrayList sensores){
       String id = "";
        ArrayList resultado = null;        
        do{
            id       = Utilidades.leerTexto("INGRESE EL ID DEL SENSOR A EDITAR \n O INGRESE 0 SI DESEA REGRESAR AL MENU PRINCIPAL: ");                        
            if(id.equals("0"))return;
            
            resultado = Consulta.registrosPorIdSen(sensores, id);        
            //Valida el ingreso de un ID
            if(resultado.size()==0)
                System.out.println("NO EXISTE EL ID INGRESADO");
            else if(resultado.size()>1)
                System.out.println("LA CONSULTA RETORNO MUCHOS REGISTROS Y SOLO SE PUEDE EDITAR UN SOLO ID DE SENSOR");
        }while(resultado.size()!=1);      
        Sensor s = (Sensor)resultado.get(0);
        s.imprimirInfo();


        System.out.println("SI DESEA OMITIR UN CAMPO A EDITAR, PRESIONE SOLO LA TECLA ENTER..");
        String nombre      = Utilidades.leerTexto("INGRESE EL NOMBRE DEL SENSOR: ");
        if(!nombre.trim().equals("")){
            s.setNombre(nombre);
        }   
    
        String fabricante    = Utilidades.leerTexto("INGRESE EL FABRICANTE: ");
        if(!fabricante.trim().equals("")){
            s.setFabricante(fabricante);
        }
	

 	String modelo    = Utilidades.leerTexto("INGRESE EL MODELO: ");
        if(!modelo.trim().equals("")){
            s.setModelo(modelo);
        }


	String ubicacion   = Utilidades.leerTexto("INGRESE LA UBICACION: ");
        if(!ubicacion .trim().equals("")){
            s.setUbicacion(ubicacion);
        }



        float valorActual           = Utilidades.leerNumeroDecimal("INGRESE EL VALOR ACTUAL: ");
        if(valorActual!=0){
            s.setValorActual(valorActual);
        }
       
        String tipo     = Utilidades.leerTexto("INGRESE EL TIPO: ");                
        if(!tipo.trim().equals("")){
            s.setTipo(tipo);
        } 


	float valorAlarma           = Utilidades.leerNumeroDecimal("INGRESE EL VALOR ALARMA: ");
        if(valorActual!=0){
            s.setValorAlarma(valorAlarma);
        }    

	String descripcion     = Utilidades.leerTexto("INGRESE LA DESCRIPCION: ");                
        if(!descripcion.trim().equals("")){
            s.setDescripcion(descripcion);
        }    

      	int estado           = Utilidades.leerNumeroEntero("INGRESE EL ESTADO: ");
        if(estado!=0){
            s.setEstado(estado);
        }  
        sensores.set(Consulta.indicePorIdSen(sensores,s.getId()),s); 
}
    /**
     * Método que genera la edicion de un actuador
     */
    public static void EditarActuador(ArrayList actuadores){
       String id = "";
        ArrayList resultado = null;        
        do{
            id       = Utilidades.leerTexto("INGRESE LA ID DEL ACTUADOR A EDITAR \n O INGRESE 0 SI DESEA REGRESAR AL MENU PRINCIPAL: ");                        
            if(id.equals("0"))return;
            
            resultado = Consulta.registrosPorIdAc(actuadores, id);        
            if(resultado.size()==0)
                System.out.println("NO EXISTE EL ID INDICADO");
            else if(resultado.size()>1)
                System.out.println("LA CONSULTA RETORNO MUCHOS REGISTROS Y SOLO SE PUEDE EDITAR  UN SOLO ID DE ACTUADOR");
        }while(resultado.size()!=1);      
        Actuador a = (Actuador)resultado.get(0);
        a.imprimirInfo();


        System.out.println("SI DESEA OMITIR UN CAMPO A EDITAR, PRESIONE SOLO LA TECLA ENTER..");
        String nombre      = Utilidades.leerTexto("INGRESE EL NOMBRE DEL ACTUADOR: ");
        if(!nombre.trim().equals("")){
            a.setNombre(nombre);
        }   
    
        String fabricante    = Utilidades.leerTexto("INGRESE EL FABRICANTE: ");
        if(!fabricante.trim().equals("")){
            a.setFabricante(fabricante);
        }
	

 	String modelo    = Utilidades.leerTexto("INGRESE EL MODELO: ");
        if(!modelo.trim().equals("")){
            a.setModelo(modelo);
        }


	String ubicacion   = Utilidades.leerTexto("INGRESE LA UBICACION: ");
        if(!ubicacion .trim().equals("")){
            a.setUbicacion(ubicacion);
        }

	int estado           = Utilidades.leerNumeroEntero("INGRESE EL ESTADO: ");
        if(estado!=0){
            a.setEstado(estado);
        } 
       
        String tipo     = Utilidades.leerTexto("INGRESE EL TIPO: ");                
        if(!tipo.trim().equals("")){
            a.setTipo(tipo);
        } 


	String descripcion     = Utilidades.leerTexto("INGRESE LA DESCRIPCION: ");                
        if(!descripcion.trim().equals("")){
            a.setDescripcion(descripcion);
        }    

      	 
        actuadores.set(Consulta.indicePorIdAc(actuadores,a.getId()),a); 
}
}


    
