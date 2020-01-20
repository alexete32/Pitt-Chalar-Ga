/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcion2;

import Clases.ErroresOp2;

public class Alumno {

    String nombre;
    int edad, nota;

    public Alumno() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNotas() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }
    
    
    public void pedirNombre() {
        nombre = pedirDatos.PedirDatosTeclado.pedirString("\nInserte el nombre: ");
    }

    public void pedirEdad() {
        edad = pedirDatos.PedirDatosTeclado.pedirIntValidarLetras("Inserte la edad: ");
    }

    public void pedirNotas(){
        int total=0;
        for (int cont = 1; cont <= 5; cont++) {
            ErroresOp2 error=new ErroresOp2();
            nota=pedirDatos.PedirDatosTeclado.pedirIntValidarLetras("\nDime la "+cont+" nota: ");
           
            total=total+nota;
            
            
            
           if(nota<=0 || nota>=10){
                    error.MensajeErrorNota();
            }
           
        }
        
        
    }
    
    int media(int total){
        int media=total/5;
        System.out.println("\n La media de notas es: "+media);
        return media;
    }

}
