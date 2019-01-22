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
public class Worker {
    private String dni;
    private String nombre;
    private HashSet<String> servicios;
    
    public Worker(String dni, String nombre, HashSet<String> servicios) {
        this.dni = dni;
        this.nombre = nombre;
        this.servicios = servicios;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<String> getServicios() {
        return servicios;
    }

    public void setServicios(HashSet<String> servicios) {
        this.servicios = servicios;
    }
    
    
}
