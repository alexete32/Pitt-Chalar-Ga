/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectalex;

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
        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
        System.out.println("SUELDO: " + sueldo);
    }
}
