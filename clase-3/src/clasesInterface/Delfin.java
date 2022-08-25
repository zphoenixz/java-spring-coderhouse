package clasesInterface;

import java.util.Objects;

public class Delfin implements AccionesMoverse {

    private String tipo;
    private String ubicacion;

    public Delfin(String tipo, String ubicacion) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
    }

    @Override
    public void moverse(){
        System.out.println("Estoy nadando");
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delfin delfin = (Delfin) o;
        return Objects.equals(tipo, delfin.tipo) && Objects.equals(ubicacion, delfin.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, ubicacion);
    }
}
