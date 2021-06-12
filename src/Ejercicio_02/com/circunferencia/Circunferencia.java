package Ejercicio_02.com.circunferencia;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Circunferencia crearCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        return new Circunferencia(sc.nextDouble());
    }

    public double area(){
        return Math.PI * Math.pow(getRadio(), 2);
    }

    public double perimetro(){
        return 2 * Math.PI * getRadio();
    }
}
