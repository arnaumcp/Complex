/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class CuaPaquets
{
    protected int qServei, capacitat, ocupada;
    protected List<Paquet> paquets;
    
    public CuaPaquets(int qServei, int capacitat)
    {
        this.qServei = qServei;
        this.capacitat = capacitat;
        this.ocupada = 0;
        this.paquets = new LinkedList<>();
    }
    
    public boolean afegeixPaquet (Paquet p)
    {
        if (this.ocupada + p.getMida() <= this.capacitat)
        {
            this.paquets.add(p);
            this.ocupada += p.getMida();
            return true;
        }
        
        return false;
    }
    
    public abstract Paquet extreu();
    
    @Override
    public String toString()
    {
        String s = "qServei: " + this.qServei + "\n";
        s += "Capacitat ocupada: " + this.ocupada + "/" + this.capacitat + "\n";
        
        for (Paquet p : this.paquets)
        {
            s += "\t" + p.toString() + "\n";
        }
        
        return s;
    }
}
