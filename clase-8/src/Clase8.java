import Clases.Cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Clase8 {
    static int aa = 6;

    public static void main(String[] args) {
        // Foreach ============================================
        List<String> ejm1 = new ArrayList<>();
        ejm1.add("Juan");
        ejm1.add("Pedro");
        ejm1.add("Esteban");
        ejm1.add("Lucas");

        Stream<String> nombres1 = ejm1.stream();
//        nombres1.forEach(x -> System.out.println(x));
        nombres1.forEach(System.out::println);

        // Collect ============================================
        List<String> ejm2 = new ArrayList<>();
        ejm2.add("Juan");
        ejm2.add("Pedro");
        Stream<String> nombres2 = ejm2.stream();
        ArrayList<String> lista2 = nombres2.collect(Collectors.toCollection(ArrayList::new));
        List<String> lista3 = ejm2.stream().collect(Collectors.toList());
        Set<String> lista4 = ejm2.stream().collect(Collectors.toSet());
        //TODO Swithc from ejm1 to ejm2
        Map<Integer, String> lista5 = ejm2.stream().collect(Collectors.toMap(String::length, String::toUpperCase));

        // Reduce ============================================
        List<Integer> ejm3 = List.of(5, 5, 10, 20);

        Integer resultado = ejm3.stream()
                .reduce(0, (acumulador, numeroActual) -> acumulador + numeroActual);
        System.out.println(resultado);

        Integer resultado2 = ejm3.stream().reduce(0, Integer::sum);
        System.out.println(resultado2);

        // Map ============================================
        System.out.println("Map ============================================");
        List<Cliente> ejm4 = List.of(
                new Cliente("Pepe", 24),
                new Cliente("Carlos", 36),
                new Cliente("Esteban", 48));
        Stream<String> nuevoStream = ejm4.stream()
                .map(Cliente::getNombre);
        nuevoStream.forEach(System.out::println);

        List<Cliente> ejm5 = List.of(
                new Cliente("Pepe", 24),
                new Cliente("Carlos", 36),
                new Cliente("Esteban", 48)
        );
//        int total = ejm5.stream().mapToInt(Cliente::getEdad).sum();
//        System.out.println(total);
//        ejm5.stream().mapToDouble(Cliente::getEdad).average()
//                .ifPresent(System.out::println);
//        ejm5.stream().mapToInt(Cliente::getEdad).max()
//                .ifPresent(System.out::println);
//        ejm5.stream().mapToInt(Cliente::getEdad).min()
//                .ifPresent(System.out::println);

        // FlatMap ============================================
        System.out.println("FlatMap ============================================");
        List<Integer> list1 = List.of(5, 7, 11, 13);
        List<Integer> list2 = List.of(1, 3, 5);
        List<Integer> list3 = List.of(2, 4, 6, 8);
        List<List<Integer>> listaDeListas = List.of(list1, list2, list3);
        System.out.println("Antes de usar FlatMap : " + listaDeListas);
        List<Integer> listaFinal = listaDeListas.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Despues de usar FlatMap : " + listaFinal);

        System.out.println("Filter Predicado ============================================");
        // Filter Predicado ============================================
        Predicate<Integer> mayorADiez = value -> value > 10;
        List<Integer> ejm6 = listaDeListas.stream()
                .flatMap(Collection::stream)
                .filter(mayorADiez)
                .filter(value -> value < 13)
                .collect(Collectors.toList());
        System.out.println("Aplicando un filtro : " + ejm6);
        // Sorted ============================================
        List<Integer> ejm7 = listaDeListas.stream()
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
        //TODO SORTED
        System.out.println("Despues de usar FlatMap con sorted(): " + ejm7);
        // Filter Limit ============================================
        List<Integer> ejm8 = listaDeListas.stream()
                .flatMap(Collection::stream)
                .sorted()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Despues de usar FlatMap con limit(5): " + ejm8);
        // Peek ============================================
        Consumer<Integer> mostrar = System.out::println;

        List<Integer> ejm9 = listaDeListas.stream()
                .flatMap(Collection::stream)
                .sorted()
                .limit(5)
                .peek(mostrar)
                .collect(Collectors.toList());

        System.out.println("Despues de usar FlatMap con peek(): " + ejm9);

        // Optional ============================================
        System.out.println("Optional ============================================");
        String valor = "José";
        //Crear un Optional
        Optional<String> opt = Optional.of(valor);
        System.out.println("opt = " + opt);
        System.out.println("Esta presente el valor? " + opt.isPresent());
        if (opt.isPresent()) {
            System.out.println("Hola, el valor presente es: " + opt.get());
        }
        System.out.println("El valor es nulo? " + opt.isEmpty());
        //Solo se ejecta si el valor esta presente
        opt.ifPresent(valor1 -> System.out.println("Hola " + valor1));

        Cliente cliente = new Cliente("Juan", 23 );
//        Optional<Integer> edad = cliente.getEdad();
        Optional<Integer> edad = Optional.ofNullable(cliente.getEdad());
        System.out.println("Edad2 " + edad.isPresent());
        System.out.println("Edad3 " + edad.isEmpty());
        if(edad.isPresent()){
            System.out.println("Edad1 " + edad.get());
        }
    }
}
