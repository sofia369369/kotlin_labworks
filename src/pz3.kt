//считаем четные числа
fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)

    var count = 0//счетчик
    for (num in numbers) {
        if (num % 2 == 0) {
            count++
        }
    }

    println("Количество четных чисел: $count")
}