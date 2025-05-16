package com.softserve.academy.edu1.String_Regular_expressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        Pattern pattern = Pattern.compile("^[A-Za-z\\-\\s]+$");

        while (true) {
            System.out.println("Enter your first and last name:");
            name = scanner.nextLine();
            if (pattern.matcher(name).matches()) break;
            System.out.println("Invalid input. Try again.");
        }

        String[] greetings = {
                "Hello, %s! Welcome!",
                "Nice to meet you, %s!",
                "Greetings, %s! Have a great day!",
                "Howdy, %s!",
                "Hi, %s! Let's get started."
        };

        int random = (int)(Math.random() * greetings.length);
        System.out.printf(greetings[random], name);
    }
}