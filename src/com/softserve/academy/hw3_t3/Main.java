/*
Write Java console application with method to find the smallest number among three integer numbers. Example of
output:

Input of the first number: 18.0
Input of the second number: 32.0
Input the third number: 54.0
The smallest number is 18.0
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
