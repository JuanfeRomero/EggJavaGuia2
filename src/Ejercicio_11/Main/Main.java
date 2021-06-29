package Ejercicio_11.Main;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Period;

/*
* Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha  actual,  que  se  puede  conseguir  instanciando  un  objeto  Date  con  constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
* */
public class Main {
    public static void main(String[] args) {
        int dia = 16;
        int mes = 12;
        int anio = 2015;
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();

        System.out.println(fecha);
        System.out.println(fecha.getYear());
        System.out.println(hoy);

        Period diferencia = Period.between(fecha, hoy);

        System.out.println(MessageFormat.format("La diferencia entre {0} y {1} es de {2} año/s, {3} mes/es y {4} dia/s", fecha, hoy, diferencia.getYears(), diferencia.getMonths(), diferencia.getDays()));
    }
}
