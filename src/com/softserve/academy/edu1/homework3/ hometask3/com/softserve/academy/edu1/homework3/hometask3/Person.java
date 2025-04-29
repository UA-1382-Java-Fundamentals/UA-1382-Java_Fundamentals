package com.softserve.academy.edu1.homework3.hometask3;

public class  Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
       // this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }
    public void input() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a valid year: ");
            scanner.next();
        }
        this.birthYear = scanner.nextInt();
}
     public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
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

