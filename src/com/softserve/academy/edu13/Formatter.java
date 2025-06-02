package com.softserve.academy.edu13;

public class Formatter {
    public static String format(String name) {
        return "Hello, " + name + "!";
    }
}

@FunctionalInterface
interface FormatterInterface {
    String greet(String name);
}

/**
 * Reference to a static method
 */
class FormatterDemo {
    public static void main(String[] args) {
        // Method reference
        FormatterInterface formatter1 = Formatter::format;
        System.out.println(formatter1.greet("John"));
        // Lambda expression
        FormatterInterface formatter2 = name -> Formatter.format(name);
        System.out.println(formatter2.greet("Bob"));
    }
}
