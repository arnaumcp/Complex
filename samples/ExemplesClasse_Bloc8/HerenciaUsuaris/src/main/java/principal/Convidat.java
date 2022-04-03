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
public class Convidat extends Usuari
{
    public Convidat (int sessioID)
    {
        super(sessioID);
    }
    
    public int getSessioID()
    {
        return this.sessioID;
    }
}
