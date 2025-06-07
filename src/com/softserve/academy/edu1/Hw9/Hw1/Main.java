package com.softserve.academy.edu1.Hw9.Hw1;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Oleh", "Vlas");

        Person person = new Person(fullName, 19) {
            @Override
            public String activity() {
                return "No working";
            }
        };

        System.out.println(person.info());
        System.out.println("Activity: " + person.activity());
    }
}


