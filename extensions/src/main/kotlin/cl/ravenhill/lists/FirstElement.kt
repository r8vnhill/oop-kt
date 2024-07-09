package cl.ravenhill.lists

/**
 * Extension property to get or set the first element of a mutable list of strings.
 *
 * ## Usage:
 * This extension property allows accessing and modifying the first element of a `MutableList` of strings.
 *
 * ### Example 1: Getting the First Element of a List
 * ```
 * val comics = mutableListOf("Kingdom Come", "The Walking Dead", "Injustice")
 * val first = comics.firstElement
 * println(first) // Output: Kingdom Come
 * ```
 *
 * ### Example 2: Setting the First Element of a List
 * ```
 * val books = mutableListOf("The Two Towers", "The Silver Chair", "Eragon")
 * books.firstElement = "The Canterville Ghost"
 * println(books) // Output: [The Canterville Ghost, The Silver Chair, Eragon]
 * ```
 *
 * @receiver The mutable list of strings.
 * @property firstElement The first element of the list.
 * @return The first element of the list.
 */
var MutableList<String>.firstElement: String
    get() = this[0]
    set(value) {
        this[0] = value
    }

fun main() {
    val comics = mutableListOf("Kingdom Come", "The Walking Dead", "Injustice")
    val first = comics.firstElement
    println(first) // Output: Kingdom Come

    val books = mutableListOf("The Two Towers", "The Silver Chair", "Eragon")
    books.firstElement = "The Canterville Ghost"
    println(books) // Output: [The Canterville Ghost, The Silver Chair, Eragon]
}
