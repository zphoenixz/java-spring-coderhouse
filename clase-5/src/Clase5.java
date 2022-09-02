import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Clase5 {
    public static void main(String[] args) {
//        //Arrays =====================================================
//        //Array de primitivos
//        byte[] byteArray;
//        byteArray = new byte[5];
//        byteArray[0] = -128; //Byte = 8 bits, -128 a 127
//
//        int[] intArray = {-129, 128}; // 32 bits, -2,147,483,648 a 2,147,483,647
//
//        //Array de objetos
        String[] stringArray = new String[12];
        stringArray[0] = "Enero";
        stringArray[1] = "Febrero";
        stringArray[2] = "Marzo";
        stringArray[3] = "Abril";
        stringArray[4] = "Mayo";
        stringArray[5] = "Junio";
        stringArray[6] = "Julio";
        stringArray[7] = "Agosto";
        stringArray[8] = "Setiembre";
        stringArray[9] = "Octubre";
        stringArray[10] = "Noviembre";
        stringArray[11] = "Diciembre";
//
//        System.out.println("El mes seleccionado es: " + stringArray[11]);
//        //Colecciones =====================================================
//        List<String> listaDestino = new ArrayList<>();
//        listaDestino.add("Celeste");
//        listaDestino.add("Blanco");
//
//        List<String> listaOrigen = new ArrayList<>();
//        listaOrigen.add("Celeste");
//        listaOrigen.add("Blanco");
//        System.out.println(listaDestino);
//        System.out.println("La lista destino contiene la lista origen?: " + listaDestino.containsAll(listaOrigen));
//
//        listaDestino = new ArrayList<>();
//        listaDestino.add("Celeste");
//        listaDestino.add("Blanco");
//
//        listaOrigen = new ArrayList<>();
//        listaOrigen.add("Azul");
//        listaOrigen.add("Verde");
//        listaDestino.addAll(listaOrigen);
//        System.out.println("addAll. La lista destino contiene la lista origen?: " + listaDestino);
//
////        listaDestino.removeAll(listaOrigen);
////        System.out.println("removeAll. La lista destino contiene la lista origen?: " + listaDestino);
//
//        listaDestino.retainAll(listaOrigen);
//        System.out.println("RetainAll. La lista destino contiene la lista origen?: " + listaDestino);

//        List<String> listaColores = new ArrayList<>();
//        listaColores.add("Celeste");
//        System.out.println("Size: " + listaColores.size());
//        System.out.println("Color: " + listaColores.get(0));
//        listaColores.set(0,"Verde");
//        System.out.println("Color: " + listaColores.get(0));


//        List<String> listaColoresBusqueda = new ArrayList<>();
//        listaColoresBusqueda.add("Celeste");
//        listaColoresBusqueda.add("Verde");
//        listaColoresBusqueda.add("Celeste");
//        String color = "Celeste";
//        System.out.println("El color " + color + " esta en la posición " + listaColoresBusqueda.indexOf(color));

        Set<String> hash_Set = new HashSet<>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        System.out.println(hash_Set);

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


        // Get the iterator
        Iterator<String> cars2 = cars.iterator();
//        System.out.println("1. cars" + cars);
//        String auto1 = cars2.next();
//        System.out.println("2. cars" + auto1);
//        String auto2 = cars2.next();
//        System.out.println("2. cars" + auto2);
//         cars2.remove();
//        System.out.println("3. cars" + cars2);
//        ArrayList<String> cars3 = List.of(cars2.);
        while (cars2.hasNext()) {
            System.out.println(cars2.next());
        }
        do {
            System.out.println(cars2.next());
        } while (cars2.hasNext());

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        cars2.forEachRemaining(car -> System.out.println(car));
        for (String car : cars) {
            System.out.println(car);
        }
        cars.forEach(car -> {
            System.out.println("Color: " + cars);
        });

        int[] intArray;
        // Asigna memoria para 5 enteros
        intArray = new int[5];
        // Inicializa el primer elemento
        intArray[0] = 100;
        // Inicializa el segundo elemento
        intArray[1] = 200;
        // continua inicializando el resto de los elementos
        intArray[2] = 300;
        intArray[3] = 400;
        intArray[4] = 500;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Elemento en el indice " + i + ": " + intArray[i]);
        }
        for (int intArra : intArray) {
            System.out.println(intArra);
        }

        List<String> listaColores = new ArrayList<>();
        listaColores.add("Celeste");
        listaColores.add("Blanco");
        listaColores.add("Verde");
        listaColores.add("Marron");

        for (Iterator<String> iter = listaColores.iterator(); iter.hasNext(); ) {
            String color = iter.next();
            System.out.println("Color: " + color);
        }
    }


}
