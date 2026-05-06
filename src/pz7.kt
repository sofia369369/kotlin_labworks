fun main() {
    val numbers = arrayOf(5, 10, 15, 20)
    val target = 15

    //переменная для хранения индекса
    var index = -1

    for (i in numbers.indices) {
        if (numbers[i] == target) {
            index = i
            break
        }
    }

    println("Индекс элемента: $index")
}