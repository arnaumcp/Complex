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
public class TestCinema
{
    public static void main (String[] args)
    {
        Cinema cine = new Cinema("Nom cine", "Direcció cine", 11111111);
        
        Pelicula p = new Pelicula("Títol p", "Actors p", "Idioma p", 100);
        Reposicio r1 = new Reposicio("Títol r1", "Actors r1", "Idioma r1", 90, true);
        Reposicio r2 = new Reposicio("Títol r2", "Actors r2", "Idioma r2", 90, false);
    
        cine.addNovetat(p);
        cine.addReposicio(r1);
        cine.addReposicio(r2);
        
        cine.mostraCartellera();
    }
    
}
