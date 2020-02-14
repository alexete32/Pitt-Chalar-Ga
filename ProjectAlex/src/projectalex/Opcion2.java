/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcion2;


public class Opcion2 {

    public static void main(String[] args) {
        Alumno alu, aluMenosMed;
        float menosMedia = Integer.MAX_VALUE;
        aluMenosMed=null;
        while (true) {
                alu = new Alumno();
                alu.pedirNombre();
                if (alu.getNombre().equals("fin")) {
                    break;
                }
                alu.pedirEdad();
                alu.pedirNotas();
                
                if (alu.getMedia() < menosMedia) {
                menosMedia = alu.getMedia();
                aluMenosMed = alu;
            }
        }
        
        if (aluMenosMed == null) {
            System.out.println("\nNo se han insertado las notas para hacer la media.");
            System.out.println("No puedo visualizar los datos de la media más baja.");
        } else {
            System.out.println("\nEl alumno con peor media es:");
            aluMenosMed.visualizarTodo();
        }

    }

}
