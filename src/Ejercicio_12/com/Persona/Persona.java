package Ejercicio_12.com.Persona;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate nacimiento;

    public Persona(String nombre, LocalDate nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
