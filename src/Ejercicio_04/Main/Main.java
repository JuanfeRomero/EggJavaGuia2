package Ejercicio_04.Main;

import Ejercicio_04.com.rectangulo.Rectangulo;

/*Crear  una  clase  Rectángulo  que  modele  rectángulos  por  medio  de  un  atributo
privado base  y  un  atributo  privado  altura.  La  clase  incluirá  un  método  para  crear  el
rectángulo  con  los  datos  del  Rectángulo  dados  por  el  usuario.  También  incluirá  un
método  para  calcular  la  superficie  del  rectángulo  y  un  método  para  calcular  el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes. */
public class Main {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();

        rect.crearRectangulo();

        System.out.println("Superficie: " + rect.superficie());
        System.out.println("Perimetro: " + rect.perimetro());
        rect.dibujarRectangulo();
    }
}
