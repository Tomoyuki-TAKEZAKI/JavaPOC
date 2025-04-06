package org.example

import org.example.sample.PhoneNumber

class KotlinPhoneNumberPrinter {
    fun run() {
        // This code compiles!
        val phoneNumber = PhoneNumber("123-456-7890")
        println("Phone Number: ${phoneNumber.value}")
    }
}
