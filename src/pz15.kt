fun main() {
    val number = 12345
    var n = number
    var sum = 0
    while (n > 0) {
        sum += n % 10    // добавляем последнюю цифру
        n /= 10          // убираем последнюю цифру
    }
    println("Сумма цифр: $sum")
}