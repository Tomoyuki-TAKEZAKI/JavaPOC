package org.example;

import org.example.phone.PhoneNumber;

public class JavaPhoneNumberPrinter {
    void run() {
        // This code still fails to compile.
        String phoneNumber = PhoneNumber.Companion.of("123-456-7890");
        System.out.println("Phone Number: " + phoneNumber);
    }
}
