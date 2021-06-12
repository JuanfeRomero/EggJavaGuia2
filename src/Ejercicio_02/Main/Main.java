package Ejercicio_02.Main;

import Ejercicio_02.com.circunferencia.Circunferencia;

public class Main {
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia(2);

        circulo = circulo.crearCircunferencia();

        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Area: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());
    }
}
