/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

//import java.util.LinkedList;
import java.util.*;             //Totes les classes del package

/**
 *
 * @author user
 */
public class Paraules {
    
    public static void main (String[] args)
    {
        LinkedList<String> paraules;
        paraules = new LinkedList<>();
        
        System.out.println("Nombre de paraules guardades: "
                        + paraules.size());
        
        paraules.add("Hola");
        
        System.out.println("Nombre de paraules guardades: "
                        + paraules.size());
        
        paraules.add("Adeu");
        paraules.add("ETSETB");
        paraules.add("POO");
        paraules.add(0, "Primera");
        
        System.out.println("Nombre de paraules guardades: "
                        + paraules.size() + "\n");
        
        //Sol·licitem l'iterador
        Iterator<String> it = paraules.iterator();
        
        //Bucle d'iteració
        while (it.hasNext())
        {
            String paraula = it.next();
            //System.out.println(paraula);
            
            System.out.println(paraula);
            System.out.println(paraula);
        } 
    }
}
