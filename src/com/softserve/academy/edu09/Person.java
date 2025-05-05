package com.softserve.academy.edu09;

public class Person {
    private final int age;

    public Person(int age) {
        this.age = age;
    }

    /**
     * Non-static inner class representing a person's full name.
     * This class has access to the outer class's private fields.
     */
    public class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /**
         * Prints the full name and age of the person.
         * Demonstrates how inner classes can access outer class's private fields.
         */
        public void printInfo() {
            System.out.println(firstName + " " + lastName + ", " + age);
        }
    }
}
