package com.softserve.academy.edu1.Hw12.hw4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckFirstAndLastName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        while (true) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();

            if (firstName.matches("^[a-zA-Z\\-\\s]+$")) {
                break;
            } else {
                System.out.println("Invalid first name. Use only English letters, spaces, and hyphens.");
            }
        }

        while (true) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();

            if (lastName.matches("^[a-zA-Z\\-\\s]+$")) {
                break;
            } else {
                System.out.println("Invalid last name. Use only English letters, spaces, and hyphens.");
            }
        }
        String fullName = firstName + " " + lastName;
        String[] welcomeText = {
                "Hello, %s! Welcome!",
                "Nice to meet you, %s!",
                "Hi, %s! Have a nice day!",
                "Hey there, %s! Let's go to write java code)",
                "Hi, %s! Ready to learning java?"
        };

        Random random = new Random();
        int index = random.nextInt(welcomeText.length);
        System.out.printf(welcomeText[index] , fullName);
    }
}
