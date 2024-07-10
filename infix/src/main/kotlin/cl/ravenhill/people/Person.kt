package cl.ravenhill.people

/**
 * Represents a person with a name and a list of friends.
 *
 * ## Usage:
 * This data class represents a person with a name and provides a way to manage their friends. Friends can be added
 * using the `makeFriend` infix function.
 *
 * ### Example 1: Creating a Person and Making Friends
 * ```
 * val deku = Person("Deku")
 * val bakugo = Person("Bakugo")
 * deku makeFriend bakugo
 * println(deku.friends) // Output: [Person(name=Bakugo)]
 * println(bakugo.friends) // Output: [Person(name=Deku)]
 * ```
 *
 * @property name The name of the person.
 * @property friends A read-only list of the person's friends.
 * @method makeFriend Makes another person a friend of this person.
 */
data class Person(val name: String) {
    private val _friends = mutableListOf<Person>()

    /**
     * A read-only list of the person's friends.
     */
    val friends: List<Person>
        get() = _friends

    /**
     * Makes another person a friend of this person.
     *
     * ## Usage:
     * This infix function adds the specified person to the list of friends and reciprocates the friendship.
     *
     * ### Example 1: Making Friends
     * ```
     * val deku = Person("Deku")
     * val bakugo = Person("Bakugo")
     * deku makeFriend bakugo
     * println(deku.friends) // Output: [Person(name=Bakugo)]
     * println(bakugo.friends) // Output: [Person(name=Deku)]
     * ```
     *
     * @param other The person to be made a friend.
     */
    infix fun makeFriend(other: Person) {
        _friends += other
        other._friends += this
    }
}
