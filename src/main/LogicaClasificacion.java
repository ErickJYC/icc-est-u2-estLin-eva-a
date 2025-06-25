package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {

        Stack<String> pila = new Stack<>();

        while(!cola.isEmpty()) {
            pila.push(cola.poll());
        }

        Queue<String> invertida = new LinkedList<>();
        while (!pila.isEmpty()) {
            invertida.add(pila.pop());
            
        }
        return invertida;

    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
       List<String> letras = new ArrayList<>(cola);
    int izquierda = 0;
    int derecha = letras.size() - 1;

    while (izquierda < derecha) {
        if (!letras.get(izquierda).equals(letras.get(derecha))) {
            return false;
        }
        izquierda++;
        derecha--;
    }

    return true;

}
