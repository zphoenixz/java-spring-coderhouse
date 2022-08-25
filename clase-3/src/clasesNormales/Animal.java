package clasesNormales;

public class Animal {

    private String medio;
    private String color;
    private int edad;

    public Animal(String medio, String color, int edad) {
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
}
