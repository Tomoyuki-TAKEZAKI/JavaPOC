package org.example.email

sealed interface EmailAddress {
    val value: String
}

sealed interface VerifiedEmailAddress : EmailAddress

private const val MAIL_ADDRESS_REGEX = "^.+@.+$"

@JvmInline
value class UnverifiedEmailAddress(
    override val value: String,
) : EmailAddress {
    init {
        require(Regex(MAIL_ADDRESS_REGEX).matches(value))
    }
}
