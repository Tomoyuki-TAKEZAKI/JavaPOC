package org.example;

public class Main {
    public static void main(String[] args) {
//        runJavaPhoneNumberPrinter();
        runKotlinPhoneNumberPrinter();
    }

    public static void runJavaPhoneNumberPrinter() {
        var printer = new JavaPhoneNumberPrinter();
        printer.run();
    }

    public static void runKotlinPhoneNumberPrinter() {
        var printer = new KotlinPhoneNumberPrinter();
        printer.run();
    }
}
