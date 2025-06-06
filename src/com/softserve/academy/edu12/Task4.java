package com.softserve.academy.edu12;

import javax.naming.Name;
import java.util.Scanner;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Getting names
        String FirstName = getValidName(sc, "first");
        String LastName = getValidName(sc, "second");
        String FullName = FirstName + " " + LastName;

        //Greeting templates
        String[] greetings = {
                "Hi, %s.",
                "What's up, %s.",
                "Hello there, %s."
        };
        //Pick a random greeting
        Random random = new Random();
        int index = random.nextInt(greetings.length);
        System.out.printf(greetings[index], FullName);

        sc.close();
    }
//Method to get the name
    private static String getValidName(Scanner sc, String type) {

        String name;
        while (true) {
            System.out.println("Enter your " + type + "name");
            name = sc.nextLine().trim();
            if (isValidName(name)) {
                break;
            }else{
                System.out.println("Input data is incorrect.");
            }
        }
        return name;
    }
    //Regex validation for names
    private static boolean isValidName(String name){
        return name.matches("^[A-Za-z\\s-]+$");
    }
}