package cl.ravenhill.patients

/**
 * Represents a patient with a name, age, and email.
 *
 * ## Usage:
 * This class provides properties to store the patient's name, age, and email. It also includes a computed property to
 * check if the patient is an adult.
 *
 * ### Example 1: Creating a Patient and Checking if They Are an Adult
 * ```
 * val patient = Patient(name = "Robert Kirkman", age = 45)
 * println(patient.isAdult) // Output: true
 * ```
 *
 * ### Example 2: Setting a Valid Email for a Patient
 * ```
 * val patient = Patient(name = "Grant Morrison", age = 64)
 * patient.email = "grant.morrison@example.com"
 * println(patient.email) // Output: grant.morrison@example.com
 * ```
 *
 * ### Example 3: Setting an Invalid Email for a Patient
 * ```
 * val patient = Patient(name = "Alan Moore", age = 70)
 * patient.email = "alan.moore"
 * println(patient.email) // Output: (no change, remains an empty string)
 * ```
 *
 * @property name The name of the patient.
 * @property age The age of the patient.
 * @property isAdult A computed property that returns `true` if the patient is an adult (age >= 18), otherwise `false`.
 * @property email The email of the patient. The email is only set if it contains an "@" character.
 */
class Patient(val name: String, var age: Int) {
    /**
     * A computed property that returns `true` if the patient is an adult (age >= 18), otherwise `false`.
     */
    val isAdult: Boolean
        get() = age >= 18

    /**
     * The email of the patient. The email is only set if it contains an "@" character.
     */
    var email: String = ""
        set(value) {
            if ("@" in value) {
                field = value
            }
        }
}
