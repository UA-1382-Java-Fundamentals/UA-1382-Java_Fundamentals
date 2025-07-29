package com.softserve.academy.homework12.practicalTask2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        var firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        var lastName = scanner.nextLine();
        System.out.println("Enter your middle name");
        var middleName = scanner.nextLine();
        System.out.printf("%s %C. %C.%n", lastName, firstName.charAt(0), middleName.charAt(0));

        System.out.println(firstName);
        System.out.printf("%s %s %s",firstName,middleName,lastName);
    }
}
