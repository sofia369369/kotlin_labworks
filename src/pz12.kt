// Файл: Task12_Palindrome.kt
fun main() {
    val str = "мадам"
    var isPalindrome = true
    //сравниваем символы с начала и с конца
    for (i in 0 until str.length / 2) {
        if (str[i] != str[str.length - 1 - i]) {
            isPalindrome = false
            break
        }
    }
    println(isPalindrome)
}