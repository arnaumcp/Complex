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
    
    public Reposicio(String titol, String llistaActors, String idioma,
            int duracio, boolean deTemporada)
    {
        super(titol, llistaActors, idioma, duracio);
        this.deTemporada = deTemporada;
    }
    
    @Override
    public double getPreu()
    {
        if(this.deTemporada)
            return 6.0;
        else
            return 3.0;
    }
    
    @Override
    public String toString()
    {
//        String s = "Títol: " + this.titol + "\n";
//        s += "Actors: " + this.llistaActors + "\n";
//        s += "Idioma: " + this.idioma + "\n";
//        s += "Duració: " + this.duracio + " minuts\n";
//        s += "[REPOSICIÓ ";
//        if (this.deTemporada)
//            s += "actual]";
//        else
//            s += "anteriors]";
//        
//        return s;
        
        StringBuilder s = new StringBuilder();
        s.append("Titol: ").append(this.titol).append("\n");
        s.append("Actors:").append(this.llistaActors).append("\n");
        s.append("Idioma: ").append(this.idioma).append("\n");
        s.append("Duració: ").append(this.duracio).append("\n");
        s.append("REPOSICIÓ [");
        
        if (this.deTemporada)
            s.append("actual]");
        else
            s.append("anteriors]");
        
        return s.toString();     
    }
}
