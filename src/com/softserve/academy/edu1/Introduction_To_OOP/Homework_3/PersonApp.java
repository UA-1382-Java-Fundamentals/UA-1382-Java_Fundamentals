package com.softserve.academy.edu1.Introduction_To_OOP.Homework_3;

public class PersonApp {
    public static void main(String[] args) {

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            System.out.printf("\n Person #%d \n", i + 1);
            people[i] = new Person();
            people[i].input();
        }


        System.out.println("\n Persons Data ");
        for (Person p : people) {
            p.output();
        }
    }

}