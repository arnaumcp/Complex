/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.PrimerTipusException;
import excepcions.SegonTipusException;

/**
 *
 * @author user
 */
public class Main {
    
    public static void main (String[] args)
    {
        try
        {
            Classe1.metode1();
            System.out.println("Aquesta línea no la vull executar.");
        }
        catch (PrimerTipusException e)
        {
            System.out.println("S'ha capturat una excepció PrimerTipusException: "
                    + e.getMessage());
            e.printStackTrace();
            
        }
        catch (SegonTipusException e)
        {
            System.out.println("S'ha capturat una excepció SegonTipusException."
                    + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
