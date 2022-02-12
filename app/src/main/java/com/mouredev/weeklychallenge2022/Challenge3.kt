package com.mouredev.weeklychallenge2022

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    val primeNumbers = Prime(100)
    println(primeNumbers)
}

/**
 * Un número primo es un número entero con exactamente dos divisores integrales, 1 y el número mismo. 
 * El número 1 no es un primo, ya que solo tiene un divisor.
 * 
 * Para saber si un número es primo hay que divirlo por los números primos menores que él hasta llegar a un cociente igual o menor que el divisor.
 *  - Si ninguna de estas divisiones es exacta, el número es primo.
 *  - Si alguna de las divisiones es exacta el número es compuesto y podemos interrumpir el proceso.
 * 
 * NOTA: La función mostrará siempre por lo menos el número 2 (primer número primo)
 */

fun Prime(maxNumber:Int): List<Int> {
    val minNumber: Int = 2
    var primeNumbers = mutableListOf(minNumber)

    for (i in (minNumber+1)..maxNumber) {
        var isPrime: Boolean = true
        for (number in primeNumbers) {
        	if (i % number == 0) { isPrime = false; break } 
        }

        if (isPrime) primeNumbers.add(i)
    }
    return primeNumbers 
}

/*
 * SOLUCION MOUREDEV
 *   fun main() {
 *
 *       (1..100).forEach { number ->
 *           if (isPrime(number)) {
 *               println(number)
 *           }
 *       }
 *   }
 *
 *   private fun isPrime(number: Int): Boolean {
 *
 *       if (number < 2) {
 *           return false
 *       }
 *
 *       for (i in 2 until number) {
 *           if (number % i == 0) {
 *               return false
 *           }
 *       }
 *
 *       return true
 *   }
 */



