fun main() {
    val numbers = arrayOf(10, 20, 5, 30, 15)

    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("Максимальный элемент равен $max")
}