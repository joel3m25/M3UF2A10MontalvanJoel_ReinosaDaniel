
fun main() {
    println(multiplicar(5, 5))
}

fun multiplicar(a: Int, b: Int): Int {
    var result = 0
    for (i in 1..b) {
        result += a
    }
    return result
}
