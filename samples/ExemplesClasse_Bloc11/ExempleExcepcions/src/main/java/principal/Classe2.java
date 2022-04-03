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
public class Classe2
{
    public static void metode2() throws PrimerTipusException, SegonTipusException
    {
        Classe3.metode3();
    }        
}
