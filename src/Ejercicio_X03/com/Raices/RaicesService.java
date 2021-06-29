package Ejercicio_X03.com.Raices;

import java.util.Scanner;

public class RaicesService {
    public void crearRaices(Raices raices) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor para 'a'");
        raices.setA(sc.nextDouble());
        System.out.println("Ingrese el valor para 'b'");
        raices.setB(sc.nextDouble());
        System.out.println("Ingrese el valor para 'c'");
        raices.setC(sc.nextDouble());
    }

    public double getDiscriminante(Raices raices) {
        double a = raices.getA();
        double b = raices.getB();
        double c = raices.getC();
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }

    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    public double[] obtenerRaices(Raices raices) {
        double[] respuestas = new double[2];
        double a = raices.getA();
        double b = raices.getB();
        double c = raices.getC();

        if (tieneRaices(raices)) {
            double sqrt = Math.sqrt((b * b) - (4 * a * c));
            respuestas[0] = (-b + sqrt) / (2 * a);
            respuestas[1] = (-b - sqrt) / (2 * a);
        }

        return respuestas;
    }

    public double obtenerRaiz(Raices raices) {
        double raiz = 0;
        return -1;
    }

}
