/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Random;

/**
 *
 * @author user
 */
public class Dau {
    
    //Declaració dels atributs del objectes de la classe
    private int numero;
    
    //Implementació dels mètodes constructors
    public Dau()
    {
        this.numero = 1;
    }
    
    public Dau(int numero)
    {
        if (numero >= 1 && numero <= 6)
            this.numero = numero;
        else
            this.numero = 1;
    }
    
    //Implementació de la resta de mètodes
    public void tirar()
    {
        Random rnd = new Random();
        this.numero = rnd.nextInt(6) + 1;   //[0, 5] + 1 -> [1, 6]
    }
    
    public int getValor()
    {
        return this.numero;
    }
}
