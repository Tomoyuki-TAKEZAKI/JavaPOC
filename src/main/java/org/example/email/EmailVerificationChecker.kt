package org.example.email

import kotlin.random.Random

class EmailVerificationChecker {

    fun checkVerified(
        unverifiedEmailAddress: UnverifiedEmailAddress
    ): Result<VerifiedEmailAddress> {
        // In a real-world scenario, this would involve checking if the verification link was clicked.
        val isVerified = Random.nextBoolean()
        return if (isVerified) {
            Result.success(VerifiedEmailAddressImpl(unverifiedEmailAddress.value))
        } else {
            Result.failure(IllegalStateException("This mail address is not verified yet."))
        }
    }

    @JvmInline
    private value class VerifiedEmailAddressImpl(
        override val value: String,
    ) : VerifiedEmailAddress
}
