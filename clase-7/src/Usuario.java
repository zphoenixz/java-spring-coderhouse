public class Usuario {
    String nombre;
    Integer edad;
    String apellido;
    String sobrenombre;

    public Usuario(String nombre) {
        this.nombre = nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    public String getNombre() {
        return nombre;
    }
}
