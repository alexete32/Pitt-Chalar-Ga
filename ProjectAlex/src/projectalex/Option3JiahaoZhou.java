
package projectalex;

import java.util.InputMismatchException;

public class Option3JiahaoZhou {

    private String autor;
    private int numPag, numLibrosQueCoinciden;
    private String tituloLibro,autorLibro;
    private int numPagLibro;
    
    private void pedirTituloLibro()
        {
           //tituloLibro = metodosDePedir.pedirCadena("Inserte el nombre del libro: ");
           tituloLibro = pedirDatos.PedirDatosTeclado.pedirString("Inserte el nombre del libro: ");
        }
    
    private void pedirAutorLibro()
        {
            autorLibro = pedirDatos.PedirDatosTeclado.pedirString("Inserte el nombre del Autor del libro: ");
        }
    private void pedirPaginaLibro()
        {
           numPagLibro = pedirDatos.PedirDatosTeclado.pedirInt("Inserte el numero de página que tiene el libro: ");
        }
    
    private void pedirAutor()
        {
            autor = pedirDatos.PedirDatosTeclado.pedirString("Inserte nombre un Autor para empezar: ");
        }
    private void pedirNumPag()
        {
            numPag = pedirDatos.PedirDatosTeclado.pedirInt("Inserte un número de página para empezar: ");
        }
    
    private void pedirDatosDeInicio()
        {
            pedirAutor();
            pedirNumPag();
        }
    
    private void pedirDatosDeLibro()
        {
            pedirTituloLibro();
            pedirAutorLibro();
            try 
                {
                    
                    pedirPaginaLibro();
                    if(numPagLibro < 0)
                        {
                            System.out.println(Utilidades.Colores.RED+"\tNúmero de página NEGATIVO");
                        }
                    else
                        {
                            if(comprobarAutor(autorLibro) == true)
                                {
                                    numLibrosQueCoinciden++;
                                    System.out.println("\tCantidad de libro del autor [ "+autor+" ] : "+numLibrosQueCoinciden);
                                }
                            if(comprobarAutor(autorLibro) == true && comprobarNumPag(numPagLibro) == true)
                                {
                                    visualizarDatos();
                                    System.out.println("\n");
                                }
                            pedirDatosDeLibro();
                        }
                }
            catch (InputMismatchException e) 
                {
                    System.out.println(Utilidades.Colores.RED+"\tHas insertado letras en [número de página]");
                }
        }
    
    public void empezarPedir()
        {
            pedirDatosDeInicio();
            pedirDatosDeLibro();
        }
    
    private void visualizarDatos()
        {
            System.out.println(Utilidades.Colores.BLUE+"\tLibro: "+tituloLibro);
            System.out.println(Utilidades.Colores.BLUE+"\tAutor: "+autorLibro);
            System.out.println(Utilidades.Colores.BLUE+"\tNúmero de páginas: "+numPagLibro);
        }
    
    private boolean comprobarNumPag(int num)
        {
            if (num >= numPag)
                {
                    return true;
                }
            else
                {
                    return false;
                }
        }
    
    private boolean comprobarAutor(String dato)
        {
            if(dato.equals(autor))
                {
                    return true;
                }
            else
                {
                    return false;
                }
        }
}
