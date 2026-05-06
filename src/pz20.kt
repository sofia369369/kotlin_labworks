
fun main() {
    val number = 12
    val divisors = mutableListOf<Int>()
    for (i in 1..number) {
        if (number % i == 0) {
            divisors.add(i)
        }
    }
    println("Делители: $divisors")
}