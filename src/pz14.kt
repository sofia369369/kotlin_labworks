// Файл: Task14_CountVowels.kt
fun main() {
    val str = "Привет, мир!"
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ"
    var count = 0
    for (char in str) {
        if (vowels.contains(char)) {
            count++
        }
    }
    println("Количество гласных: $count")
}