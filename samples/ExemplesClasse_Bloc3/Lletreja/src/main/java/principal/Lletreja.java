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
public class Lletreja {
    
    public static void main (String[] args)
    {
        String paraula = "Hola";    //H - o - l - a
        
        if (paraula.length() > 0)
            System.out.print(paraula.charAt(0));
        
        for(int i = 1; i < paraula.length(); i++)
        {
            System.out.print(" - " + paraula.charAt(i));
        }
    } 
}
