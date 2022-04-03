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
public class Assignatura implements Comparable<Assignatura>
{
    private String nom;
    private int codi, curs;

    public Assignatura(String nom, int codi, int curs)
    {
        this.nom = nom;
        this.codi = codi;
        this.curs = curs;
    }

    public String getNom()
    {
        return nom;
    }

    public int getCodi()
    {
        return codi;
    }

    public int getCurs()
    {
        return curs;
    }
    
    @Override
    public String toString()
    {
        String s = "Nom: " + this.nom + "; codi: " + 
                this.codi + "(curs: " + this.curs + ")";
        
        return s;
    }
    
    @Override
    public int compareTo(Assignatura a)
    {
        //retorna 0  -> this = a
        //retorna >0 -> this > a
        //returna <0 -> this < a
        
        int difCurs = this.curs - a.curs;
        if (difCurs != 0)
            return difCurs;
        
        return this.nom.compareTo(a.nom);
    }
}
