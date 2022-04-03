/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CuaBuidaException;
import java.util.List;

/**
 *
 * @author user
 */
public class PrioritatEstricta implements Planificador
{
    private List<CuaPaquets> cues;
    
    public PrioritatEstricta()
    {
        this.cues = null;
    }
    
    @Override
    public void setCuesPaquets(List<CuaPaquets> cues)
    {
        this.cues = cues;
    }
    
    @Override
    public Paquet extreu() throws CuaBuidaException
    {
        for (CuaPaquets cua : this.cues)
        {
            if (cua.getOcupada() > 0)
            {
                return cua.extreu();
            }
        }
        
        throw new CuaBuidaException();  //Totes les cues eren buides
    }
}
