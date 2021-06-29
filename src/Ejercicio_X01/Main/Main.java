package Ejercicio_X01.Main;


import Ejercicio_X01.com.Cancion.Cancion;

/*
* Desarrollar  una  clase  Cancion  con  los  siguientes  atributos:  titulo  y  autor.  Se  deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Solo tenia que crear el objeto Cancion con 2 constructores");
        Cancion constructorVacio = new Cancion();
        Cancion conConstructor = new Cancion("Running in the 90's", "Initial D");

        System.out.println("Cancion con constructor vacio: " + constructorVacio);
        System.out.println("Cancion con constructor ingresado: " + conConstructor);

        System.out.println("Llenando manualmente el vacio");
        constructorVacio.setAutor("Initial D(2)");
        constructorVacio.setTitulo("Deja Vu");

        System.out.println("Constructor lleno: " + constructorVacio);
    }
}
