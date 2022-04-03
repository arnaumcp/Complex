package principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Producte {
    
    private String nom;
    private int identicador;
    private static int ultimIdentificador = 0;
    
    public Producte (String nom)
    {
        this.nom = nom;
        this.identicador = Producte.ultimIdentificador + 1;
        Producte.ultimIdentificador = this.identicador;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public int getIdentificador()
    {
        return this.identicador;
    }
}
