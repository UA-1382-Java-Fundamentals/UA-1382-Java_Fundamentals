package com.softserve.academy.hw3_t3;

import java.time.Year;
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

    Person() {

    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return Integer.parseInt(String.valueOf(Year.now())) - Integer.parseInt(String.valueOf(birthYear));
    }

    public String input(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    void output(String text, String value) {
        System.out.println(text + value);
    }

    void output(String text, int value) {
        System.out.println(text + value);
    }
}
