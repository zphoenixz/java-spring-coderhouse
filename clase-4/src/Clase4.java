//import clasesNormales.Delfin;
//import clasesNormales.Perro;


import clasesNormales.Delfin;
import clasesNormales.Perro;

public class Clase4 {
    public static void main(String[] args) {
        final Integer medio2 = 1;

//
        final Delfin delfin = new Delfin("agua", "plateado", 2, "de agua dulce", "amaszonas");
//        final Perro perro1 = new Perro("tierra", "negro", 5, "Bulldog", "Boby");
//        final Perro perro2 = new Perro("tierra", "negro", 5, "Bulldog", "Boby");
////        final Perro perro3 = new Perro();
////        perro3.setNombre("Bob");

//        System.out.println(perro1.hashCode());
//        System.out.println(perro2.hashCode());
//        System.out.println(perro1.equals(perro1));
//        System.out.println(perro1.equals(perro2));
//        perro1.ladrar("a","b");
//
//
        String mensaje = "Coder";
        mensaje = mensaje.concat(" house");
        System.out.println(mensaje);

        StringBuilder mensaje2 = new StringBuilder("Coder");
        mensaje2.append("House");
        System.out.println(mensaje2.toString());
    }
}
