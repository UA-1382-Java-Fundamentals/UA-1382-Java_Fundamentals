package com.softserve.academy.edu3;


import java.time.Year;
import java.util.Scanner;

public class Person3 {

    private String firstName;
    private String secondName;
    private int birthYear;

    public Person3() {
        this.firstName = "";
        this.secondName = "";
        this.birthYear = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondNameName() {
        return secondName;
    }

    public void setSecondNameName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear() {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name ");
        this.firstName = sc.nextLine();

        System.out.println("Enter second name ");
        this.secondName = sc.nextLine();

        System.out.println("Enter birth year ");
        this.birthYear = sc.nextInt();
    }
public void output() {
    System.out.println("Name: " + firstName + " " + secondName);
    System.out.println("Birth Year: " + birthYear);
    System.out.println("Age: " + getAge());
}

    public void changeName(String fn, String In) {
        this.firstName = fn;
        this.secondName = In;
    }
}