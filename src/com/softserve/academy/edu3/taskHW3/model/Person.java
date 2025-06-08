package softserve.academy.edu3.taskHW3.model;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    static final Scanner SCANNER = new Scanner(System.in);
    static final LocalDate LOCAL_DATE = LocalDate.now();

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
        return LOCAL_DATE.getYear() - birthYear;
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

    public void checkBirthYear(int birthYear) {
        if (birthYear < 1900 || birthYear > LOCAL_DATE.getYear()) {
            throw new IllegalArgumentException("Invalid birth year!");
        }
    }

    public static void checkEmptyLine(String line) {
        if (line.isEmpty()) {
            throw new IllegalArgumentException("Empty line! Enter a valid name!");
        }
    }

    public void setName(String... args) {
        this.firstName = args[0];
        if (args.length > 1) {
            this.lastName = args[1];
        }
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public static String inputFromConsole(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    public void inputNewData() {
        firstName = inputFromConsole("Enter person's first name: ");
        lastName = inputFromConsole("Enter person's last name: ");
        if (firstName.isEmpty() || lastName.isEmpty()) {
            throw new IllegalArgumentException("Person's name cannot be empty!");
        }
        try {
            birthYear = Integer.parseInt(inputFromConsole("Enter person's birth year: "));
            checkBirthYear(birthYear);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Year must be an integer!");
        }
    }

    public String output() {
        return String.format("%s %s born in %d", firstName, lastName, birthYear);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + birthYear + ")";
    }
}
