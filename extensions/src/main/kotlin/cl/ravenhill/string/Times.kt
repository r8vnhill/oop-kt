package cl.ravenhill.string

/**
 * Repeats the string a specified number of times.
 *
 * ## Usage:
 * This operator function repeats the original string `n` times, effectively multiplying the string by the given
 * integer.
 *
 * ### Example 1: Repeating a String Three Times
 * ```
 * val original = "Hello"
 * val repeated = original * 3
 * println(repeated) // Output: HelloHelloHello
 * ```
 *
 * @receiver The original string to be repeated.
 * @param n The number of times to repeat the string.
 * @return A new string consisting of the original string repeated `n` times.
 */
operator fun String.times(n: Int) = repeat(n)

fun main() {
    println("Hello" * 3) // Output: HelloHelloHello
}
