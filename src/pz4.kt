//переворачиваем массив
fun main() {
    val original = arrayOf(1, 2, 3, 4, 5)
    val reversed = Array(original.size) { 0 }
    for (i in original.indices) {
        reversed[original.size - 1 - i] = original[i]
    }

    println("Перевернутый массив: ${reversed.contentToString()}")
}