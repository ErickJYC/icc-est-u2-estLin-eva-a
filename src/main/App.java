package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        LogicaClasificacion logica = new LogicaClasificacion();

// 🔁 Probar invertirColaNombres
        Queue<String> nombres = new LinkedList<>();
        nombres.offer("Ana");
        nombres.offer("Luis");
        nombres.offer("Pedro");

        Queue<String> colaInvertida = logica.invertirColaNombres(new LinkedList<>(nombres));
        System.out.println("Cola original: " + nombres);
        System.out.println("Cola invertida: " + colaInvertida);

// 🪞 Probar verificarPalindromoCola
        Queue<String> palabra1 = new LinkedList<>(Arrays.asList("r", "a", "d", "a", "r"));
        boolean esPalindromo1 = logica.verificarPalindromoCola(new LinkedList<>(palabra1));
        System.out.println( esPalindromo1);

        Queue<String> palabra2 = new LinkedList<>(Arrays.asList("c", "a", "s", "a"));
        boolean esPalindromo2 = logica.verificarPalindromoCola(new LinkedList<>(palabra2));
        System.out.println( esPalindromo2);

    }
}
