/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashSet;

/**
 *
 * @author marcc
 */
public class manager {
    private int money;
    private HashSet<String> services = new HashSet();
    private HashSet<String> habilities = new HashSet();
    
    public manager(){
        money=1000;
        services=createServices();
        habilities=createHabilities();
    }
    public static HashSet<String> createServices(){
        HashSet<String>services=new HashSet<>();
        services.add("tv");
        services.add("balcon");
        services.add("camadoble");
        services.add("jacuzzi");
        services.add("minibar");
        services.add("telefono");
        services.add("satelite");
        services.add("suite");
        return services;
    }
    
    public static HashSet<String> createHabilities(){
        HashSet<String>habilities=new HashSet<>();
        habilities.add("mantenimiento");
        habilities.add("limpieza");
        habilities.add("piscina");
        habilities.add("spa");
        habilities.add("bar");
        habilities.add("comida");
        habilities.add("lavanderia");
        return habilities;
    }
}
