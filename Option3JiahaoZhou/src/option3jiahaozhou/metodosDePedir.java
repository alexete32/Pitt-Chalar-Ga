package option3jiahaozhou;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class metodosDePedir 
{

    public static String pedirCadena(String msg)
        {
            String dato;
            Scanner input = new Scanner(System.in);
            System.out.print(msg);
            return dato = input.nextLine();
        }


    public static int pedirEntero(String msg)
        {
            int num;
            Scanner input = new Scanner(System.in);
            System.out.print(msg);
            return num = input.nextInt();
        }
    
    public static float pedirFloat(String msg)
        {
            float num;
            Scanner input = new Scanner(System.in);
            System.out.print(msg);
            return num = input.nextFloat();
        }
    
    int pedirSoloEntero(String msg)
        {
            int num;
            Scanner input = new Scanner(System.in);
            System.out.print(msg);
            return num = input.nextInt();
        }
    
    public static int pedirIntOld(String mensaje)
        {
           int num = 0; 
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader leerBuffer = new BufferedReader(input);
        try {
            System.out.println(mensaje);
           String informTecleada = leerBuffer.readLine();
           num = Integer.parseInt(informTecleada);
        } catch (IOException ex) {
            Logger.getLogger(metodosDePedir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch(NumberFormatException e)
            {
               // System.out.println("Lo has insertado letras.");
                //System.out.println("El error: "+e.toString());
                System.out.println(e.getMessage());
                throw e;
            }
        return num;
        }
}

