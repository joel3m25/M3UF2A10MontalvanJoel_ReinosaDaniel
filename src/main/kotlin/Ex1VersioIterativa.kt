import java.util.*

/**
 * Función principal que solicita al usuario dos números y muestra los resultados
 * de diferentes funciones aplicadas al primer número.
 */
fun main() {
    val sc = Scanner(System.`in`)
    println("Introduce el primer número: ")
    val a = sc.nextInt()
    println("Introduce el segundo número: ")
    val b = sc.nextInt()
    println("El resultado es: ")
    println(m1(a))
    println(m2(a.toDouble(), b))
    println(m3(a))
    println(m4(a))
}
/**
 * @author Joel Montalvan y Daniel Reinosa
 * Función que calcula el producto de los números del 1 al n.
 *
 * @param n Número hasta el cual se realiza el producto.
 * @return El producto de los números del 1 al n.
 */
fun m1(n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result *= i
    }
    return result
}
/**
 * @author Joel Montalvan y Daniel Reinosa
 * Función que suma los números del 1 al n y devuelve el resultado como un entero.
 *
 * @param x Número de punto flotante que se ignora en esta función.
 * @param n Número hasta el cual se realiza la suma.
 * @return La suma de los números del 1 al n.
 */
fun m2(x: Double, n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result += i
    }
    return result
}
/**
 * @author Joel Montalvan y Daniel Reinosa
 * Función que cuenta la cantidad de veces que se ejecuta el bucle del 1 al n.
 *
 * @param n Número hasta el cual se cuenta.
 * @return La cantidad de veces que se ejecuta el bucle del 1 al n.
 */
fun m3(n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result += 1
    }
    return result
}

/**
 * @author Joel Montalvan y Daniel Reinosa
 * Función que suma los números del 1 al n y devuelve el resultado.
 *
 * @param n Número hasta el cual se realiza la suma.
 * @return La suma de los números del 1 al n.
 */
fun m4(n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result += i
    }
    return result
}

