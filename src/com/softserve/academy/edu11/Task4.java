package com.softserve.academy.edu11;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        String nameRegex = "^[A-Za-z\\-\\s]+$";//Pattern to allow only english letters, spaces and hyphens

        //Loop to repeatedly ask for the name
        while (true) {
            System.out.println("Enter your first name ");
            firstName = sc.nextLine().trim();

            if (firstName.matches(nameRegex)) {
                break;//Exiting the loop
            } else {
                System.out.println("Invalid input. Only english letters, spaces, and hyphens are allowed.");
            }
        }

        while (true) {
            System.out.println("Enter your last name ");
            lastName = sc.nextLine().trim();

            if (lastName.matches(nameRegex)) {
                break;
            } else {
                System.out.println("Invalid input. Only english letters, spaces, and hyphens are allowed.");
            }
        }
            String fullName = firstName + " " + lastName;

        //Array of greetings
            String[] greetings = {
                    "Hello, %s! Welcome aboard!",
                    "Nice to meet you, %s!",
                    "Greetings, %s! Hope you are doing great!",
                    "Hello there, %s!",
                    "Welcome, %s!"
            };
            //Pick a random greeting
            Random random = new Random();
            int index = random.nextInt(greetings.length);

            //Print the greeting with the full name
            System.out.printf(greetings[index] + "%n",  fullName);

            sc.close();
        }
    }