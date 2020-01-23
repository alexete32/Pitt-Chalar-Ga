/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectalex;

import java.util.InputMismatchException;

/**
 *
 * @author Alex
 */
public class ProjectAlex {

    public static void main(String[] args) {
        int cont,contEm=0;
        float maxSueldo = Integer.MIN_VALUE;
        Empleados em = new Empleados();
        Empleados emMaxSueldo = new Empleados();

        do{
        contEm++;
        cont = 0;
        em.pedirNombre();
        em.pedirEdad();
        try{
        em.pedirSueldo();
       
        if(em.getSueldo() > maxSueldo){
        maxSueldo = em.getSueldo();
        emMaxSueldo = em;
        emMaxSueldo.visuTodo();
        }
        
        }catch(InputMismatchException e){
            System.out.println("Lo siento has insertado letras, se va a ir del programa");
            cont++;
        }
        }while(cont == 0);
        System.out.println("Hemos metido los datos de "+contEm+" Empleados");
        
    }

}

