package com.mouredev.weeklychallenge2022

/*
 * Reto #19
 * CONVERSOR TIEMPO
 * Fecha publicación enunciado: 09/05/22
 * Fecha publicación resolución: 16/05/22
 * Dificultad: FACIL
 *
 * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la comunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
fun main() {
    println(toMilis(1, 20, 1, 21))
}

private fun toMilis(days: Int, hours: Int, minutes: Int, seconds: Int): Long{
    var milis = days.toLong() * 86400000L
    
    milis += hours.toLong() * 3600000L
    milis += minutes.toLong() * 60000L
    milis += seconds.toLong() * 1000L
    
    return milis
}