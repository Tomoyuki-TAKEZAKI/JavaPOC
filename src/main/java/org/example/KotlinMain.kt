package org.example

import org.example.sample.PhoneNumber

fun main() {
    printPhoneNumber()
}

fun printPhoneNumber() {
    val phoneNumber = PhoneNumber("123-456-7890")
    println("Phone Number: ${phoneNumber.value}")
}
