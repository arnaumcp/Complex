/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author user
 */
public class AgenciaViatges
{
    private Map<String,Facturable> facturables;     //Els valors podran ser
                                                    //objectes Viatge o GuiaTuristic
    
    public AgenciaViatges()
    {
        this.facturables = new TreeMap<>();
    }
    
    public void addFacturable (Facturable f)
    {
        this.facturables.put(f.getReferencia(), f);
    }
    
    public void llistaFacturablesPendents()
    {
        for (String ref : this.facturables.keySet())
        {
            System.out.println(ref);
        }
    }
    
    public void printFactura (String ref)
    {
        Facturable f = this.facturables.get(ref);
        if (f == null)
        {
            System.out.println("No s'ha trobat el facturable.");
            return;
        }
        
        System.out.println(f.generaFactura());
    }
    
    public void liquida (String ref)
    {
        if (this.facturables.remove(ref) != null)
            System.out.println("Facturable eliminat correctament.");
        else
            System.out.println("No s'ha trobat el facturable.");
    }

}
