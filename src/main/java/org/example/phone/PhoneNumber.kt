package org.example.phone

@JvmInline
value class PhoneNumber(
    val value: String
) {
    // Add a factory method with @JvmStatic annotation
    companion object {
        @JvmStatic
        fun of(value: String): PhoneNumber = PhoneNumber(value)
    }
}
