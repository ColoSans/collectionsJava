/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashSet;

/**
 *
 * @author marcc
 */
public class Customer {
    private String dni;
    private int nPlazas;
    private HashSet<String> servicios;
    private Room room;
    /**
     * constructor
     * @param dni dni 
     * @param nPlazas numero de plazas que pide
     * @param servicios servicios que pide
     * @param room habitacion asignada
     */
    public Customer(String dni, int nPlazas, HashSet<String> servicios, Room room) {
        this.dni = dni;
        this.nPlazas = nPlazas;
        this.servicios = servicios;
        this.room=room;
    }
/**
 * devuelve el valor del dni
 * @return 
 */
    public String getDni() {
        return dni;
    }
/**
 * 
 * @param dni 
 */
    public void setDni(String dni) {
        this.dni = dni;
    }
/**
 * devuelve el valor del numero de plazas
 * @return 
 */
    public int getnPlazas() {
        return nPlazas;
    }
/**
 * modifica el valor del nplazas
 * @param nPlazas 
 */
    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }
/**
 * devuelve el valor de servicios
 * @return 
 */
    public HashSet<String> getServicios() {
        return servicios;
    }
/**
 * modifica el valor de servicios
 * @param servicios 
 */
    public void setServicios(HashSet<String> servicios) {
        this.servicios = servicios;
    }
/**
 * devuelve el valor de room
 * @return 
 */
    public Room getRoom() {
        return room;
    }
/**
 * modifica el valor de room
 * @param room 
 */
    public void setRoom(Room room) {
        this.room = room;
    }
    
    
}
