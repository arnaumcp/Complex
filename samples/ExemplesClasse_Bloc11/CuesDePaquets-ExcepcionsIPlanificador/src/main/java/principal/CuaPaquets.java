/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CuaBuidaException;
import excepcions.CuaPlenaException;
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

    public int getOcupada() {
        return ocupada;
    }

    public void afegeixPaquet (Paquet p) throws CuaPlenaException
    {
        if (this.ocupada + p.getMida() > this.capacitat)
            throw new CuaPlenaException();
        
        //Si llancem excepció, no arribarem mai aquí
        this.paquets.add(p);
        this.ocupada += p.getMida();
    }
    
    public Paquet extreu() throws CuaBuidaException
    {
        if (this.paquets.isEmpty())
            throw new CuaBuidaException();
        
        return null;    //Serà un retorn que no ens interessarà...
    }
    
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
