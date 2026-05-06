fun main() {
    val numbers = arrayOf(10, 20, 5, 30, 15)

    numbers.sort()
    
    val secondMax = numbers[numbers.size - 2]

    println("Второй по величине элемент: $secondMax")
}