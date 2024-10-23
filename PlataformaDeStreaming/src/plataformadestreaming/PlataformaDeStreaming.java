/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plataformadestreaming;

import cl.duoc.model.Peliculas;
import cl.duoc.model.Series;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class PlataformaDeStreaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        
        while(opcion!=5)
        System.out.println("Menu");
        System.out.println("1. Peliculas");
        System.out.println("2. Series");
        System.out.println("3. Documentales");
        System.out.println("4. Menu");
        System.out.println("5. Menu");
        System.out.println("6. Salir");
        
        List<String>Peliculas= new ArrayList<>();
        Peliculas.add("Titanic");
        Peliculas.add("Cars");
        Peliculas.add("Cars 2");
        List<String>Series= new ArrayList<>();
        Series.add("You");
        Series.add("Friends");
        Series.add("Peppa pig");
        List<String>Documentales= new ArrayList<>();
        Documentales.add("Perros");
        Documentales.add("Gatos");
        Documentales.add("Monos");
        
                
        
        
     
    
    }
    
}
