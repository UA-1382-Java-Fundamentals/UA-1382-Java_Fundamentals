package com.softserve.academy.edu6;

public class Main2 {
    public static void main(String[] args) {
        //Create instance of employee2
        Employee2 employee2 = new Employee2("Maksym", 28, 25555.30);
        //Create instance of developer2
        Developer2 developer2 = new Developer2("Taras", 32, 32735.35, "Average Java Developer");

        System.out.println(employee2.report());
        System.out.println(developer2.report());
    }
}
