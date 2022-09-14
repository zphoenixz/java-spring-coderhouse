package Clases;

import java.util.Optional;

public class Cliente {

    String nombre;
    Integer edad;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.edad = null;
    }

    public Cliente(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }
//    public Optional<Integer> getEdad() {
//        return Optional.ofNullable(edad);
//    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
