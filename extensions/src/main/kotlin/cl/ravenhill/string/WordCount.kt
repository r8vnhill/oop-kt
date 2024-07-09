package cl.ravenhill.string

/**
 * Extension property that counts the number of words in a string.
 *
 * ## Usage:
 * This extension property calculates the number of words in the original string. Words are defined as sequences of
 * characters separated by whitespace.
 *
 * ### Example 1: Counting Words in a Sentence
 * ```
 * val sentence = "Kotlin is a fun programming language"
 * val count = sentence.wordCount
 * println(count) // Output: 6
 * ```
 *
 * ### Example 2: Counting Words in an Empty String
 * ```
 * val empty = ""
 * val count = empty.wordCount
 * println(count) // Output: 0
 * ```
 *
 * @receiver The original string whose words will be counted.
 * @return The number of words in the string.
 */
val String.wordCount: Int
    get() =
        if (isEmpty() || isBlank()) 0
        else this.split("\\s+".toRegex()).size
