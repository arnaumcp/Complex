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
public class Viatge implements Facturable
{
    private String ref, dataIni, dataFinal, desti;
    private double preu;

    public Viatge(String ref, String dataIni, String dataFinal, 
            String desti, double preu) {
        this.ref = ref;
        this.dataIni = dataIni;
        this.dataFinal = dataFinal;
        this.desti = desti;
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
        s += "Data inici: " + this.dataIni + "\n";
        s += "Data final: " + this.dataFinal + "\n";
        s += "Destí: " + this.desti + "\n";
        s += "Preu: " + this.preu;
        
        return s;
    }
}
