fun main() {
    // Читаем строку и превращаем в число
    print("Введите число N: ")
    val input = readLine()
    val N = input!!.toInt()

    val primes = mutableListOf<Int>()

    var num = 2
    while (num <= N) {

        var isSimple = true
        var delitel = 2
        while (delitel < num) {
            if (num % delitel == 0) {
                isSimple = false   // нашли делитель — число не простое
            }
            delitel = delitel + 1
        }

            //составляем в список
        if (isSimple == true) {
            primes.add(num)
        }

        num = num + 1
    }

    println("Простые числа: $primes")
}