package com.softserve.academy.edu3;

import edu3.Person;

public class Main3 {
    public static void main(String[] args) {
        Person3[] people = new Person3[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Input data about person number " + (i + 1));
            people[i] = new Person3();
            people[i].input();
            System.out.println();
        }
        System.out.println("Information about Person:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person number " + (i + 1));
            people[i].output();
            System.out.println();
        }
    }
}
