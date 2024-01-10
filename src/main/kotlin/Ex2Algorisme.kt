import java.util.Scanner
/**
 * Funció principal que demostra l'us del algoritme de Euclides.
 */

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introdueix un nombre:")
    val num1 = scanner.nextInt()
    println("Introdueix altre nombre:")
    val num2 = scanner.nextInt()

    val result = algorismeEuclides(num1, num2)

    println("El màxim comú divisor de $num1 i $num2 és: $result")
}

/**
 * @author Joel Montalvan i Daniel Reinosa
 * Funció que implementa l' algoritme de Euclides de manera recursiva per trobar
 * el màxim comú divisor (MCD) de dos nombres.
 *
 * @param num1 El primer número.
 * @param num2 El segundo número.
 * @return El máximo común divisor de a y b.
 */
fun algorismeEuclides(num1: Int, num2: Int): Int {
    val result: Int
    if (num2 == 0) result = num1
    else result = algorismeEuclides(num2, num1 % num2)

    return result
}








