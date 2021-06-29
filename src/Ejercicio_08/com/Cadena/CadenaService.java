package Ejercicio_08.com.Cadena;

import java.text.MessageFormat;

public class CadenaService {

    public int mostrarVocales(Cadena cadena){
        String regex = "[áéíóúaeiouAEIOU]";
        String check = cadena.getFrase();
        int count = 0;
        for(int i = 0; i < check.length(); i++){
            String aux = check.substring(i,i+1);
            if(aux.matches(regex)){
                count++;
            }
        }
        return count;
    }

    public String invertirFrase(Cadena cadena){
        StringBuilder builder = new StringBuilder();
        builder.append(cadena.getFrase()).reverse();
        return builder.toString();
    }

    public void vecesRepetido(Cadena cadena, String letra){
        String frase = cadena.getFrase();
        int count = -1;
        int ubicada = 0;
        if(frase.charAt(0) == letra.charAt(0)) count++;
        do{
            frase = frase.substring(ubicada+1);
            count++;
            ubicada = frase.indexOf(letra);
        }while(ubicada != -1);
        System.out.println(MessageFormat.format("El caracter {0} se repite {1} veces", letra, count));
    }

    public void compararLongitud(Cadena cadena, String frase){
        int longitudCadena = cadena.getLongitud();
        int longitudFrase = frase.length();
        System.out.println("cadena " + longitudCadena + " frase " + longitudFrase);
        int diferencia = longitudCadena - longitudFrase;
        System.out.println(diferencia == 0? "Ambas frases tienen la misma longitud" :
                diferencia > 0 ? "La frase del objeto cadena es mas larga por " + diferencia + " caracteres" :
                        "La frase ingresada es mas larga por " + (diferencia * -1) + " caracteres");
    }

    public String unirFrases(Cadena cadena, String frase){
        return cadena.getFrase().concat(frase);
    }

    public String reemplazar(Cadena cadena, String letra){
        return cadena.getFrase().replace('a', letra.charAt(0));
    }

    public boolean contiene(Cadena cadena, String letra){
        return cadena.getFrase().contains(letra);
    }
}
