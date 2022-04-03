/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;

/**
 *
 * @author user
 */
public class Cinema
{
    private String nom, direccio;
    private int telefon;
    private LinkedList<Pelicula> cartellera;    //Podrà guardar qualsevol
                                                //tipus de Pelicula!

    public Cinema(String nom, String direccio, int telefon)
    {
        this.nom = nom;
        this.direccio = direccio;
        this.telefon = telefon;
        this.cartellera = new LinkedList<>();
    }
    
    public void afegeixPelicula (Pelicula p)    //Podrem afegir-hi Novetats
    {                                           //i també Reposicions
        this.cartellera.add(p);
    }
    
    public void llistaCartellera()
    {
        for (Pelicula p : this.cartellera)
        {
            System.out.println(p.toString() + "\n");   //toString() és polimòrfic!
        }
    }
    
    public int getNumeroNovetatsCartellera()
    {
        int numNovetats = 0;
        
        for (Pelicula p : this.cartellera)
        {
            if (p instanceof Novetat)   //returna true si p apunta a
                numNovetats++;          //objecte de subclasse Novetat, o
        }                               //false en cas contrari.
        
        return numNovetats;
    }
    
    public int getNumeroReposicionsTemporadaActual()
    {
        int numReposicionsTempActual = 0;
        
        for (Pelicula p : this.cartellera)
        {
            if (p instanceof Reposicio)
            {
                Reposicio r = (Reposicio)p;         //Downcasting
                if (r.getDeTemporada())
                    numReposicionsTempActual++;
            }
        }
        
        return numReposicionsTempActual;
    }
    
}
