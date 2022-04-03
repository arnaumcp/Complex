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
public abstract class Pelicula {
    
    protected String titol, llistaActors, idioma;
    protected int duracio;
    
    public Pelicula (String titol, String llistaActors, String idioma, 
            int duracio)
    {
        this.titol = titol;
        this.llistaActors = llistaActors;
        this.idioma = idioma;
        this.duracio = duracio;
    }

    public String getTitol() {
        return titol;
    }

    public String getLlistaActors() {
        return llistaActors;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getDuracio() {
        return duracio;
    }
    
    public abstract double getPreu();
    
    @Override
    public String toString()
    {
        String s = "Títol: " + this.titol + "\n";
        s += "Actors: " + this.llistaActors + "\n";
        s += "Idioma: " + this.idioma + "\n";
        s += "Duració: " + this.duracio + " minuts\n";
        
        return s;
    }
    
}
