package softserve.academy.edu1.hw3.taskHW3.model;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.birthYear = 1900;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge() {
        LocalDate ld = LocalDate.now();
        int currentYear = ld.getYear();
        return currentYear - birthYear;
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

    public void setBirthYear(int birthYear) {
        LocalDate ld = LocalDate.now();
        if (birthYear < 1900 || birthYear > ld.getYear()) {
            Scanner sc = new Scanner(System.in);
            while (birthYear < 1900 || birthYear > ld.getYear()) {
                System.out.print("Invalid birth year, try again: ");
                birthYear = sc.nextInt();
            }
        } else {
            this.birthYear = birthYear;
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        LocalDate ld = LocalDate.now();
        System.out.print("Enter person's first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter person's last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter person's year of birth: ");
        birthYear = sc.nextInt();
        while (birthYear < 1900 || birthYear > ld.getYear()) {
            System.out.print("Invalid birth year, try again: ");
            birthYear = sc.nextInt();
        }
    }

    public String output() {
        return String.format("%s %s born in %d", firstName, lastName, birthYear);
    }

    public void setName(String... args) {
        this.firstName = args[0];
        if (args.length > 1) {
            this.lastName = args[1];
        }
    }
}
