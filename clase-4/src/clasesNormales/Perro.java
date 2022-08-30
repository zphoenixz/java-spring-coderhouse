package clasesNormales;

import java.util.Objects;

public class Perro extends Animal {

    private  String raza;
    private  String nombre;

    public Perro(boolean type) {
        this.nombre = null;
        this.raza = type ? "A" : "B";
    }

    public Perro() {
        this.raza = null;
        this.nombre = null;
    }

    public Perro(String raza, String nombre) {
        super(null, null, 0);
        this.raza = raza;
        this.nombre = nombre;
    }

    public Perro(String medio, String color, int edad, String raza, String nombre) {
        super(medio, color, edad);
        this.raza = raza;
        this.nombre = nombre;
    }

    public String ladrar(String idioma) {
        System.out.println(idioma);
        return idioma;
    }

    public String ladrar() {
        System.out.println("idioma");
        return "idioma";
    }

    public void ladrar(String a, String b) {
        System.out.println(a + b);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRaza(), getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perro)) return false;
        if (!super.equals(o)) return false;
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza) && Objects.equals(nombre, perro.nombre);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), raza, nombre);
//    }
}
