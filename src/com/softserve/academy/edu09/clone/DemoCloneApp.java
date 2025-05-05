package com.softserve.academy.edu09.clone;

public class DemoCloneApp {

    public static void main(String[] args) {
        // Create a new Person object with a FullName and age
        Person person = new Person(new FullName("Bob", "Brown"), 30);

        // Clone the Person object to create a deep copy
        Person copyOfPerson = person.clone();

        System.out.println("Original: " + person);
        System.out.println("Copy: " + copyOfPerson);

        System.out.println("*".repeat(50));

        // Modify the cloned object's properties
        copyOfPerson.setFullName(new FullName("Jane", "Smith"));
        copyOfPerson.setAge(25);

        System.out.println("After modification:");

        System.out.println("Original: " + person);
        System.out.println("Copy: " + copyOfPerson);
    }
}
