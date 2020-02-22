/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectalex;

import Utilidades.Colores;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Empleados {

    String nombre;
    int edad = 0, sueldo = 0;

    public void pedirNombre() {
        int cont;
        do {
            cont = 0;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Inserte su nombre: ");
                nombre = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Lo siento se ha producido un error");
                cont++;
            }
        } while (cont == 1);
    }

    public void pedirEdad() {
        int cont;
        do {
            cont = 0;
            do {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Inserte su edad: ");
                    edad = sc.nextInt();
                        if(edad <18)
                        {
                            System.out.println(Colores.RED+"\n\tEl empleado no puede ser menor de edad");
                        } else if (edad > 65)
                        {
                            System.out.println(Colores.RED+"\n\tEl empleado no puede estar en edad de jubilación");
                        }
                } catch (InputMismatchException e) {
                    System.out.println("Lo siento has insertado letras");
                    cont++;
                }
            } while (!(edad >= 18 && edad <= 65));
        } while (cont == 1);
    }

    public void pedirSueldo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su sueldo: ");
        sueldo = sc.nextInt();

    }

    public int getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void pedirTodo() {
        pedirNombre();
        pedirEdad();
        pedirSueldo();
    }

    public void visuTodo() {
        System.out.println("\t\tNOMBRE: " + nombre);
        System.out.println("\t\tEDAD: " + edad);
        System.out.println("\t\tSUELDO: " + sueldo);
    }
}
