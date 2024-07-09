package cl.ravenhill.geometry

/**
 * Represents a point in a 2D space with x and y coordinates.
 *
 * ## Usage:
 * This data class represents a point in a 2D space with x and y coordinates. It provides an infix function to shift the point horizontally.
 *
 * ### Example 1: Creating a Point
 * ```
 * val point = Point(3.0, 4.0)
 * println(point) // Output: Point(x=3.0, y=4.0)
 * ```
 *
 * ### Example 2: Shifting a Point Horizontally
 * ```
 * val point = Point(3.0, 4.0)
 * val shiftedPoint = point shiftHorizontal 2.0
 * println(shiftedPoint) // Output: Point(x=5.0, y=4.0)
 * ```
 *
 * @property x The x-coordinate of the point.
 * @property y The y-coordinate of the point.
 */
data class Point(val x: Double, val y: Double) {
    /**
     * Shifts the point horizontally by the specified distance.
     *
     * ## Usage:
     * This infix function creates a new `Point` instance with the x-coordinate shifted by the specified distance.
     *
     * ### Example 1: Shifting a Point Horizontally
     * ```
     * val point = Point(3.0, 4.0)
     * val shiftedPoint = point shiftHorizontal 2.0
     * println(shiftedPoint) // Output: Point(x=5.0, y=4.0)
     * ```
     *
     * @param dx The distance to shift the point horizontally.
     * @return A new `Point` instance with the x-coordinate shifted by the specified distance.
     */
    infix fun shiftHorizontal(dx: Double) = copy(x = x + dx)
}

/**
 * Shifts the point vertically by the specified distance.
 *
 * ## Usage:
 * This infix function creates a new `Point` instance with the y-coordinate shifted by the specified distance.
 *
 * ### Example 1: Shifting a Point Vertically
 * ```
 * val point = Point(3.0, 4.0)
 * val shiftedPoint = point shiftVertical 2.0
 * println(shiftedPoint) // Output: Point(x=3.0, y=6.0)
 * ```
 *
 * @param dy The distance to shift the point vertically.
 * @return A new `Point` instance with the y-coordinate shifted by the specified distance.
 */
infix fun Point.shiftVertical(dy: Double) = copy(y = y + dy)

fun main() {
    val point = Point(3.0, 4.0)
    println(point) // Output: Point(x=3.0, y=4.0)

    val shiftedPoint = point shiftHorizontal 2.0
    println(shiftedPoint) // Output: Point(x=5.0, y=4.0)

    val verticalShiftedPoint = point shiftVertical 3.0
    println(verticalShiftedPoint) // Output: Point(x=3.0, y=7.0)
}
