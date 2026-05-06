fun main() {
    val N = 17
    var isPrime = N > 1

    var i = 2
    while (i * i <= N) {
        if (N % i == 0) {
            isPrime = false
            break
        }
        i++
    }
    println(isPrime)
}