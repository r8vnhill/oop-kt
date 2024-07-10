package cl.ravenhill.lists

/**
 * A class representing a list of integers with utility methods.
 *
 * ## Usage:
 * This class provides a way to create a list of integers and includes methods for summing the elements of the list. It
 * also includes a companion object with utility methods for creating instances of `IntList`.
 *
 * ### Example 1: Creating an IntList and Summing the Elements
 * ```
 * val intList = IntList(1, 2, 3, 4, 5)
 * val sum = intList.sum()
 * println(sum) // Output: 15
 * ```
 *
 * ### Example 2: Using the Empty IntList
 * ```
 * val emptyList = IntList.empty
 * println(emptyList.sum()) // Output: 0
 * ```
 *
 * ### Example 3: Creating an IntList from an Array
 * ```
 * val array = intArrayOf(6, 7, 8, 9, 10)
 * val intList = IntList.fromArray(array)
 * println(intList.sum()) // Output: 40
 * ```
 *
 * @constructor Creates an `IntList` with the specified integers.
 * @param numbers The integers to be included in the list.
 */
class IntList(vararg numbers: Int) {
    private val list = numbers.toList()

    /**
     * Sums the elements of the list.
     *
     * ## Usage:
     * This method calculates the sum of the elements in the list.
     *
     * ### Example 1: Summing the Elements of the List
     * ```
     * val intList = IntList(1, 2, 3, 4, 5)
     * val sum = intList.sum()
     * println(sum) // Output: 15
     * ```
     *
     * @return The sum of the elements in the list.
     */
    fun sum(): Int {
        var sum = 0
        for (number in list) {
            sum += number
        }
        return sum
    }

    companion object {
        /**
         * An empty `IntList`.
         *
         * ## Usage:
         * This property provides an empty instance of `IntList`.
         *
         * ### Example 1: Using the Empty IntList
         * ```
         * val emptyList = IntList.empty
         * println(emptyList.sum()) // Output: 0
         * ```
         */
        val empty = IntList()

        /**
         * Creates an `IntList` from an array of integers.
         *
         * ## Usage:
         * This method creates an instance of `IntList` from the specified array of integers.
         *
         * ### Example 1: Creating an IntList from an Array
         * ```
         * val array = intArrayOf(6, 7, 8, 9, 10)
         * val intList = IntList.fromArray(array)
         * println(intList.sum()) // Output: 40
         * ```
         *
         * @param array The array of integers to be included in the list.
         * @return An instance of `IntList` containing the specified integers.
         */
        fun fromArray(array: IntArray) = IntList(*array)
    }
}

fun main() {
    val numbers = IntList(1, 2, 3, 4, 5)
    println(numbers.sum()) // Output: 15

    val emptyList = IntList.empty
    println(emptyList.sum()) // Output: 0

    val array = intArrayOf(10, 20, 30, 40, 50)
    val fromList = IntList.fromArray(array)
    println(fromList.sum()) // Output: 150
}
