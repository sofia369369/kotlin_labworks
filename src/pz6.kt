fun main() {
    val numbers = arrayOf(10, 20, 30, 40, 50)

    //переменная для суммы
    var sum = 0

    //цикл для подсчёта суммы
    for (num in numbers) {
        sum += num
    }

    val average = sum.toDouble() / numbers.size
    println("Среднее арифметическое: $average")
}