package Ejercicio_01;

import Ejercicio_01.com.libro.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();

        libro = libro.cargarLibro();
        System.out.println(libro.toString());
    }
}
