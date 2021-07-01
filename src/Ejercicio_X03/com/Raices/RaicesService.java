package Ejercicio_X03.com.Raices;

import java.util.Arrays;
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
        return getDiscriminante(raices) > 0;
    }

    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    public void obtenerRaices(Raices raices) {
        double[] respuestas = new double[2];
        double a = raices.getA();
        double b = raices.getB();
        double c = raices.getC();

        if (tieneRaices(raices)) {
            double sqrt = Math.sqrt(getDiscriminante(raices));
            respuestas[0] = (-b + sqrt) / (2 * a);
            respuestas[1] = (-b - sqrt) / (2 * a);
            System.out.println("Los resultados de la ecuacion de las raices son: " + Arrays.toString(respuestas));
        } else {
            System.out.println("Las raices no tienen solucion");
        }

    }

    public void obtenerRaiz(Raices raices) {
        double raiz = -raices.getB() / (raices.getA() * 2);
        System.out.println(tieneRaiz(raices)? "El resultado de la ecuacion es: " + raiz : "La raiz no tiene solucion");

    }

    public void calcular(Raices raices) {
        if(tieneRaices(raices)){
            obtenerRaices(raices);
        }else if(tieneRaiz(raices)){
            obtenerRaiz(raices);
        }else{
            System.out.println("Las raices no tienen solucion");
        }
    }
}
