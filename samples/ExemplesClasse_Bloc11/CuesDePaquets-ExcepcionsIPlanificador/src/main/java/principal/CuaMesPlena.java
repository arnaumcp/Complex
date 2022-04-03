/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CuaBuidaException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class CuaMesPlena implements Planificador
{
    private List<CuaPaquets> cues;
    
    public CuaMesPlena()
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
        /*CuaPaquets mesPlena = null;
        
        for (CuaPaquets cua : this.cues)
        {
            if (cua.getOcupada() > 0)
            {
                if (mesPlena == null || mesPlena.getOcupada() < cua.getOcupada())
                    mesPlena = cua;
            }
        }
        
        if (mesPlena == null)
            throw new CuaBuidaException();
        
        return mesPlena.extreu(); */
        
        if (this.cues.isEmpty())
            throw new CuaBuidaException();
               
        Iterator<CuaPaquets> it = this.cues.iterator();        
        CuaPaquets mesPlena = it.next();
        
        while (it.hasNext())
        {
            CuaPaquets cua = it.next();
            if (cua.getOcupada() > mesPlena.getOcupada())
                mesPlena = cua;
        }
        
        if (mesPlena.getOcupada() == 0)
            throw new CuaBuidaException();
        
        return mesPlena.extreu();
    }
}
