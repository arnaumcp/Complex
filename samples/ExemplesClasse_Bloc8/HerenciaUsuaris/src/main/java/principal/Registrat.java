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
public class Registrat extends Usuari
{
//    private String nom, email, password;
    protected String nom, email, password;
    
    public Registrat(int sessioID, String nom, String email, String password)
    {
        super(sessioID);
        this.nom = nom;
        this.email = email;
        this.password = password;
    }
}
