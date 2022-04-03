/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CuaBuidaException;
import excepcions.CuaPlenaException;
import excepcions.QualitatServeiInvalidaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Main
{
    private List<CuaPaquets> cues;
    private Planificador planificador;
    
    public Main()
    {
        this.cues = new ArrayList<>();
        for (int i = 1; i <= 3; i++)
            this.cues.add(new FIFO(i, 5000));   //Es poden crear també
                                                //de tipus LIFO o SIRO
                                                
        this.planificador = new PrioritatEstricta();    //o CuaMesPlena
        this.planificador.setCuesPaquets(this.cues);
    }                                           
    
    
    public void afegeixPaquet(Paquet p) throws
                    QualitatServeiInvalidaException, CuaPlenaException
    {
        int qServei = p.getqServei();
        
        if (qServei <= 0 || qServei > this.cues.size())
            throw new QualitatServeiInvalidaException();
        
        this.cues.get(qServei-1).afegeixPaquet(p);   
    }
    
    public void mostrarCues()
    {
        for (CuaPaquets cua : this.cues)
        {
            System.out.println(cua.toString() + "\n");
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            Main m = new Main();
            m.start();
        }
        catch (QualitatServeiInvalidaException e)
        {
            System.out.println("Qualitat de servei invàlida!");
        }
        catch (CuaPlenaException | CuaBuidaException e)
        {
            System.out.println("Problema: cua plena o buida.");
        }
    }
    
    public void start() throws QualitatServeiInvalidaException,
            CuaPlenaException, CuaBuidaException
    {
        Paquet p1 = new Paquet(1, 1, 1500);
        Paquet p2 = new Paquet(2, 2, 1500);
        Paquet p3 = new Paquet(3, 2, 1500);
        //Paquet p4 = new Paquet(4, 1, 1500);     //Aquest no hi cap!
        
        this.afegeixPaquet(p1);
        this.afegeixPaquet(p2);
        this.afegeixPaquet(p3);
        //this.afegeixPaquet(p4);
        
        System.out.println();
        
        this.mostrarCues();
        
        System.out.println();
        System.out.println();
        
        //Sortirà el primer que havia arribat si FIFO, o el darrer que
        //havia arribat si LIFO, o un a l'atzar si SIRO
        //this.cues.get(0).extreu();
        this.planificador.extreu();
        
        this.mostrarCues();
        
    }
}
