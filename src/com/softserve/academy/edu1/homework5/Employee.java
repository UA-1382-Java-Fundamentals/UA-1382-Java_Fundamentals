package com.softserve.academy.edu1.homework5;

//Create a class called Employee with fields: name, department number, salary.
//In main() method create five objects of class Employee.
//Output results for:
//all employees of a certain department (input department number in the console);
//arrange workers by the field salary in descending order.


import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }


    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 2, 3000),
                new Employee("Mary", 1, 2500),
                new Employee("Bob", 3, 1800),
                new Employee("Alice", 2, 3200),
                new Employee("Art", 3, 5000)
        };

        Scanner scanner = new Scanner(System.in);

    }
}
