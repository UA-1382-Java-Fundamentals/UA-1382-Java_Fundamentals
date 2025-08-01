package com.softserve.academy.homework5.practicalTask4;

public class Employee {
    private  String name;
    private  String department;
    private  int number;
    private  int salary;

    public Employee(String name, String department, int number, int salary) {
        this.name = name;
        this.department = department;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
                ", department='" + department + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                '}';
    }
}
