package com.mouredev.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
 
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        var firstWord = "hola";
        var secondWord = "aloh";

        System.out.printf("%s y %s -> ", firstWord, secondWord);

        if (itsAnagram(firstWord, secondWord)) {
            System.out.println("son anagramas");
        } else {
            System.out.println("NO son anagramas");
        }
    }

    private static boolean itsAnagram(@NotNull String a, @NotNull String b) {
        var result = true;
        var index = b.length();

        if (a.length() != index) {
            result = false;
        }

        for (int i = 0; i < a.length(); i++) {
            index--;
            if (b.charAt(index) != a.charAt(i)) {
                result = false;
            }
        }

        return result;
    }
}
