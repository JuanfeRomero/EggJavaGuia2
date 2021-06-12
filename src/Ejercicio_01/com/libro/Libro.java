package Ejercicio_01.com.libro;

import java.util.Scanner;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Libro cargarLibro(){
        Libro libro = new Libro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de ISBN del nuevo libro");
        libro.setISBN(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el titulo del libro");
        libro.setTitulo(sc.nextLine());
        System.out.println("Ingrese el autor de: " + libro.getTitulo());
        libro.setAutor(sc.nextLine());
        System.out.println("Ingrese la cantidad de paginas que tiene el libro");
        libro.setPaginas(sc.nextInt());

        return libro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
