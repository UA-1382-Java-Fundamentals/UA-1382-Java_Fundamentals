package task3;

import java.util.Scanner;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person () {

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
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }

    public void input(Scanner scanner) {
        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }
    public void output() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Birth year: " + this.birthYear);
        System.out.println("Age: " + getAge());
    }
    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        System.out.println("Enter data for person 1: ");
        person1.input(scanner);
        person1.changeName("Artemii", "Kostariev");
        person1.output();
        System.out.println("Enter data for person 2: ");
        person2.input(scanner);
        person2.output();
        System.out.println("Enter data for person 3: ");
        person3.input(scanner);
        person3.output();
        System.out.println("Enter data for person 4: ");
        person4.input(scanner);
        person4.output();
        System.out.println("Enter data for person 5: ");
        person5.input(scanner);
        person5.output();
        scanner.close();
    }
}
