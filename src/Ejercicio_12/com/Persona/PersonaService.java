package Ejercicio_12.com.Persona;


import sun.misc.resources.Messages_fr;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonaService {
    public Persona crearPersona() {
        Persona devolver = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona.");
        devolver.setNombre(sc.nextLine());

        System.out.println("Ingrese la fecha de nacimiento con el siguiente formato 'dd/mm/aaaa'");
        devolver.setNacimiento(crearFecha(sc.nextLine()));
        return devolver;
    }

    public LocalDate crearFecha(String fecha) {
        int dia, mes, anio;
        LocalDate fechaFormato = null;
        boolean correcto = false;
        do {
            try {
                dia = Integer.parseInt(fecha.substring(0, 2));
                mes = Integer.parseInt(fecha.substring(3, 5));
                anio = Integer.parseInt(fecha.substring(6));
                fechaFormato = LocalDate.of(anio, mes, dia);
                correcto = true;
            } catch (Exception e) {
                System.out.println("Error. Fecha/Formato incorrecto, vuelvalo a colocar correctamente (dd/mm/aaaa)");
                fecha = new Scanner(System.in).nextLine();
            }
        } while (!correcto);

        return fechaFormato;
    }

    public int calcularEdad(Persona persona){
        return Period.between(persona.getNacimiento(), LocalDate.now()).getYears();
    }

    public boolean menorQue(Persona persona, int otraEdad){
        return calcularEdad(persona) < otraEdad;
    }

    public String mostrarPersona(Persona p){
        return MessageFormat.format("{0} tiene {1} Nacio el {2} de {3} de {4}", p.getNombre(), calcularEdad(p), p.getNacimiento().getDayOfMonth(), p.getNacimiento().getMonthValue(), p.getNacimiento().getYear());
    }
}
