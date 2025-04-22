package com.softserve.academy.edu1.homework3.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        firstName = "No";
        lastName = "One";
        birthYear = 0;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter your birth year: ");
        birthYear = sc.nextInt();
        if (birthYear > LocalDate.now().getYear()) {
            System.out.println("Please provide a valid birth year");
            return;
        }
        sc.close();
    }

    public String output(){
        return "Name: " + firstName + "\nSurname: " + lastName + "\nBirth year: " + birthYear;
    }
}
