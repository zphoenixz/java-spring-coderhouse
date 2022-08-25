package clasesAbstractas;

public class Perro extends Animal {

    private String raza;
    private String nombre;

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    @Override
    public void moverse() {
        System.out.println(nombre + ": estoy corriendo!");
    }

    @Override
    void comer() {
        System.out.println("Estoy comiendo");
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
}
