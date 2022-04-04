package com.mouredev.weeklychallenge2022

/*
 * Reto #13
 * FACTORIAL RECURSIVO
 * Fecha publicación enunciado: 28/03/22
 * Fecha publicación resolución: 04/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 * fun main() {
 *     for (i in 0..5) { println(factorial(i)) }
 * }
 * 
 * private fun factorial(input: Int): Int {
 *     return if (input > 1) {
 *         input * factorial(input - 1)  
 *     } else {
 *         input
 *     }
 * }
 */
 
fun main() {
    for (i in 1..5) { println(factorial(i) ?:run { "No tiene factorial" }) }
    
    println(factorial(-1)?:run { "No tiene factorial" })
}

private fun factorial(input: Int): Int? {
    return if (input <= 0) null else if (input > 1) input * factorial(input - 1)!! else input
}