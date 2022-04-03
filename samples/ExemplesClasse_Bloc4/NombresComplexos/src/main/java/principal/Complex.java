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
public class Complex {
    
    //Declaració dels atributs
//    private double real;
//    private double imaginaria;
    private double real, imaginaria;
    
    //Implementació dels mètodes constructors
    public Complex()
    {
        this.real = 0.0;
        this.imaginaria = 0.0;
    }
    
    public Complex(double real, double imaginaria)
    {
        this.real = real;
        this.imaginaria = imaginaria;
    }
    
    public Complex(Complex c)
    {
        this.real = c.real;
        this.imaginaria = c.imaginaria;
    }
    
    //Resta de mètodes
    public double getReal()
    {
        return this.real;
    }
    
    public double getImaginaria()
    {
        return this.imaginaria;
    }
    
    public void setReal(double real)
    {
        this.real = real;
    }
    
    public void setImaginaria(double imaginaria)
    {
        this.imaginaria = imaginaria;
    }
    
    @Override
    public String toString()
    {
        //Retorna un String inicialitzat amb la info rellevant de l'objecte
        //  -> Valor dels atributs en un format adeqüat
        
        String s = "" + this.real;
        
        if (this.imaginaria >= 0)
            //s = s + " + ";
            s += " + ";
        
        //s = s + this.imaginaria;
        s += this.imaginaria + "i";
        
        return s;
    }   
}
