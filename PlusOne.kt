fun main() {
    val digits= arrayOf(1,2,3)
    val result = plusOne(digits.toIntArray())
    println(result.contentToString())

}

fun plusOne(digits: IntArray): IntArray {

    for (i in digits.indices.reversed()) {
        if (digits[i] != 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0

    }
    return intArrayOf(1, *digits)

}
