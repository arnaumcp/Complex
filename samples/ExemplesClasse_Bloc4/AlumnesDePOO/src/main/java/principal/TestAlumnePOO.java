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
public class TestAlumnePOO {
    
    public static void main (String[] args)
    {
        AlumnePOO a = new AlumnePOO("Jordi", "11111111A");
        a.setLaboratori(8.0);
        a.setExParcial(5.0);
        a.setExFinal(6.0);
        
        System.out.println("Nota final = " + a.avalua());
    }
    
}
