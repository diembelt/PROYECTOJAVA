/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

Sensor
-id
-nombre
-ubicacion
-valorActual
-modelo
-fabricante
-tipo
-valorAlarma
-descripcion
-estado

*/

package entidad;
import java.io.Serializable;
import general.*;
/**
 * Declaracion de la clase Sensor  
 * Esta clase define los diferentes atributos que definen un sensor
 * @version 1.0, 13/12/15
 * @author GRUPO : HURTARES-BELTRAN-CORONEL-ESCOBAR
 */
public class Sensor implements Serializable{
    private String id;
    private String nombre;
    private String fabricante;
    private String modelo;
    private String ubicacion;
    private float valorActual;
    private String tipo;
    private float valorAlarma;
    private String descripcion;
    private int estado;

 /**Creación del construtor sensor 
 * @param   id para ingresar el número identificador del sensor 
 * @param   nombre para ingresar el nombre del sensor
 * @param   fabricante para ingresar el fabricande del sensor
 * @param   modelo para ingresar el modelo del sensor
 * @param   ubicacion para ingresar donde se encuentra el sensor
 * @param   valorActual para ingresar el valor con que inicia el sensor
 * @param   tipo para ingresar de que es el sensor
 * @param   valorAlarma para ingresar el valor umbral del sensor
 * @param   estado para ingresar como se encuentra el sensor
 * @param   descripcion para ingresar algo breve a cerca del sensor
 */
    public Sensor(String id, String nombre, String fabricante, String modelo, String ubicacion, float valorActual, String tipo, float valorAlarma, String descripcion, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ubicacion = ubicacion;
        this.valorActual = valorActual;
        this.tipo = tipo;
        this.valorAlarma = valorAlarma;
        this.descripcion = descripcion;
        this.estado = estado;
    }

/**Creación del constructor sensor 
 * @param   id para ingresar el número identificador del sensor 
 * @param   nombre para ingresar  el nombre del sensor
 * @param   fabricante para ingresar el fabricande del sensor
 * @param   modelo para ingresar el modelo del sensor
 * @param   ubicacion para ingresar donde se encuentra el sensor
 * @param   tipo para ingresar de que es el sensor
 * @param   valorAlarma para ingresar el valor umbral del sensor
 * @param   descripcion para ingresar algo breve a cerca del sensor
 * @param   estado para ingresar como está el sensor
 */
    public Sensor(String id, String nombre, String fabricante, String modelo, String ubicacion, String tipo, float valorAlarma, String descripcion, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.valorAlarma = valorAlarma;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    
    
    

    /**
     * @return the id
     */
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
     * @return the valorActual
     */
    public float getValorActual() {
        return valorActual;
    }

    /**
     * @param valorActual the valorActual to set
     */
    public void setValorActual(float valorActual) {
        this.valorActual = valorActual;
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

    /**
     * @return the valorAlarma
     */
    public float getValorAlarma() {
        return valorAlarma;
    }

    /**
     * @param valorAlarma the valorAlarma to set
     */
    public void setValorAlarma(float valorAlarma) {
        this.valorAlarma = valorAlarma;
    }

    /**
     * @return the descripcion
     */
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
    
    // Imprime la información ingresada del sensor
    public void imprimirInfo(){
        System.out.println("--- INFO. SENSOR ---");
        System.out.println("id:"+id);
        System.out.println("nombre:"+nombre);
        System.out.println("fabricante:"+fabricante);
        System.out.println("modelo:"+modelo);
        System.out.println("ubicacion:"+ubicacion);
        System.out.println("valorActual:"+valorActual);
        System.out.println("tipo:"+tipo);
        System.out.println("valorAlarma:"+valorAlarma);
        System.out.println("descripcion:"+descripcion);
        System.out.println("estado:"+estado);        
    }
    
    //Sensores ingresados por defecto en el programa
    public static void ingresarSensores(){
        Principal.sensores.add(new Sensor("1","SensorA","Samsung","001","Sala","Sensor",30,"Sensor de la sala",1));
        Principal.sensores.add(new Sensor("2","SensorB","HP","002","Cuarto","Sensor",30,"Sensor del cuarto",1));
        Principal.sensores.add(new Sensor("3","SensorC","DELL","003","Baño","Sensor",30,"Sensor del baño",1));
        Principal.sensores.add(new Sensor("4","SensorD","SONY","004","Comedor","Sensor",30,"Sensor del comedor",1));
        Principal.sensores.add(new Sensor("5","SensorE","Samsung","005","Patio","Sensor",30,"Sensor del patio",1));
        
    
    }
    
}
