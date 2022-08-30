package clasesNormales;

import java.util.Objects;

public class Animal {

    private String medio;
    private String color;
    private int edad;

    public Animal() {
    }

    public Animal(String medio, String color, int edad) {
        super();
        this.medio = medio;
        this.color = color;
        this.edad = edad;
    }

    public void moverse(){
        System.out.println("Estoy corriendo");
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad && Objects.equals(medio, animal.medio) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medio, color, edad);
    }
}
