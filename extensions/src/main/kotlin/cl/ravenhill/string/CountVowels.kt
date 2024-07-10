package cl.ravenhill.string

/**
 * Counts the number of vowels in the string.
 *
 * ## Usage:
 * This extension function calculates the number of vowels (a, e, i, o, u) in the original string. It is
 * case-insensitive.
 *
 * ### Example 1: Counting Vowels in a String
 * ```
 * val text = "Hello World"
 * val vowelCount = text.countVowels()
 * println(vowelCount) // Output: 3
 * ```
 *
 * ### Example 2: Counting Vowels in an Empty String
 * ```
 * val text = ""
 * val vowelCount = text.countVowels()
 * println(vowelCount) // Output: 0
 * ```
 *
 * @receiver The original string whose vowels will be counted.
 * @return The number of vowels in the string.
 */
fun String.countVowels(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in this) {
        if (char.lowercaseChar() in vowels) {
            count++
        }
    }
    return count
}

// Shorter version of the function using the count function
// fun String.countVowels() = count { it.lowercaseChar() in setOf('a', 'e', 'i', 'o', 'u') }
