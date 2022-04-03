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
public class AlumnePOO {
    
    //Declaració dels atributs
    private String nom, nif;
    private double laboratori, exParcial, exFinal;
    
    //Implementació de mètodes constructors
    public AlumnePOO(String nom, String nif)
    {
        this.nom = nom;
        this.nif = nif;
        this.laboratori = 0.0;
        this.exParcial = 0.0;
        this.exFinal = 0.0;
    }
    
    //Resta de mètodes
    public String getNom()
    {
        return this.nom;
    }
    
    public String getNif()
    {
        return this.nif;
    }
    
    public double getLaboratori()
    {
        return this.laboratori;
    }
    
    public double getExParcial()
    {
        return this.exParcial;
    }
    
    public double getExFinal()
    {
        return this.exFinal;
    }
    
    public void setLaboratori(double laboratori)
    {
        if (laboratori >= 0.0 && laboratori <= 10.0)
            this.laboratori = laboratori;
    }
    
    public void setExParcial (double exParcial)
    {
        if (exParcial >= 0.0 && exParcial <= 10.0)
            this.exParcial = exParcial;
    }
    
    public void setExFinal (double exFinal)
    {
        if (exFinal >= 0.0 && exFinal <= 10.0)
            this.exFinal = exFinal;
    }
    
    public double avalua()
    {
        double notaFinal = 0.0;
        
        if (this.exParcial > this.exFinal)
            notaFinal = 0.25*this.laboratori + 0.2*this.exParcial +
                    0.55*this.exFinal;
        else
            notaFinal = 0.25*this.laboratori + 0.75*this.exFinal;
        
        return notaFinal;
    }
}
