fun main() {
    val array = intArrayOf(1, 2, 2, 3, 4, 4, 5)

    //массив для уникальных элементов (максимально такой же длины)
    val temp = IntArray(array.size)
    var uniqueCount = 0

    //добавляем в temp только если элемента там ещё нет
    for (num in array) {
        var exists = false
        var j = 0
        while (j < uniqueCount) {
            if (temp[j] == num) {
                exists = true
                break
            }
            j = j + 1
        }
        if (exists == false) {
            temp[uniqueCount] = num
            uniqueCount = uniqueCount + 1
        }
    }

    //массив без дубликатов
    val result = IntArray(uniqueCount)
    var i = 0
    while (i < uniqueCount) {
        result[i] = temp[i]
        i = i + 1
    }

    println("Массив без дубликатов: ${result.contentToString()}")
}