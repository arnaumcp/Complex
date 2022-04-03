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
public class Classe1 {
    
    public static void metode1() throws PrimerTipusException, SegonTipusException
    {
        Classe2.metode2();
    }
    
}
