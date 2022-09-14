import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Clase7 {
    static int aa = 6;
    public static void main(String[] args) {
        // 1 ============================================
        // lambda expression to define the calculate method
        Square ejm1 = (int w) -> w * w;
        // parameter passed and return type must be
        // same as defined in the prototyp
        int ans = ejm1.area(5);
        System.out.println(ans);

        //Instanciar
//        Persona a = new Persona();
//        a.mostrarNombre();
        //Static
//        Persona.mostrarNombre()
//        Math math = new Math();
//        math.sqrt(2);
//        Math.sqrt(2);
        System.out.println(Estaticas.aa);
        Estaticas estatica = new Estaticas();
        System.out.println(estatica.bb);

        // 2 ============================================
        Supplier<String> string = () -> "Hola coders";
        System.out.println(string.get());

        Supplier<String> horaFecha = () -> LocalDateTime.now().toString();
        System.out.println(horaFecha.get());
        // 3 ============================================
        Consumer<Date> consumidor = fecha1 -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha1));
        };
        consumidor.accept(new Date());
        Consumer<Date> consumidor2 = fecha2 -> {
            SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");
            System.out.println(f.format(fecha2));
        };

        System.out.println("====");
        consumidor.andThen(consumidor2).accept(new Date());
        System.out.println("====");

        BiConsumer<String, Integer> biConsumidor1 = (a, b) -> {
            System.out.println("El nombre es: "+a);
            System.out.println("La edad es: "+b.toString());
        };
        biConsumidor1.accept("Robert", 20);
        BiConsumer<String, Integer> biConsumidor2 = (a, b) -> {
            System.out.println("El nombre es: "+a);
            System.out.println("La edad es: "+b.toString());
        };
        biConsumidor1.accept("Robert", 20);
        biConsumidor1.andThen(biConsumidor2).accept("Juan", 30);

        Usuario usuario = new Usuario("Jorge");
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "José");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        // 4 ============================================
        Function<String, String> f1 = (param1, param2) -> "Hola que tal! " + param1 + param2;
        System.out.println(f1.concatenar("Juan", "Pedro"));
    }
}
