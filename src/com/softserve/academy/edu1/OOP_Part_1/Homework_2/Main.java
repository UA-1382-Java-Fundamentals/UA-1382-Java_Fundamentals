package com.softserve.academy.edu1.OOP_Part_1.Homework_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 40, 2500);
        Developer developer = new Developer("Alex", 30, 4500, "Senior");

        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
