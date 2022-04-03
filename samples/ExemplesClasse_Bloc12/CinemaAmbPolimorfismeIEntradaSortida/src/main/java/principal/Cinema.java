/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CarregaCartelleraException;
import excepcions.DesaCartelleraException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

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
    
    public void desaCartellera (String filePath) 
                            throws DesaCartelleraException
    {
        try
        {    
            FileOutputStream fos = new FileOutputStream(filePath, false);
            PrintWriter pw = new PrintWriter (fos);
            
            for (Pelicula p : this.cartellera)
            {
                pw.println(p.getTitol());
                pw.println(p.getLlistaActors());
                pw.println(p.getDuracio());
                pw.println(p.getIdioma());
                
                if (p instanceof Novetat)
                    pw.println("NOVETAT");
                else if (p instanceof Reposicio)
                {
                    Reposicio r = (Reposicio)p;
                    if (r.getDeTemporada())
                        pw.println("REPOSICIO actual");
                    else
                        pw.println("REPOSICIO anteriors");
                }
                else if (p instanceof Gratuita)
                    pw.println("GRATUITA");
                
                pw.println();   //Espai en blanc entre pelicules
            }
           
            pw.close();
        }
        catch (FileNotFoundException e)
        {
            throw new DesaCartelleraException();
        }         
    } 
    
    public void carregaCartellera (String filePath)
                                    throws CarregaCartelleraException
    {
        try
        {
            FileInputStream fis = new FileInputStream(filePath);
            Scanner lector = new Scanner (fis);
            
            while (lector.hasNextLine())
            {
                //Queda encara una pel·licula per llegir com a mínim
                String titol = lector.nextLine();
                String actors = lector.nextLine();
                int duracio = Integer.parseInt(lector.nextLine());
                String idioma = lector.nextLine();
                String tipus = lector.nextLine();
                lector.nextLine();  //Línia en blanc
                
                switch (tipus)
                {
                    case "NOVETAT":
                        Novetat n = new Novetat(titol, actors, idioma, duracio);
                        this.cartellera.add(n);
                        break;
                    case "REPOSICIO actual":
                        Reposicio r = new Reposicio(titol, actors, idioma, duracio, true);
                        this.cartellera.add(r);
                        break;
                    case "REPOSICIO anteriors":
                        Reposicio r2 = new Reposicio(titol, actors, idioma, duracio, false);
                        this.cartellera.add(r2);
                        break;
                    case "GRATUITA":
                        Gratuita g = new Gratuita(titol, actors, idioma, duracio);    
                        this.cartellera.add(g);
                }
            }
            
            lector.close();    
        }
        catch (FileNotFoundException e)
        {
            throw new CarregaCartelleraException();
        }
    }
}
