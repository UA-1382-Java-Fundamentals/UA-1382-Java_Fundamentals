package com.softserve.academy.homework3.practicalTask2;

public class Task2 {
    public static void main(String[] args) {
        Employee John = new Employee(40, 8 , "John");
        System.out.println(John.toString());
        Employee Kevin = new Employee(120,12 , "Kevin");
        System.out.println(Kevin.toString());
        Employee Olivia = new Employee(80, 12, "Olivia");
        System.out.println(Olivia.toString());

        System.out.println(John.getName() + ": total salary =  " + John.getBonuses());
        System.out.println(Kevin.getName() + ": total salary =  " + Kevin.getBonuses());
        System.out.println(Olivia.getName() + ": total salary =  " + Olivia.getBonuses());
    }
}
