package Ejercicio_04.Main;

import Ejercicio_04.com.rectangulo.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();

        rect.crearRectangulo();

        System.out.println("Superficie: " + rect.superficie());
        System.out.println("Perimetro: " + rect.perimetro());
        rect.dibujarRectangulo();
    }
}
