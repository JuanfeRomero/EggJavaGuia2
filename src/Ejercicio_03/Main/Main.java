package Ejercicio_03.Main;

import Ejercicio_03.com.operacion.Operacion;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        Operacion calculos = new Operacion();
        calculos.crearOperacion();

        System.out.println(MessageFormat.format("Numero 1: {0}, Numero 2: {1}", calculos.getNumero1(), calculos.getNumero2()));
        System.out.println("Suma = " + calculos.sumar());
        System.out.println("Resta = " + calculos.restar());
        System.out.println(calculos.multiplicar() == 0? "ERROR, uno de los numeros ingresados es 0" : "Multiplicar: " + calculos.multiplicar());
        System.out.println(calculos.getNumero2() == 0? "ERROR, intenta dividir por 0": "Dividir = " + calculos.dividir());
    }
}
