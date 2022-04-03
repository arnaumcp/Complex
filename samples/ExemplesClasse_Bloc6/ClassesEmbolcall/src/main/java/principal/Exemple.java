/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exemple {
    
    public static void main (String[] args)
    {
        //Introduir pel teclat valor enter >= 0
        //En un contenidor -> enters [0, valor] successius 0,1,2,3,..., valor
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introdueix el valor (>=0): ");
        int valor = Integer.parseInt(lector.nextLine());
        
        ArrayList<Integer> consecutius = new ArrayList<>();
        for (int i = 0; i <= valor; i++)
        {
            consecutius.add(i);
        }
            
        //Ara mostrem x pantalla els valors consecutius generats, separats per ,
        //0, 1, 2, 3, 4, 5, 6
        
        Iterator<Integer> it = consecutius.iterator();
        
        if (it.hasNext())
            System.out.print(it.next());
        
        while (it.hasNext())
            System.out.print(", " + it.next());
        
        System.out.println();
        
    }
}
