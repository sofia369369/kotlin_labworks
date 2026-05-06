fun main() {
    val N = 20

    //true — число простое (пока все простые)
    val isPrime = BooleanArray(N + 1) { it >= 2 }

    // Алгоритм: зачёркиваем кратные
    var i = 2
    while (i * i <= N) {
        if (isPrime[i]) {
            var j = i * i
            while (j <= N) {
                isPrime[j] = false
                j += i
            }
        }
        i++
    }

    //  простые числа в список
    val primes = mutableListOf<Int>()
    for (num in 2..N) {
        if (isPrime[num]) primes.add(num)
    }
    println("Простые числа: $primes")
}