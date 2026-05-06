
fun main() {
    val N = 5

    var factorial = 1

    //цикл для вычисления факториала
    for (i in 1..N) {
        factorial *= i
    }

    println("Факториал: $factorial")
}