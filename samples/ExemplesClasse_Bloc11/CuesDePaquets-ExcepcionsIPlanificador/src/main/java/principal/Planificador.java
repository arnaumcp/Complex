/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CuaBuidaException;
import java.util.List;

/**
 *
 * @author user
 */
public interface Planificador
{
    public void setCuesPaquets (List<CuaPaquets> cues);
    public Paquet extreu() throws CuaBuidaException;
}
