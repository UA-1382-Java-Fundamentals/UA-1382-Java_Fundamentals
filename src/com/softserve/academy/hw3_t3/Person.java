package com.softserve.academy.hw3_t3;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private static String firstName;
    private static String lastName;
    private static int birthYear;

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Person.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public static int getBirthYear() {
        return birthYear;
    }

    public static void setBirthYear(int birthYear) {
        Person.birthYear = birthYear;
    }

    Person() {

    }

    Person(String firstName, String lastName) {
        Person.firstName = firstName;
        Person.lastName = lastName;
    }

    public static int getAge() {
        return Integer.parseInt(String.valueOf(Year.now())) - Integer.parseInt(String.valueOf(birthYear));
    }

    public static String input(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static void output(String text, String value) {
        System.out.println(text + value);
    }

    static void output(String text, int value) {
        System.out.println(text + value);
    }

    public static void getPersonFromConsole() {
        Person.setFirstName(Person.input("Input first name:"));
        Person.setLastName(Person.input("Input last name:"));
        Person.setBirthYear(Integer.parseInt(Person.input("Input birthday year:")));

        Person.output("First name: ", Person.getFirstName());
        Person.output("Last name: ", Person.getLastName());
        Person.output("Birthday year: ", Person.getBirthYear());
        Person.output("Age is ", Person.getAge());
    }
}
