/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CuaBuidaException;
import java.util.Random;

/**
 *
 * @author user
 */
public class SIRO extends CuaPaquets
{
    private Random rnd;
    
    public SIRO (int qServei, int capacitat)
    {
        super (qServei, capacitat);
        this.rnd = new Random();
    }
    
    @Override
    public Paquet extreu() throws CuaBuidaException
    {
        super.extreu();
        
        int index = rnd.nextInt(this.paquets.size());
        Paquet p = this.paquets.remove(index);
        this.ocupada -= p.getMida();
        return p;         
    }
    
    @Override
    public String toString()
    {
        String s = "[SIRO]\n";
        s += super.toString();
        return s;
    }
}
