/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author user
 */
public class NombreParaules {
    
    public static void main (String[] args)
    {
        String frase = "Hola      adeu    bye";
        char ant = ' ', actual;
        int numParaules = 0;
        
        for (int i = 0; i < frase.length(); i++)
        {
            actual = frase.charAt(i);
            if (ant == ' ' && actual != ' ')
                numParaules++;
            
            ant = actual;
        }
        
        System.out.println("El nombre de paraules de la frase és " + numParaules + ".");    
    }
}
