fun main() {
    val numbers = arrayOf(1, -2, 3, -4, 5)
    var count = 0
    for (num in numbers) {
        if (num < 0) {
            count++
        }
    }
    println("Количество отрицательных чисел: $count")
}