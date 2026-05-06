fun main() {
    val numbers = arrayOf(10, 5, 20, 3, 15)
    var min = numbers[0]
    for (num in numbers) {
        if (num < min) {
            min = num
        }
    }
    println("Минимальный элемент: $min")
}