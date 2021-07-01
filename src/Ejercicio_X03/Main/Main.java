package Ejercicio_X03.Main;

import Ejercicio_X03.com.Raices.Raices;
import Ejercicio_X03.com.Raices.RaicesService;

/*
* Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y  c. (done)
*  Hay  que  insertar  estos  3  valores  para  construir  el  objeto  a  través  de  un  método
constructor.(done)
* Luego, las operaciones que se podrán realizar son las siguientes:
* Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c (done)
* Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0. (done)
* Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0. (done)
* Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones. (done)
* Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible. (done)
* Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensajec (done)
* Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
* */
public class Main {

    public static void main(String[] args) {
        Raices parametros = new Raices();
        RaicesService servicios = new RaicesService();

        servicios.crearRaices(parametros);

        System.out.println(parametros);

        servicios.calcular(parametros);
    }

}
