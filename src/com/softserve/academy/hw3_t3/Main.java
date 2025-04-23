/*
Create Console Application and add class called Person to the project. Class Person should consist of:
• three private fields: firstName, lastName and birthYear (the birthday year);
• properties for access to these fields;
• default constructor and constructor with 2 parameters (first and last names);

• Methods:
• (**) getAge() - to calculate the age of a person;
• input() - to input information about the person;
• output() - to output information about the person;
• changeName(String fn, String ln) - to change the first name or/and last name.

In the main() method create 5 objects of Person type and input information about them to console.
 */

package com.softserve.academy.hw3_t3;

public class Main {
    public static void main(String[] args) {
        Person.getPersonFromConsole();
        Person.getPersonFromConsole();
    }
}
