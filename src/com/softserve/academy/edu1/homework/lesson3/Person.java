package com.softserve.academy.edu1.homework.lesson3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 0;
    }

    public int getAge() {
        return java.time.Year.now().getValue() - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName + ", Birth Year: " + birthYear + ", Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            firstName = fn;
        }
        if (ln != null && !ln.isEmpty()) {
            lastName = ln;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int personIndex = 0; personIndex < people.length; personIndex++) {
            System.out.println("\nInput information for person " + (personIndex + 1) + ":");
            people[personIndex] = new Person();
            people[personIndex].input();
        }

        System.out.println("\nInformation about all persons:");
        for (Person person : people) {
            person.output();
        }
    }
}
