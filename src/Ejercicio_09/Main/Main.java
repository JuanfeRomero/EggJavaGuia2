package Ejercicio_09.Main;

import Ejercicio_09.com.Matematica.Matematica;
import Ejercicio_09.com.Matematica.MatematicaService;

/*
* Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un  constructor  vacío,  parametrizado  y  get  y  set.
*
* En  el  main  se  creará  el  objeto  y  se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set.  Deberá además implementar los siguientes métodos:
*
•Método  devolverMayor()  para  retornar  cuál  de  los  dos  atributos  tiene  el  mayor
valor
•Método  calcularPotencia()  para  calcular  la  potencia  del  mayor  valor  de  la  clase
elevado al menor número. Previamente se deben redondear ambos valores.
•Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
* */
public class Main {
    public static void main(String[] args) {
        Matematica mate = new Matematica();
        MatematicaService mateService = new MatematicaService();

        mate.setNum1(Math.random()*100);
        mate.setNum2(Math.random()*100);

        System.out.println(mate);
        System.out.println("Mayor: " + mateService.devolverMayor(mate));
        System.out.println("Menor: " + mateService.devolverMenor(mate));
        System.out.println("Potencia: " + mateService.calcularPotencia(mate));
        System.out.println("Raiz []: " + mateService.calcularRaiz(mate));
    }
}
