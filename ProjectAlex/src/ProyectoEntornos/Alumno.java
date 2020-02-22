/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEntornos;

import Clases.ErroresOp2;
import Utilidades.Colores;
import pedirDatos.PedirDatosTeclado;
import java.util.InputMismatchException;

public class Alumno {

    private String nombre;
    private int edad, nota;
    private float media;
    private float total;

    public Alumno() {
        pedirNombre();
        validarSalir();
        while (!nombre.equalsIgnoreCase("fin")) {
            pedirEdad();
            pedirNotas();
            media(total);

            visualizarTodo();

            pedirNombre();
            validarSalir();
        }

    }

    public String getNombre() {
        return nombre;
    }

    int getEdad() {
        return edad;
    }

    int getNotas() {
        return nota;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setEdad(int edad) {
        this.edad = edad;
    }

    void setNota(int nota) {
        this.nota = nota;
    }

    int getNota() {
        return nota;
    }

    public float getMedia() {
        return media;
    }

    void setMedia(float media) {
        this.media = media;
    }

    public void pedirNombre() {
        nombre = pedirDatos.PedirDatosTeclado.pedirString("\nInserte el nombre: ");
    }

    public void pedirEdad() {
        edad = pedirDatos.PedirDatosTeclado.pedirIntValidInsLetras("\nInserte la edad: ");
    }

    public void pedirNotas() {
        int errorn;

        do {
            errorn = 0;
            total = 0;
            for (int cont = 1; cont <= 5; cont++) {
                try {
                    ErroresOp2 error = new ErroresOp2();
                    nota = pedirDatos.PedirDatosTeclado.pedirInt("\nDime la " + cont + " nota: ");

                    total = total + nota;

                    if (nota < 0 || nota > 10) {
                        error.MensajeErrorNota();
                        errorn++;
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println(Colores.RED+"\n\t\tError, ha insertado letras.");
                    errorn++;
                    break;
                }

            }

        } while (errorn == 1);
        media(total);

    }

    float media(float total) {
        media = total / 5;
        System.out.println("\n\tLa media de notas es: " + media);
        return media;
    }

    void visualizarNombre() {
        System.out.println("\n\tSu nombre es: " + nombre);
    }

    void visualizarEdad() {
        System.out.println("\n\tSu edad es: " + edad);
    }

    void visualizarNota() {
        System.out.println("\n\tSu nota media es de: " + media);
    }

    public void visualizarTodo() {
        visualizarNombre();
        visualizarEdad();
        visualizarNota();
    }

    void validarSalir() {
        if (nombre.equalsIgnoreCase("fin")) {
            System.out.println(Colores.BLUE+"\n\tSe ha introducido fin");
            System.out.println(Colores.BLUE+"\n\tCerramos el programa");
        }
    }

}
