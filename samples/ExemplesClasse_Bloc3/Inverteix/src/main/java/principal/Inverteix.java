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
public class Inverteix {
    
    public static void main (String[] args)
    {
        String paraula = "Hola";    //Els String són INMUTABLES
        String invertida = "";      //"aloH"
        
        for (int i = paraula.length()-1; i >= 0; i--)
        {
            char c = paraula.charAt(i);
            invertida = invertida + c;
        }
        
        System.out.println(invertida);
    }
    
}
