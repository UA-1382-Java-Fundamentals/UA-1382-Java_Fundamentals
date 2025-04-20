package com.softserve.academy.edu1.Introduction_To_OOP.Homework_3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

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

    public int getAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.printf("Name: %s %s, Birth Year: %d, Age: %d\n",
                firstName, lastName, birthYear, getAge());
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            this.firstName = fn;
        }
        if (ln != null && !ln.isEmpty()) {
            this.lastName = ln;
        }
    }

}
