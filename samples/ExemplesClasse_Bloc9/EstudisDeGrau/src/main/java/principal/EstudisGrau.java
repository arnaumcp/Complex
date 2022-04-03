/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class EstudisGrau
{
    private String titulacio;
    //private LinkedList<Assignatura> assignatures;
    private TreeSet<Assignatura> assignatures;
    
    public EstudisGrau(String titulacio)
    {
        this.titulacio = titulacio;
        //this.assignatures = new LinkedList<>();
        this.assignatures = new TreeSet<>();
    }
    
    public void addAssignatura (Assignatura a)
    {
        this.assignatures.add(a);
    }
    
    public void llistaInfoAssignatures()
    {
        //Collections.sort(this.assignatures);
        
        for (Assignatura a : this.assignatures)
        {
            System.out.println(a);
        }
    } 
}
