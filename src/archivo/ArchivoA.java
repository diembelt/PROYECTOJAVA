/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;


import entidad.Actuador;
import java.io.IOException;
import java.util.ArrayList;
//import utilidades.Validacion;

/**
 *
 * @author VR
 */
public class ArchivoA{
    private static final String RUTA_ARCHIVO = "personas.txt";
    
    public static boolean crear(){
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_ARCHIVO);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static boolean borrar_contenido(){
        try{
            EscribirArchivo archivo = new EscribirArchivo();
            archivo.borrar_contenido(RUTA_ARCHIVO);
            archivo.cerrar();
        }catch(IOException e){
            return false;
        }
        return true;
    }
    
    public static ArrayList<Actuador> obtener_registros()throws Exception{
        ArrayList<Actuador> actuadores;
        try{
            LeerArchivo archivo = new LeerArchivo();
            archivo.abrir(RUTA_ARCHIVO);
            actuadores = archivo.obteniendo_objetos();
            archivo.cerrar();
        }catch(Exception e){
            throw e;
        }    
        return actuadores;        
    }
    
    public static boolean insertar_registro(Actuador p){
        
        EscribirArchivo archivo = new EscribirArchivo();
        try{
            archivo.abrir(RUTA_ARCHIVO);
            archivo.insertar_objeto(p);
            archivo.cerrar(); 
        }catch(Exception e){
            return false;
        }                          
        return true;                
    }
    
   /* public static boolean actualizar_registro(Persona p){
         ArrayList<Persona> personas = null;
         try{
            personas = Archivo.obtener_registros();
            int indice = Validacion.existePersona(personas,p);
            personas.set(indice, p);
         }catch(Exception e){
             return false;
         }
         return Archivo.actualizar_registros(personas);         
    }*/
    
    public static boolean actualizar_registros(ArrayList actuadores){
        borrar_contenido();
        EscribirArchivo archivo = new EscribirArchivo();
        try{            
            archivo.abrir(RUTA_ARCHIVO);
            for(int i=0;i<actuadores.size();i++)
                archivo.insertar_objeto(actuadores.get(i));
            archivo.cerrar();
        }catch(Exception e){
            return false;
        }                 
        return true;
    }
    
    public static boolean editar_registro(Actuador  p){        
        ArrayList<Actuador > registros = null;
        
        try{
            registros = ArchivoA.obtener_registros();
            for(Actuador  tmp:registros){
                if(tmp.getId().equals(p.getId())){                
                    tmp.setNombre(p.getNombre());
                    tmp.setFabricante(p.getFabricante());
                    tmp.setModelo(p.getModelo());
                    tmp.setUbicacion(p.getUbicacion());
                    tmp.setEstado(p.getEstado());
                    tmp.setTipo(p.getTipo());
                    tmp.setDescripcion(p.getDescripcion());
                    
                    return Archivo.actualizar_registros(registros);
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
    public static boolean eliminar_registro(String id){
        ArrayList<Actuador > registros = null;
        
        try{
            registros = ArchivoA.obtener_registros();
            for(Actuador  tmp:registros){
                if(tmp.getId().equals(id)){                
                    registros.remove(tmp);
                    return Archivo.actualizar_registros(registros);
                }
            }
        }catch(Exception e){
            return false;
        }    
        return false;
    }
    
}
