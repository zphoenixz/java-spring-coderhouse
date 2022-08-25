package clasesNormales;

public class Perro extends Animal {

    private String raza;
    private String nombre;

    public Perro(String medio, String color, int edad, String raza, String nombre) {
        super(medio, color, edad);
        this.raza = raza;
        this.nombre = nombre;
    }

    @Override
    public void moverse() {
        System.out.println(nombre + ": estoy corriendo!");
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
