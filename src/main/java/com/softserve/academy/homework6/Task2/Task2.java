package com.softserve.academy.homework6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Taras", 29,25000);
        Developer developer = new Developer("Petro", 33,40000, "Trainee");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
