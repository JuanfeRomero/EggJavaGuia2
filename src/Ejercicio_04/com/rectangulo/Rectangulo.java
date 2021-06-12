package Ejercicio_04.com.rectangulo;

import java.util.Scanner;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(){

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la base:");
        setBase(sc.nextDouble());
        System.out.println("Ingrese el tamaño de la altura:");
        setAltura(sc.nextDouble());
    }

    public double superficie(){
        return getBase()*getAltura();
    }

    public double perimetro(){
        return (getBase()+getAltura())*2;
    }

    public void dibujarRectangulo(){
        for (int i = 0; i < getBase(); i++) {
            for (int j = 0; j < getAltura(); j++) {
                if((i == 0 || i == getBase()-1) || (j == 0 || j == getAltura()-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
