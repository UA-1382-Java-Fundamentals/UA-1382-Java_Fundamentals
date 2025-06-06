package com.softserve.academy.edu9;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Bob", "Peterson");
        Person student = new Student(fullName, 12);

        System.out.println(student.info());
        System.out.println("Activity: " + student.activity());
    }
}
