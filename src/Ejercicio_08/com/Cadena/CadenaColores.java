package Ejercicio_08.com.Cadena;

public class CadenaColores extends Cadena{
    private String colores;

    public CadenaColores(String colores) {
        this.colores = colores;
    }

    public CadenaColores(String frase, String colores) {
        super(frase);
        this.colores = colores;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    @Override
    public String toString() {
        return "CadenaColores{" +
                "frase='" + getFrase() + '\'' +
                "colores='" + colores + '\'' +
                '}';
    }
}
