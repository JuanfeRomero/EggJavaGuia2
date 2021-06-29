package Ejercicio_10.Main;

import java.util.Arrays;
import java.util.Random;

/*
*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa  deberá  inicializar  el  arreglo  A  con  números  aleatorios  y  mostrarlo  por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10  números  ordenados  al  arreglo  B  de  20  elementos,  y  rellenar  los  10  últimos
elementos  con  el  valor  0.5.  Mostrar  los  dos  arreglos  resultantes:  el  ordenado  de  50
elementos y el combinado de 20.
* */
public class Main {
    public static void main(String[] args) {
        double[] arr50;
        double[] arr20 = new double[20];

        arr50 = new Random().doubles(50, 0, 100).toArray();

        System.out.println("Array de 50: "+Arrays.toString(arr50));

        Arrays.sort(arr50);

        System.arraycopy(arr50,0, arr20, 0, 10);
        Arrays.fill(arr20, 10, arr20.length, 0.5);
        System.out.println(Arrays.toString(arr50));
        System.out.println(Arrays.toString(arr20));


    }
}
