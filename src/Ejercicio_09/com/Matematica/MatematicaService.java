package Ejercicio_09.com.Matematica;

public class MatematicaService {
    public double devolverMayor(Matematica matematica){
        double num1 = matematica.getNum1();
        double num2 = matematica.getNum2();
        return Math.max(num1, num2);
    }

    public double devolverMenor(Matematica matematica) {
        return Math.min(matematica.getNum1(), matematica.getNum2());
    }

    public double calcularPotencia(Matematica matematica){
        long max = Math.round(devolverMayor(matematica));
        long min = Math.round(devolverMenor(matematica));
        System.out.println(max + " " + min);
        return Math.pow(max, min);
    }

    public double calcularRaiz(Matematica matematica){
        return Math.sqrt(Math.abs(devolverMenor(matematica)));
    }
}
