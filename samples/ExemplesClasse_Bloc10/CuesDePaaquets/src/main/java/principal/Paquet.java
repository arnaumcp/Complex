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
public class Paquet
{
    private int id, qServei, mida;

    public Paquet(int id, int qServei, int mida)
    {
        this.id = id;
        this.qServei = qServei;
        this.mida = mida;
    }
    
    public int getMida()
    {
        return this.mida;
    }
    
    @Override
    public String toString()
    {
        return "[" + this.id + ", " + this.qServei + ", " + this.mida
                + " Bytes]";
    }
}
