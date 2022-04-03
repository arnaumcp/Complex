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
public class TestEstudisGrau
{
    public static void main (String[] args)
    {
        EstudisGrau grau = new EstudisGrau("GRETST");
        
        Assignatura a1 = new Assignatura ("POO", 122222, 1);
        Assignatura a2 = new Assignatura ("FO", 234211, 1);
        Assignatura a3 = new Assignatura ("PIE", 2344442, 2);
        Assignatura a4 = new Assignatura ("PBE", 3333333, 3);
        
        grau.addAssignatura(a4);
        grau.addAssignatura(a2);
        grau.addAssignatura(a1);
        grau.addAssignatura(a3);
        
        grau.llistaInfoAssignatures();
    }
}
