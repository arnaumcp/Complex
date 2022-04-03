package principal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class Acronims {
    
    public static void main (String[] args)
    {
        //HashMap de definicions d'acrònims identificats per
        //l'acrònim definit
        //HashMap<String, String> defAcronims = new HashMap<>();
        TreeMap<String, String> defAcronims = new TreeMap<>();
                
        defAcronims.put("POO", "Programació Orientada a Objectes");
        defAcronims.put("FO", "Fonaments d'Ordinadors");
        defAcronims.put("ETSETB", "Escola Tècnica ...");
        
        System.out.println(defAcronims.get("POO"));
        System.out.println(defAcronims.get("FO"));
        System.out.println(defAcronims.get("AST") + "\n");
        
        Iterator<String> it = defAcronims.keySet().iterator();
        while (it.hasNext())
        {
            String acr = it.next();
            System.out.println(acr);
        }
    }
}
