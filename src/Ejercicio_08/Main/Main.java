package Ejercicio_08.Main;

import Ejercicio_08.com.Cadena.Cadena;
import Ejercicio_08.com.Cadena.CadenaColores;
import Ejercicio_08.com.Cadena.CadenaService;
import java.util.Scanner;

/*
* Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud.
*
* En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco  y  a  través  de  los  métodos  set,  se  guardará  la  frase  y  la  longitud  de  manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
*
*
•Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
*
•Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
*
•Método  vecesRepetido(String  letra),  deberá  recibir  por  parámetro  un  carácter
ingresado  por  el  usuario  y  contabilizar  cuántas  veces  se  repite  el  carácter  en  la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
*
•Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
*
•Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con  una nueva frase ingresada por el usuario y mostrar la frase resultante.
*
•Método  reemplazar(String  letra),  deberá  reemplazar  todas  las  letras  “a”  que  se
encuentren  en  la  frase,  por  algún  otro  carácter  seleccionado  por  el  usuario  y
mostrar la frase resultante.
*
•Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
* */
public class Main {
    public static void main(String[] args) {
        CadenaColores colorin = new CadenaColores("Colorinche", "verde");

        System.out.println(colorin);

        Scanner sc = new Scanner(System.in);
        Cadena cadena = new Cadena();
        CadenaService cadenaService = new CadenaService();

        System.out.println("Ingrese una frase para usar");
        cadena.setFrase(sc.nextLine());
        cadena.setLongitud();

        System.out.println("La frase ingresada contiene " + cadenaService.mostrarVocales(cadena) + " vocales");

        System.out.println("La frase invertida es: " + cadenaService.invertirFrase(cadena));

        System.out.println("Ingrese una letra para chequear en la frase");

        String letra = sc.nextLine().substring(0,1);

        cadenaService.vecesRepetido(cadena, letra);

        System.out.println("La frase reemplazando la vocal 'a' con la letra definida es: " + cadenaService.reemplazar(cadena, letra));

        System.out.println(cadenaService.contiene(cadena, letra) ? "La frase contiene la letra ingresada" : "La letra no contiene la letra ingresada");

        System.out.println("Ingrese otra frase");
        String frase = sc.nextLine();
        cadenaService.compararLongitud(cadena, frase);
        System.out.println("Las dos frases unidas son:\n" + cadenaService.unirFrases(cadena, frase));

    }
}
