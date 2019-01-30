/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionsjava;
import controller.Manager;
import exceptions.MyException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author marcc
 */

public class CollectionsJava {

    /**
     * @param args the command line arguments
     */
    private static Manager controller;
    
    public static void main(String[] args) {
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         controller = new Manager();
         String linea;
         boolean salir = false;
         do{
             try {
                 linea = br.readLine().toLowerCase();
                 String[] arrayLinea = linea.split(" ");
                 if (arrayLinea.length > 0) {
                        switch (arrayLinea[0]) {
                            case "exit":
                                if (arrayLinea.length == 1) {
                                    salir = true;
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                            case "room":
                                if (arrayLinea.length == 4) {
                                    addRoom(linea);
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                            case "worker":
                                if (arrayLinea.length == 2) {
                                    
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                            case "reservation":
                                if (arrayLinea.length == 3) {
                                    
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                            case "hotel":
                                if (arrayLinea.length == 2) {
                                   
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                            case "problem":
                                if (arrayLinea.length == 1) {
                                    
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                            case "request":
                                if (arrayLinea.length == 1) {
                                    
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                                
                            case "finish":
                                if (arrayLinea.length == 1) {
                                    
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                            case "leave":
                                if (arrayLinea.length == 1) {
                                    
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                            case "money":
                                if (arrayLinea.length == 1) {
                                    
                                } else {
                                    throw new MyException(0);
                                }
                                break;
                        };
                    } else {
                        System.out.println("Valor incorrecto");
                    }
             } catch (IOException ex) {
                 Logger.getLogger(CollectionsJava.class.getName()).log(Level.SEVERE, null, ex);
             } catch (MyException ex) {
                 System.out.println("\u001B[31m"+ex.getMessage()+"\u001B[0m");
             }
             
         }while (!salir);
    }
    
    public static void addRoom(String linea) throws MyException{
        String[] arrayLinea = linea.split(" ");
        int capacidad=parseInt(arrayLinea[2]);
        String nHabitacion=arrayLinea[1];
        HashSet<String> serviciosPropios = addHashService(arrayLinea[3]);
        
        controller.room(nHabitacion, capacidad, serviciosPropios);
        System.out.println("\033[34m"+"--> new room added "+nHabitacion+"<--"+"\u001B[30m");
    }
    
     public static HashSet<String> addHashService(String arrayLinea) throws MyException{
        String[] arrayLineaServices = arrayLinea.split(",");
        HashSet<String> serviciosPropios = new HashSet();
        
        if(controller.compararService(arrayLineaServices)){
            for(int i=0; i<arrayLineaServices.length; i++){
                serviciosPropios.add(arrayLineaServices[i]);
            }
        }else{
            throw new MyException(2);
        }
        return serviciosPropios;
     }
     
}
