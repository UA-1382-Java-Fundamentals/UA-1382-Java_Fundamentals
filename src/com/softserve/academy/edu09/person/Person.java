package com.softserve.academy.edu09.person;

/**
 * Person class demonstrates the use of private inner classes.
 * This class represents a person with a full name and age.
 */
public class Person {

    private FullName fullName = new FullName();
    private int age;

    /**
     * Constructor for creating a Person object.
     *
     * @param firsName The first name of the person
     * @param lastName The last name of the person
     * @param age      The age of the person
     */
    public Person(String firsName, String lastName, int age) {
        fullName.firstName = firsName;
        fullName.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return fullName.toString();
    }

    public int getAge() {
        return age;
    }

    /**
     * Private inner class representing a person's full name.
     * This class is only accessible within the Person class, demonstrating encapsulation.
     */
    private class FullName {

        String firstName;
        String lastName;

        @Override
        public String toString() {
            return "FullName{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
