/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author marcc
 */

public class Room {
    private String nHabitacion;
    private String estado;
    private int capacidad;
    private HashSet<String> servicios;
/**
 * Constructor
 * @param nHabitacion numero habitacion
 * @param estado estado de la habitacion
 * @param capacidad capacidad de la habitacion
 * @param servicios servicios
 */
    public Room(String nHabitacion, String estado, int capacidad, HashSet<String> servicios) {
        this.nHabitacion = nHabitacion;
        this.estado = estado;
        this.capacidad = capacidad;
        this.servicios = servicios;
    }
/**
 * Devuelve el valor nHabitacion
 * @return 
 */
    public String getnHabitacion() {
        return nHabitacion;
    }
/**
 * Modifica el valor nHabitacion
 * @param nHabitacion 
 */
    public void setnHabitacion(String nHabitacion) {
        this.nHabitacion = nHabitacion;
    }
/**
 * Devuelve el valor estado
 * @return 
 */
    public String getEstado() {
        return estado;
    }
/**
 * Modifica el valor estado
 * @param estado 
 */
    public void setEstado(String estado) {
        this.estado = estado;
    }
/**
 * Devuelve el valor capacidad
 * @return 
 */
    public int getCapacidad() {
        return capacidad;
    }
/**
 * Modifica el valor capacidad
 * @param capacidad 
 */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
/**
 * Devuelve el valor servicios
 * @return 
 */
    public HashSet<String> getServicios() {
        return servicios;
    }
/**
 * Modifica el valor servicios
 * @param servicios 
 */
    public void setServicios(HashSet<String> servicios) {
        this.servicios = servicios;
    }

    
}
