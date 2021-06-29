package Ejercicio_03.Main;

import Ejercicio_03.com.operacion.Operacion;

import java.text.MessageFormat;

/*Crear  una  clase  llamada  Operacion  que  tenga  como  atributos  privados  numero1  y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método  para  crearOperacion():  que  le  pide  al  usuario  los  dos  números  y  los
guarda en los atributos del objeto.
17
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar  una  división  por  cero,  el  método  devuelve  0  y  se  le  informa  al  usuario  el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.*/

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
