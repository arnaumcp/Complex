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
public class NombreMinuscules {
    
    public static void main (String[] args)
    {
        int numMinuscules = 0;
        
        String text = "Hola què tal?";
        String textM = text.toUpperCase();
        
        for (int i = 0; i < text.length(); i++)
        {
//            char c = text.charAt(i);
//            if (c >= 'a' && c <= 'z')
//                numMinuscules++;
            
            char c1 = text.charAt(i);
            char c2 = textM.charAt(i);
            
            if (c1 != c2)
                numMinuscules++;
        }
        
        System.out.println("El nombre de minúscules és: "+ numMinuscules +".");
        
    }
    
}
