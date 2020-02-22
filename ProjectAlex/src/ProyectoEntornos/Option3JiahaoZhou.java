package ProyectoEntornos;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Vector;
import jdk.nashorn.internal.ir.BreakNode;

public class Option3JiahaoZhou {

    private String autor;
    private int numPag, numLibrosQueCoinciden;
    //private Libro[] libros = new Libro[0];

    public class Libro {

        private String tituloLibro, autorLibro;
        private int numPagLibro;

        public int getNumPag() {
            return this.numPagLibro;
        }

        public String getTituloLibro() {
            return this.tituloLibro;
        }

        public String getAutorLibro() {
            return this.autorLibro;
        }

        public void setTituloLibro(String tituloLibro) {
            this.tituloLibro = tituloLibro;
        }

        public void setAutorLibro(String autorLibro) {
            this.autorLibro = autorLibro;
        }

        public void setNumPagLibro(int numPagLibro) {
            this.numPagLibro = numPagLibro;
        }
    }
/*
    private void añadirLibroOK(Libro lib) {
        libros = Arrays.copyOf(libros, libros.length + 1);
        libros[libros.length - 1] = lib;
    }
*/
    private void pedirTituloLibro(Libro lib) {
        lib.setTituloLibro(pedirDatos.PedirDatosTeclado.pedirString("Inserte el nombre del libro: "));
    }

    private void pedirAutorLibro(Libro lib) {
        lib.setAutorLibro(pedirDatos.PedirDatosTeclado.pedirString("Inserte el nombre del Autor del libro: "));
    }

    private void pedirPaginaLibro(Libro lib) {
        lib.setNumPagLibro(pedirDatos.PedirDatosTeclado.pedirInt("Inserte el numero de página que tiene el libro: "));
    }

    private void pedirAutor() {
        autor = pedirDatos.PedirDatosTeclado.pedirString("Inserte nombre un Autor para empezar: ");
    }

    private void pedirNumPag() throws Exception {
        numPag = pedirDatos.PedirDatosTeclado.pedirInt("Inserte un número de página para empezar: ");
        if (numPag < 0) {
            throw new Exception("El numero de paginas es negativo");
        }
    }

    private void pedirDatosDeInicio() throws Exception {
        System.out.println("Datos de rastreo del libro");
        pedirAutor();
        pedirNumPag();
        System.out.println("Fin de la insercción del rastreo");
        System.out.println("------------------------------");
    }

    private void pedirDatosDeLibro() {
  
        
        try {
            Libro lib = new Libro();

            pedirTituloLibro(lib);
            pedirAutorLibro(lib);
            pedirPaginaLibro(lib);
            if (lib.getNumPag() < 0) {
                System.out.println(Utilidades.Colores.RED + "\tNúmero de página NEGATIVO");
            } else {
                if (comprobarAutor(lib.getAutorLibro()) == true) {
                    numLibrosQueCoinciden++;
                    System.out.println("\tCantidad de libro del autor [ " + autor + " ] : " + numLibrosQueCoinciden);
                    if (comprobarNumPag(lib.getNumPag())) {
                       // añadirLibroOK(l);
                        
                        System.out.println("\n");
                        visualizarDatos(lib);
                        
                    }
                }
                pedirDatosDeLibro();
            }
        } catch (InputMismatchException e) {
            System.out.println(Utilidades.Colores.RED + "\tHas insertado letras en [número de página]");
        }
        //visualizarListaDatos();
    }

    public int empezarPedir() {
        try {
            pedirDatosDeInicio();
            pedirDatosDeLibro();
        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido una letra");
            return 1;
        } catch (Exception e) {
            System.out.println("Se ha introducido un numero negativo");
            return 2;
        }

        return 0;
    }

    private void visualizarDatos(Libro lib) {
        System.out.println("AUTOR: " + lib.getAutorLibro());
        System.out.println("NOMBRE LIBRO: " + lib.getTituloLibro());
        System.out.println("NUMERO DE PAGINAS: " + lib.getNumPag());
    }
/*
    private void visualizarListaDatos() {
        for (int i = 0; i < libros.length; i++) {
            Libro lib = libros[i];
            System.out.println("AUTOR: " + lib.getAutorLibro());
            System.out.println("NOMBRE LIBRO: " + lib.getTituloLibro());
            System.out.println("NUMERO DE PAGINAS: " + lib.getNumPag());
        }
    }
*/
    private boolean comprobarNumPag(int num) {
        return num >= numPag;
    }

    private boolean comprobarAutor(String dato) {
        return dato.equals(autor);
    }
}
