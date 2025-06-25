package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
       Queue<String> nombres = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));
        Queue<String> esperado = new LinkedList<>(Arrays.asList("Pedro", "Luis", "Ana"));

        LogicaClasificacion logica = new LogicaClasificacion();
        Queue<String> invertido = logica.invertirColaNombres(nombres);

        assertEquals(esperado, invertido);
}
