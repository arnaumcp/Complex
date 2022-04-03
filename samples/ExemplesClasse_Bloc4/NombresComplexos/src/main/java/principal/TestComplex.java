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
public class TestComplex {
    
    public static void main (String[] args)
    {
        Complex c1 = new Complex();
        Complex c2 = new Complex(1.0, -1.0);
        Complex c3 = new Complex(c2);           //NO ÉS: Complex c3 = c2;
        c3.setReal(-1);
        
        //System.out.println(c3.getReal() + " + " + c3.getImaginaria() + "i");
    
        System.out.println(c1.toString());
        System.out.println(c2);
    }
    
}
