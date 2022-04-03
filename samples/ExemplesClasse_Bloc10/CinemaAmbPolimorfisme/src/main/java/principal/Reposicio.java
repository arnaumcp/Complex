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
public class Reposicio extends Pelicula
{
    private boolean deTemporada;
    
    public Reposicio (String titol, String llistaActors, String idioma,
            int duracio, boolean deTemporada)
    {
        super (titol, llistaActors, idioma, duracio);
        this.deTemporada = deTemporada;
    }
    
    public boolean getDeTemporada()
    {
        return this.deTemporada;
    }
    
    @Override
    public double getPreu()
    {
        if (this.deTemporada)
            return 6.0;
        else
            return 3.0;
    }
    
    @Override
    public String toString()
    {
        String s = super.toString();
        if (this.deTemporada)
            s += "[REPOSICIO actual]";
        else
            s += "[REPOSICIO anteriors]";
        
        return s;
    }
}
