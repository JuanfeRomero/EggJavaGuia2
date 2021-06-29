package Ejercicio_06.Main;


import Ejercicio_06.com.Cafetera.Cafetera;

import java.util.Scanner;

/*  Programa Nespresso.
    Desarrolle una clase Cafetera ✓ con los atributos capacidadMaxima
     (la  cantidad  máxima  de  café  que  puede  contener  la  cafetera)  y
     cantidadActual  (la  cantidad  actual  de  café  que  hay  en  la  cafetera). ✓
     Implemente,  al menos, los siguientes métodos:
    •Constructor predeterminado o vacío ✓
    •Constructor con la capacidad máxima y la cantidad actual ✓
    •Métodos getters y setters. ✓
    •Método  llenarCafetera():  hace  que  la  cantidad  actual  sea  igual  a  la  capacidad máxima. ✓
    •Método  servirTaza(int):  se  pide  el  tamaño  de  una  taza  vacía,  el  método  recibe  el
     tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
     Si la cantidad  actual  de  café  “no  alcanza”  para  llenar  la  taza,  se  sirve  lo  que  quede.
     El método  le  informará  al  usuario  si  se  llenó  o  no  la  taza,
     y  de  no  haberse  llenado  en cuanto quedó la taza.✓
    •Método vaciarCafetera(): pone la cantidad de café actual en cero. ✓
    •Método  agregarCafe(int):  se  le  pide  al  usuario  una  cantidad  de  café,
     el  método  lo recibe y se añade a la cafetera la cantidad de café indicada.  ✓
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafetera jarraDeCafe = new Cafetera();

        System.out.println("Ingrese la capacidad de la jarra:");
        jarraDeCafe.setCapacidadMaxima(sc.nextInt());
        jarraDeCafe.llenarCafetera();

        System.out.println(jarraDeCafe);

        System.out.println("Ingrese el tamaño de la taza a servirse");
        jarraDeCafe.servirTaza(sc.nextInt());

        System.out.println("Jarra despues de taza");
        System.out.println(jarraDeCafe);

        System.out.println("Ingresar cuanto cafe se le agrega a la taza");
        jarraDeCafe.agregarCafe(sc.nextInt());

        System.out.println("Jarra despues de cargar");
        System.out.println(jarraDeCafe);

        System.out.println("Probando llenar de mas la cafetera para que no rebalse");
        jarraDeCafe.agregarCafe(sc.nextInt());
        System.out.println(jarraDeCafe);

        System.out.println("Probando vaciar la cafetera de mas, para que quede vacia");
        jarraDeCafe.servirTaza(sc.nextInt());
        System.out.println(jarraDeCafe);

        System.out.println("llenando y vaciando cafetera");
        jarraDeCafe.llenarCafetera();
        System.out.println(jarraDeCafe);
        jarraDeCafe.vaciarCafetera();
        System.out.println(jarraDeCafe);
    }
}
