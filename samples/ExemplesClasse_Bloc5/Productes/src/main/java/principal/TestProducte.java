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
public class TestProducte {
    
    public static void main (String[] args)
    {
        Producte p1 = new Producte("Ordinador");
        Producte p2 = new Producte("Teclat");
        Producte p3 = new Producte("Ratolí");
        
        System.out.println(p1.getIdentificador());
        System.out.println(p2.getIdentificador());
        System.out.println(p3.getIdentificador());
    }
    
}
