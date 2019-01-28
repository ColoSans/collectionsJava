/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exceptions.MyException;
import java.util.HashMap;
import java.util.HashSet;
import modelo.Customer;
import modelo.Room;
import modelo.Worker;

/**
 *
 * @author marcc
 */
public class Manager {
    private int money;
    private HashSet<String> services = new HashSet();
    private HashSet<String> habilities = new HashSet();
    private HashMap<String, Room> rooms = new HashMap();
    private HashMap<String, Worker> workers = new HashMap();
    private HashMap<String, Customer> customers = new HashMap();
    public Manager(){
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
    
    public void room(String nHabitacion,int capacidad, HashSet<String>servicios){
        Room room = new Room(nHabitacion,"CLEAN",capacidad,servicios);
        
        try{
            if(rooms.containsKey(nHabitacion)){
                rooms.put(nHabitacion, room);
            }else{
                throw new MyException(1);
            }
        }catch(MyException ex){
            
        }
    }
    
    public void compararService(HashSet<String> services){
        
    }
    
}