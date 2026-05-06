fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    // Переменная для накопления суммы
    var sum = 0
    // Один цикл для подсчёта суммы
    for (num in numbers) {
        sum += num
    }

    println("Сумма элементов массива: $sum")
}