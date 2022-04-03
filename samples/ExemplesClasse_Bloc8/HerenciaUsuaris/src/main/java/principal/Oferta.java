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
public class Oferta
{
    private int descompte;
    private Producte producte;
    
    public Oferta (int descompte, Producte producte)
    {
        this.descompte = descompte;
        this.producte = producte;
    }
}
