/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcion2;

import Clases.ErroresOp2;

public class Opcion2 {

    public static void main(String[] args) {
        Alumno alu;
        while (true) {
            
                alu = new Alumno();
                alu.pedirNombre();
                if (alu.getNombre().equals("fin")) {
                    break;
                }
                alu.pedirEdad();
                alu.pedirNotas();


        }

    }

}
