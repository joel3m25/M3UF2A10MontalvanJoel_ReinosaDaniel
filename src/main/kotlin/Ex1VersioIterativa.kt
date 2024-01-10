
fun main() {
    println(m1(5))
    println(m2(5.0, 5))
    println(m3(5))
    println(m4(5))
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

