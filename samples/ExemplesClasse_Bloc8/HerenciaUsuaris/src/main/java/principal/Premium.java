/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Premium extends Registrat
{
    private HashMap<Integer,Oferta> ofertes;    //Clau: idProducte
    
    public Premium(int sessioID, String nom, String email, String password)
    {
        super(sessioID, nom, email, password);
        this.ofertes = new HashMap<>();
    }
}
