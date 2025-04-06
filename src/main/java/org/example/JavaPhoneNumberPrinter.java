package org.example;

import org.example.phone.PhoneNumber;

public class JavaPhoneNumberPrinter {
    void run() {
        var phoneNumber = new PhoneNumber("123-456-7890");
        System.out.println("Phone Number: " + phoneNumber.getValue());
    }
}
