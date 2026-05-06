fun main() {
    val a = 12
    val b = 18

    var x = a
    var y = b

    // Алгоритм Евклида
    while (y != 0) {
        val remainder = x % y
        x = y
        y = remainder
    }

    println("НОД: $x")
}