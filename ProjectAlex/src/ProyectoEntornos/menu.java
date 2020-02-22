/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoEntornos;

import Utilidades.Colores;

public class menu {
    
    public static void pintarMenu()
    {
        System.out.println(Colores.FONDO_RED+"PROGRAMA REALIZADO POR: JIAHAO ZHOU, ALEJANDRO DIAZ, JORGE CASAU, FRANCISCO ALCANTARA"+Colores.RESET);
        System.out.println(Colores.RED+"#########"+Colores.BLUE+"MENU DEL PROGRAMA"+Colores.RED+"########");
        System.out.println(Colores.RED+"##                              ##");
        System.out.println(Colores.RED+"##"+Colores.BLUE+" 1.- Gestión de empleados     "+Colores.RED+"##");
        System.out.println(Colores.RED+"##"+Colores.BLUE+" 2.- Gestión de alumnos       "+Colores.RED+"##");
        System.out.println(Colores.RED+"##"+Colores.BLUE+" 3.- Gestión de Libros        "+Colores.RED+"##");
        System.out.println(Colores.RED+"##"+Colores.BLUE+" 4.- Salir                    "+Colores.RED+"##");
        System.out.println(Colores.RED+"##                              ##");
        System.out.println(Colores.RED+"##################################");
    }

}
