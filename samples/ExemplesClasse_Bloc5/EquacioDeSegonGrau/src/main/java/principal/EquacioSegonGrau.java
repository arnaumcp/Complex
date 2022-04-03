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
public class EquacioSegonGrau {
    
    public static void main (String[] args)
    {
        double a = 1.0, b = 4.0, c = 1.0;
        double x1, x2;
        
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
    }
    
}
