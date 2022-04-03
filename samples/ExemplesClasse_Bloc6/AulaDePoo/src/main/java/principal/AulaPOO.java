/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.*;

/**
 *
 * @author user
 */
public class AulaPOO {
    
    //Declaració d'atributs
    private int grup;
    private LinkedList<AlumnePOO> matriculats;
    
    //Implementació de mètode constructor
    public AulaPOO (int grup)
    {
        this.grup = grup;
        this.matriculats = new LinkedList<>();
    }
    
    //Implementació de la resta de mètodes
    public void matriculaAlumne (AlumnePOO alumne)
    {
        if(this.cercaAlumne(alumne.getNif()) == null)
            this.matriculats.add(alumne);
    }
    
    public void llistaInfoAlumnesPerPantalla()
    {
        Iterator<AlumnePOO> it = this.matriculats.iterator();
        while (it.hasNext())
        {
            AlumnePOO a = it.next();
            System.out.println(a.getNom() + " " + a.getNif());
        }
    }
    
    public AlumnePOO cercaAlumne (String nif)
    {
        AlumnePOO trobat = null;
        
        Iterator<AlumnePOO> it = this.matriculats.iterator();
        while (it.hasNext() && trobat == null)
        {
            AlumnePOO a = it.next();
            if (a.getNif().equals(nif))
                trobat = a;
        }
        
        return trobat;      //Si no existeix, trobat = null
    }
    
    public boolean esborraAlumne (String nif)
    {
        AlumnePOO a = this.cercaAlumne(nif);
        if (a == null)
            return false;
        
        this.matriculats.remove(a);
        return true;
    }
}
