/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CarregaCartelleraException;
import excepcions.DesaCartelleraException;
import java.io.File;

/**
 *
 * @author user
 */
public class TestCinemaPolimorfisme
{
    public static void main (String[] args)
    {
        Cinema cine = new Cinema("Nom cine", "Direcció cine", 11111111);
        
//        Novetat n = new Novetat("Títol n", "Actors n", "Idioma n", 100);
//        Reposicio r1 = new Reposicio("Títol r1", "Actors r1", "Idioma r1", 90, true);
//        Reposicio r2 = new Reposicio("Títol r2", "Actors r2", "Idioma r2", 90, false);
//        Gratuita g = new Gratuita("Títol g", "Actors g", "Idioma g", 90);
//        
//        cine.afegeixPelicula(n);
//        cine.afegeixPelicula(r1);
//        cine.afegeixPelicula(r2);
//        cine.afegeixPelicula(g);
        
        String filePath = System.getProperty("user.dir")
                + File.separator + "cartellera.txt";
        
//        try
//        {
//            cine.desaCartellera(filePath);
//        }
//        catch (DesaCartelleraException e)
//        {
//            System.err.println("Error desant la cartellera.");
//        }
    
        try
        {
            cine.carregaCartellera(filePath);
            cine.llistaCartellera();
        }
        catch (CarregaCartelleraException e)
        {
            System.err.println("Error carregant la cartellera.");
        }
    }
    
}
