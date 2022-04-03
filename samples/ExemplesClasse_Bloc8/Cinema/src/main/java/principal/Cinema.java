/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Cinema {
    
    private String nom, direccio;
    private int telefon;
    private HashMap<String,Pelicula> novetats;      //Clau: Títol
    private HashMap<String,Reposicio> reposicions;  //Clau: Títol
    
    public Cinema(String nom, String direccio, int telefon)
    {
        this.nom = nom;
        this.direccio = direccio;
        this.telefon = telefon;
        this.novetats = new HashMap<>();
        this.reposicions = new HashMap<>();
    }
    
    public void addNovetat (Pelicula p)
    {
        this.novetats.put(p.getTitol(), p);
    }
    
    public void addNovetat2(String titol, String llistaActors, String idioma,
            int duracio)
    {
        Pelicula p = new Pelicula(titol, llistaActors, idioma, duracio);
        this.novetats.put(titol, p);
    }
    
    public void addReposicio(Reposicio r)
    {
        this.reposicions.put(r.getTitol(), r);
    }
    
    public void mostraCartellera()
    {
        Iterator<Pelicula> itp = this.novetats.values().iterator();
        while (itp.hasNext())
        {
            System.out.println(itp.next());
            System.out.println();
        }
        
        Iterator<Reposicio> itr = this.reposicions.values().iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
            System.out.println();
        }
    }
}
