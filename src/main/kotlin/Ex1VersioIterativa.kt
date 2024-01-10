import java.util.*
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

fun m1(n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun m2(x: Double, n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result += i
    }
    return result
}

fun m3(n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result += 1
    }
    return result
}

fun m4(n: Int): Int {
    var result = 0
    for (i in 1..n) {
        result += i
    }
    return result
}

