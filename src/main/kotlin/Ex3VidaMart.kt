import java.util.Scanner
fun main() {
        val sc = Scanner(System.`in`)
    println("Introduce el primer número: ")
    val a = sc.nextInt()
    println("Introduce el segundo número: ")
    val b = sc.nextInt()
    println("El resultado es: ")
    println(multiplicar(5, 5))
}

fun multiplicar(a: Int, b: Int): Int {
    var result = 0
    for (i in 1..b) {
        result += a
    }
    return result
}
