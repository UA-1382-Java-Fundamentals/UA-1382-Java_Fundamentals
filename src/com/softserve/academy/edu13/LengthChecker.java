package com.softserve.academy.edu13;

@FunctionalInterface
public interface LengthChecker {
    int checkLength(String str);
}

class LengthCheckerDemo {
    public static void main(String[] args) {
        LengthChecker lengthChecker = str -> str.length();

        LengthChecker lengthChecker2 = String::length; // Method reference

        System.out.println("Length of 'Hello': " + lengthChecker.checkLength("Hello"));
        System.out.println("Length of 'World': " + lengthChecker2.checkLength("World"));
    }
}
