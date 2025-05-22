package com.softserve.academy.edu1.Functional_interfaces;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String encrypted = CaesarCipher.encrypt("abcXYZ", 3);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + CaesarCipher.decrypt(encrypted, 3));

        System.out.println("Valid date? " + DateValidator.isValidDate("05.22.25"));

        System.out.println("Leap year 2024? " + LeapYearChecker.isLeap(2024));

        LocalDate birthday = LocalDate.of(1999, 1, 15);
        BirthdayDays.printWeekdays(birthday);
    }
}