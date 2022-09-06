import excepciones.FileTooBigException;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Clase6 {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal gato2 = new Gato();
        Animal perro = new Perro();
        Animal perro2 = new Perro();

        List<Animal> miLista = Arrays.asList(gato, gato2, perro, perro2);

        miLista.forEach(animal -> {
            String sonidoDelAnimal = obtenerSonido(animal);
            System.out.println(sonidoDelAnimal);
        });
//        String valor = "Joaquin";
//        var valorValidado = validarSiEsNulo(valor);
//        System.out.println(valorValidado ? "Es nulo" : "Tiene valor");
//        System.out.println(obtenerSonido(gato2));
//        System.out.println(obtenerSonido(perro2));
        String nombreArchivo = "Archivo inexistente";
        try {
            leerArchivo(nombreArchivo);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (FileTooBigException e) {
            e.printStackTrace();
        }
        int x = 1200;
        int y = 0;

        int edad = 5;

        try{
            verficarEdad(edad);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
//        try{
//            dividir(x, y);
//        }catch(ArithmeticException e){
//            System.out.println("Excepcion al dvidir "+e);
//        } finally{
//            System.out.println("Se terminó el programa");
//        }
        System.out.println("Fin del MAIN");
    }

    private static void verficarEdad(int edad) throws Exception{
        if(edad < 18){
            throw new Exception("Error la edad es menor a 18");
        }
        System.out.println("Bienvenid@ al club");
    }

    private static void dividir(int x, int y) {
        System.out.println( x / y );
    }

    private static void leerArchivo(String nombreArchivo) throws NullPointerException, FileNotFoundException, FileTooBigException {
//        FileInputStream archivoParaLeer = generarArchivo(nombreArchivo);
//        if (archivoParaLeer == null) {
//            System.out.println("Archivo no encontrado");
//        } else
            if(nombreArchivo!= "Hola que tal"){
            //Se lee el archivo
            throw new FileTooBigException("Error el archivo es muy pesado");
        }
    }

    //    private static FileInputStream generarArchivo(String nombreArchivo) {
//        File archivo = new File(nombreArchivo);
//        FileInputStream archivoCreado;
//        try {
//            archivoCreado = new FileInputStream(archivo);
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            System.out.println("Se envio un archivo nulo: " + e);
//            return null;
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("No se encuetra ese arcchivo: " + e);
//            return null;
//        }
//        return archivoCreado;
//    }
    private static FileInputStream generarArchivo(String nombreArchivo) throws NullPointerException, FileNotFoundException {
        File archivo = new File(nombreArchivo);
        FileInputStream archivoCreado;
        archivoCreado = new FileInputStream(archivo);

        return archivoCreado;
    }

    public static <T> Boolean validarSiEsNulo(T value) {
        return Objects.isNull(value);
    }

    public static <T extends Animal> String obtenerSonido(T value) {
        return value.hacerSonido();
    }

    public static <T> boolean obtenerSonido(T value) {
        if (value.getClass() == Perro.class) {
            return true;
        }
        return false;
    }

}
