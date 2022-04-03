/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.PrimerTipusException;
import excepcions.SegonTipusException;
import java.util.Random;

/**
 *
 * @author user
 */
public class Classe3
{
    public static void metode3() throws PrimerTipusException, SegonTipusException
    {
        Random rnd = new Random();
        double val = rnd.nextDouble();  //valor aleatori entre [0.0,1.0]
        
        if (val < 0.5)
        {
            PrimerTipusException e = 
                    new PrimerTipusException("val = " + String.format("%.2f", val));
            throw e;
        }
        else
        {
            SegonTipusException e = 
                    new SegonTipusException("val = " + String.format("%.2f", val));
            throw e;
        }
    }
}
