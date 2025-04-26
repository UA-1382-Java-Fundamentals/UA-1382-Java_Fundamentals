package com.softserve.academy.edu03.homework.person;


import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstN, String lastN) {
        this.setFirstName(firstN);
        this.setLastName(lastN);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.matches("[a-zA-Zа-яА-ЯїґєіІЇЄҐ\\s-]+")) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Incorrect name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.matches("[a-zA-Zа-яА-ЯїґєіІЇЄҐ\\s-]+")) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Incorrect name");
        }
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear > 1910 && birthYear <= LocalDate.now().getYear()) {
            this.birthYear = birthYear;
        } else {
            throw new IllegalArgumentException("Incorrect year value");
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void input(Scanner scan) {
        System.out.println("Input the First Name: ");
        setFirstName(scan.nextLine());
        System.out.println("Input the Last Name: ");
        setLastName(scan.nextLine());
        System.out.println("Input the year of birth: ");
        setBirthYear(scan.nextInt());
        scan.nextLine();
    }

    @Override
    public String toString() {
        return "First name: " + firstName + '\n' +
                "Last name: " + lastName + '\n' +
                "Age: " + getAge();
    }

    public void output() {
        System.out.println(toString());
    }

    public void changeName(String fn, String ln) {
        this.setFirstName(fn);
        this.setLastName(ln);
    }

}
