/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Actuador
-id
-nombre
-modelo
-fabricante
-ubicacion
-estado
-tipo
-descripcion */

package entidad;
import java.io.Serializable;
import general.*;
/**
 * Declaracion de la clase Actuador  
 * Esta clase define los diferentes atributos  que definen un actuador
 * @version 1.0, 13/12/15
 * @author GRUPO : HURTARES-BELTRAN-CORONEL-ESCOBAR
 */

public class Actuador implements Serializable{
    private String id;
    private String nombre;
    private String fabricante;
    private String modelo;
    private String ubicacion;
    private int estado;
    private String tipo;
    private String descripcion;
    
 /**Creación del constructor 
 * @param   id para el número identificador 
 * @param   nombre para colocar el nombre del actuador
 * @param   fabricante para colocar el fabricande del actuador
 * @param   modelo para colocar el modelo del actuador
 * @param   ubicacion para colocar donde se encuentra el actuador
 * @param   estado para colocar como está el actuador
 * @param   tipo para colocar de que es el actuador
 * @param   descripcion para colocar algo breve a cerca del actuador
 */
    
    public Actuador(String id, String nombre, String fabricante, String modelo, String ubicacion, int estado, String tipo, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.tipo = tipo;
        this.descripcion = descripcion;
        
    }
    
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    // Imprime la información ingresada del actuador
    public void imprimirInfo(){
        System.out.println("--- INFO. Actuador ---");
        System.out.println("id:"+id);
        System.out.println("nombre:"+nombre);
        System.out.println("fabricante:"+fabricante);
        System.out.println("modelo:"+modelo);
        System.out.println("ubicacion:"+ubicacion);
        System.out.println("estado:"+estado);
        System.out.println("tipo:"+tipo);
        System.out.println("descripcion:"+descripcion);
                
    }
    
    //Actuadores ingresados por defecto en el programa
    public static void ingresarActuadores(){
        Principal.actuadores.add(new Actuador("1","Alarma","Samsung","375","Sala",0,"Alarma","Alarma"));
        Principal.actuadores.add(new Actuador("2","Alarma","Dell","376","Cuarto",0,"Alarma","Alarma"));
    }
}
