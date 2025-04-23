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
        Person human1 = new Person();

        human1.setFirstName(human1.input("Input first name:"));
        human1.setLastName(human1.input("Input last name:"));
        human1.setBirthYear(Integer.parseInt(human1.input("Input birthday year:")));

        human1.output("First name: ", human1.getFirstName());
        human1.output("Last name: ", human1.getLastName());
        human1.output("Birthday year: ", human1.getBirthYear());
        human1.output("Age is ", human1.getAge());

        Person human2 = new Person();

        human2.setFirstName(human2.input("Input first name:"));
        human2.setLastName(human2.input("Input last name:"));
        human2.setBirthYear(Integer.parseInt(human2.input("Input birthday year:")));

        human2.output("First name: ", human2.getFirstName());
        human2.output("Last name: ", human2.getLastName());
        human2.output("Birthday year: ", human2.getBirthYear());
        human2.output("Age is ", human2.getAge());

    }
}
