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
public class GuiaTuristic implements Facturable
{
    private String ref, nom, nif, zona;
    private int hores;
    private double preu;

    public GuiaTuristic(String ref, String nom, String nif, 
            String zona, int hores, double preu) {
        this.ref = ref;
        this.nom = nom;
        this.nif = nif;
        this.zona = zona;
        this.hores = hores;
        this.preu = preu;
    }
    
    @Override
    public String getReferencia()
    {
        return this.ref;
    }
    
    @Override
    public String generaFactura()
    {
        String s = "Referència: " + this.ref + "\n";
        s += "Nom: " + this.nom + "\n";
        s += "NIF: " + this.nif + "\n";
        s += "Zona: " + this.zona + "\n";
        s += "Hores: " + this.hores + "\n";
        s += "Preu: " + this.preu;
        
        return s;
    }
}
