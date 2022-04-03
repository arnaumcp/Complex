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
public class Novetat extends Pelicula
{
    public Novetat (String titol, String llistaActors, String idioma,
            int duracio)
    {
        super(titol, llistaActors, idioma, duracio);
    }
    
    @Override
    public double getPreu()
    {
        return 9.0;
    }
    
    @Override
    public String toString()
    {
        String s = super.toString();    //Invoquem toString() de Pelicula!
        s += "[NOVETAT]";
        
        return s;
    }     
}
