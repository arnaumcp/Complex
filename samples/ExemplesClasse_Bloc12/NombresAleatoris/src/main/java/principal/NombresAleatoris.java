/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class NombresAleatoris
{
    public static void main (String[] args)
    {
        String dirTreball = System.getProperty("user.dir");
        String pathFitxer = dirTreball + File.separator + 
                "valors" + File.separator + "valors.txt";
        
        try
        {
            FileOutputStream fos = new FileOutputStream (pathFitxer, false);
            PrintWriter pw = new PrintWriter (fos);
            
            Random rnd =  new Random();
            for (int i = 0; i < 100; i++)
            {
                pw.print(rnd.nextDouble() + " ");
            }
            
            pw.close();
            
            FileInputStream fis = new FileInputStream (pathFitxer);
            Scanner lector = new Scanner (fis);
            lector.useLocale(Locale.US);            //Decimals "."
            
//            if (lector.hasNextLine())
//            {
//                String linea = lector.nextLine();
//                String[] valors = linea.split(" ");
//                
//                double suma = 0.0, minim = 1.0, maxim = 0.0;
//                
//                for (int i = 0; i < valors.length; i++)
//                {
//                    double valor = Double.parseDouble(valors[i]);
//                    suma += valor;
//                    
//                    if (valor < minim)
//                        minim = valor;
//                    if (valor > maxim)
//                        maxim = valor;
//                }
//                
//                System.out.println("Mínim: " + minim);
//                System.out.println("Màxim: " + maxim);
//                System.out.println("Mitjana: " + suma/valors.length);    
//            }

            double suma = 0.0, minim = 1.0, maxim = 0.0;
            int cont = 0;
            
            while (lector.hasNextDouble())
            {
                double valor = lector.nextDouble();
                suma += valor;
                
                if (valor < minim)
                    minim = valor;
                if (valor > maxim)
                    maxim = valor;
                
                cont++;
            }
            
            System.out.println("Mínim: " + minim);
            System.out.println("Màxim: " + maxim);
            System.out.println("Mitjana: " + suma/cont);
        
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Path fitxer incorrecte: " + pathFitxer);
        }
    }
}
