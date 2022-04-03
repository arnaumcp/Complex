/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class NumParaules {
    
    public static void main (String[] args)
    {
        ArrayList<String> paraules = new ArrayList<>();
        paraules.add("Hola");
        paraules.add("Adeu");
        paraules.add("POO");
        paraules.add("Adeu");
        paraules.add("Adeu");
        paraules.add("Adeu");
        paraules.add("POO");
        
        System.out.println("Número total de paraules: " + paraules.size());
        
        HashSet<String> diferents = new HashSet<>();
        
        Iterator<String> it = paraules.iterator();
        while (it.hasNext())
        {
            System.out.println(diferents.add(it.next()));
        }
        
        System.out.println("Nombre de paraules diferents: " + diferents.size());
        for (String paraulaDiferent : diferents)
        {
            System.out.println(paraulaDiferent);
        }
    }
    
}
