package org.example

import org.example.email.EmailVerificationChecker
import org.example.email.UnverifiedEmailAddress

class EmailVerificationCheckerUsage {
    // In a real-world scenario, Dependency Injection container would be used.
    private val checker = EmailVerificationChecker()

    fun run() {
        val unverified = UnverifiedEmailAddress("alice@example.com")
        val verified = checker.checkVerified(unverified)

        verified.onSuccess { verified ->
            println("Verified Email Address: ${verified.value}")
        }.onFailure { error ->
            println("Error verifying email address: ${error.message}")
        }

        // This code does not compile because VerifiedEmailAddressImpl constructor is private
//        val verified2 = VerifiedEmailAddressImpl("bob@example.com")
    }
}

fun main() {
    val emailVerificationCheckerUsage = EmailVerificationCheckerUsage()
    emailVerificationCheckerUsage.run()
}
