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
public class TestDau {
    
    public static void main (String[] args)
    {
        Dau d = new Dau();
        Dau d2 = new Dau(6);
        System.out.println("d = " + d.getValor());
        System.out.println("d2 = " + d2.getValor());
        d2.tirar();
        System.out.println("\nd2 = " + d2.getValor());
    }
    
}
