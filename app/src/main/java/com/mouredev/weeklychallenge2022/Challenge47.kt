package com.mouredev.weeklychallenge2022

/*
 * Reto #47
 * VOCAL MÁS COMÚN
 * Fecha publicación enunciado: 21/11/22
 * Fecha publicación resolución: 28/11/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un función que reciba un texto y retorne la vocal que más veces se repita.
 * Si no hay vocales podrá devolver vacío.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */
 fun main() {
    countVocals("Hola mundo KOTLIN")
}

fun countVocals(input: String = "") {
    if (input.isEmpty()) return println("No hay texto que comprobar")
    
    val letters = listOf("a", "e", "i", "o", "u")
    val counters = mutableListOf(0, 0, 0, 0, 0)
    
    var valueMax = 0

    input.forEach { inputChar ->
        for (letter in letters.indices) {            
            if (letters[letter] == inputChar.toString().lowercase()) counters[letter] += 1      
            
            if (counters[letter] > valueMax) valueMax = counters[letter]
        }
    }
    
    if (valueMax <= 0) return println ("Que vocales, ni vocales... Aqui no hay de eso")        
    
    if (valueMax > 0) {
        print("Las letras ")
        
        for (letter in counters.indices) 
            if (counters[letter] == valueMax) print("'${letters[letter]}', ")               
        
        println("aparecen $valueMax veces")         
    } 
    
    for (letter in letters.indices) println("${letters[letter]}: ${counters[letter]}")
}