fun main() {
    val array = intArrayOf(5, 3, 8, 1, 8)
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - 1 - i) {
            if (array[j] > array[j + 1]) {
                // Обмен значений
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }

    println("Отсортированный массив: ${array.contentToString()}")
}