import java.util.Scanner

/**
 * Función principal que solicita al usuario dos números y muestra el resultado de su multiplicación.
 */
fun main() {
        val sc = Scanner(System.`in`)
    println("Introduce el primer número: ")
    val a = sc.nextInt()
    println("Introduce el segundo número: ")
    val b = sc.nextInt()
    println("El resultado es: ")
    println(multiplicar(5, 5))
}

/**
 * @author Joel Montalvan y Daniel Reinosa
 * Función que realiza la multiplicación de dos números enteros.
 *
 * @param a Primer número a multiplicar.
 * @param b Segundo número a multiplicar.
 * @return El resultado de la multiplicación.
 */
fun multiplicar(a: Int, b: Int): Int {
    var result = 0
    for (i in 1..b) {
        result += a
    }
    return result
}
