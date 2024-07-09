package cl.ravenhill.string

/**
 * Replaces all spaces in the string with the specified replacement string.
 *
 * ### Example 1: Replacing Spaces with Hyphens
 * ```
 * val original = "Hello World"
 * val replaced = original.replaceSpaces("-")
 * println(replaced) // Output: Hello-World
 * ```
 *
 * ### Example 2: Replacing Spaces with Underscores
 * ```
 * val original = "Kotlin is fun"
 * val replaced = original.replaceSpaces("_")
 * println(replaced) // Output: Kotlin_is_fun
 * ```
 *
 * @receiver The original string in which spaces will be replaced.
 * @param replacement The string to replace spaces with.
 * @return A new string with all spaces replaced by the specified string.
 */
fun String.replaceSpaces(replacement: String) = this.replace(" ", replacement)

fun main() {
    val original = "Hello World"
    val replaced = original.replaceSpaces("-")
    println(replaced) // Output: Hello-World
}
