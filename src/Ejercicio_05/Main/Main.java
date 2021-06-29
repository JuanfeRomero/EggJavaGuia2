package Ejercicio_05.Main;

/*
* Realizar  una  clase  llamada  Cuenta  (bancaria)  que  debe  tener  como  mínimo  los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:✓
•Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.✓
•Agregar los métodos getters y setters correspondientes✓
•Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.✓
•Método  ingresar(double  ingreso):  el  método  recibe  una  cantidad  de  dinero  a
ingresar y se la sumara a saldo actual.✓
•Método retirar(double retiro): el método recibe una cantidad de dinero a  retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.✓
•Método  extraccionRapida():  le  permitirá  sacar  solo  un  20%  de  su  saldo.  Validar
que el usuario no saque más del 20%.✓
•Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.✓
•Método consultarDatos(): permitirá mostrar todos los datos de la cuenta✓
* */

import Ejercicio_05.com.Cuenta.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta testCuenta = new Cuenta();
        testCuenta.crearCuenta();
        Scanner dinero = new Scanner(System.in);

        testCuenta.consultarSaldo();

        System.out.println("Ingrese la cantidad de dinero a sumar:");
        testCuenta.ingresar(dinero.nextDouble());

        System.out.println("Ingrese la cantidad de dinero a retirar:");
        testCuenta.retirar(dinero.nextDouble());

        testCuenta.extraccionRapida();

        System.out.println("Retirando otra vez para chequear el cero");
        testCuenta.retirar(dinero.nextDouble());

        testCuenta.consultarDatos();
    }
}
