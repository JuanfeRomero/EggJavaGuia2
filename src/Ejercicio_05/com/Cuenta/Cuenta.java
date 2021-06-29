package Ejercicio_05.com.Cuenta;

import java.util.Scanner;

public class Cuenta {
    Scanner sc = new Scanner(System.in);
    private int numeroCuenta;
    private long DNI;
    private double saldoActual;

    public Cuenta(int numeroCuenta, long DNI, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta(){

        System.out.println("Ingrese el numero de la cuenta:");
        setNumeroCuenta(sc.nextInt());

        System.out.println("Ingrese el DNI");
        setDNI(sc.nextLong());

        System.out.println("Ingrese el saldo actual");
        setSaldoActual(sc.nextDouble());
    }

    public void ingresar(double dinero){
        setSaldoActual(getSaldoActual()+dinero);

        System.out.println("Su nuevo saldo es: " + getSaldoActual());
    }

    public void retirar(double dinero) {
        setSaldoActual(getSaldoActual() < dinero ? 0 : getSaldoActual() - dinero);

        System.out.println("Su saldo restante es: " + getSaldoActual());
    }

    public void extraccionRapida(){
        double max = getSaldoActual()*0.2;

        System.out.println("Ingrese hasta el 20% de su saldo a retirar");
        double retirando = sc.nextDouble();

        while(retirando > max){
            System.out.println("Error. No puede excederse del 20% de su sueldo, ingrese otro monto");
            retirando = sc.nextDouble();
        }

        setSaldoActual(getSaldoActual()-retirando);

        System.out.println("Extraccion exitosa, saldo actualizado: " + getSaldoActual());
    }

    public void consultarSaldo(){
        System.out.println("El saldo disponible en su cuenta es de: " + getSaldoActual());
    }

    public void consultarDatos(){
        System.out.println("Cliente N°: " + getNumeroCuenta());
        System.out.println("DNI: " + getDNI());
        consultarSaldo();
    }
}
