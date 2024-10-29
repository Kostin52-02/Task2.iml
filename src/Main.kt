fun main() {
    println("Vvedite stroky:")
    val input = readlnOrNull() ?: return
    val charCount = mutableMapOf<Char, Int>()

    for (char in input) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    val sortedCharCount = charCount.toSortedMap()
    for ((char, count) in sortedCharCount) {
        println("$char - $count")
    }
}
