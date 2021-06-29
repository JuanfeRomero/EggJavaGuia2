package Ejercicio_X02.com.Puntos;

import java.util.Scanner;

public class PuntosService {
    public void crearPuntos(Puntos puntos){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el punto x1: ");
        puntos.setX1(sc.nextDouble());
        System.out.println("Ingrese el punto y1: ");
        puntos.setY1(sc.nextDouble());
        System.out.println("Ingrese el punto x2: ");
        puntos.setX2(sc.nextDouble());
        System.out.println("Ingrese el punto y2: ");
        puntos.setY2(sc.nextDouble());
    }

    public double calcularDistancia(Puntos puntos){
        double x1 = puntos.getX1();
        double y1 = puntos.getY1();
        double x2 = puntos.getX2();
        double y2 = puntos.getY2();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2));
    }
}
