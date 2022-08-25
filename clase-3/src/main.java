//import clasesNormales.Delfin;
//import clasesNormales.Perro;

import clasesAbstractas.Delfin;
import clasesAbstractas.Perro;
import clasesNormales.Animal;

public class main {
    public static void main(String[] args) {
//        final String medio = "agua";
//        final Delfin delfin = new Delfin(medio, "plateado", 2, "de agua dulce", "amaszonas");
//        final Perro perro1 = new Perro("tierra", "negro", 5, "Bulldog", "Boby");
//        final Perro perro2 = new Perro("tierra", "negro", 3, "Bulldog", "Fido");
//
//        delfin.moverse();
//        perro1.moverse();
//        perro2.moverse();
//
//        System.out.println(perro1.equals(perro1));
//        System.out.println(perro1.equals(perro2));
//        final Animal animal = new Animal();
        final Delfin delfin = new Delfin( "de agua dulce", "amaszonas");
        final Perro perro1 = new Perro("Bulldog", "Boby");
        final Perro perro2 = new Perro( "Pinscher", "Fido");

        delfin.moverse();
        perro1.moverse();
        perro2.moverse();

        System.out.println(perro1.equals(perro1));
        System.out.println(perro1.equals(perro2));


        Integer num1 = 2;
        int num2 = num1.intValue();

        Integer num3 = num2;
    }
}
