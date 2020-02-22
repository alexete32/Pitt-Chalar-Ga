/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEntornos;

/**
 * Proyecto Realizado por :
 * Alejandro Diaz
 * Jorge Casau
 * Jiahao Zhou
 * Francisco Alcántara
 */
import Utilidades.Colores;
import java.util.InputMismatchException;
import pedirDatos.PedirDatosTeclado;

public class Principal {

    public static void main(String[] args) {
        int opcion = 0;
        menu.pintarMenu();
        try {
            opcion = PedirDatosTeclado.pedirInt("Inserte la opcion : ");
        } catch (InputMismatchException e) {
            System.out.println(Colores.RED + "Error has introducido una letra. Vuelva a introducir una opción válida");
            opcion = PedirDatosTeclado.pedirInt("Inserte la opcion : ");

        }
        switch (opcion) {
            case 1:
                opcionEmpleados();
                break;
            case 2:
                Alumno alu = new Alumno();
                break;
            case 3:
                Option3JiahaoZhou libro = new Option3JiahaoZhou();
                int ret = libro.empezarPedir();
                if (ret == 1 || ret == 2) {
                    System.out.println("Se termina de introducir datos");
                }
                break;
            case 4:
                System.out.println("Opcion 4");
                break;

        }

    }

    static void opcionEmpleados() {
        int cont =0, contEm = 0;
        float maxSueldo = Integer.MIN_VALUE;
        
        Empleados emMaxSueldo = new Empleados();

        do {
            Empleados em = new Empleados();
            em.pedirNombre();
            em.pedirEdad();
            try {
                em.pedirSueldo();
                if (em.getSueldo() > maxSueldo) {
                    maxSueldo = em.getSueldo();
                    emMaxSueldo = em;   
                }
                contEm++;
            } catch (InputMismatchException e) {
                System.out.println("Lo siento has insertado letras, se va a ir del programa");
                cont++;
            }
        } while (cont == 0);
        System.out.println("\nLos datos del empleado con mayor sueldo son : ");
        emMaxSueldo.visuTodo();
        System.out.println("Hemos metido los datos de " + contEm + " Empleados");
    }

}
