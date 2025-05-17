package com.softserve.academy.hw7_t1;

public abstract class Employee implements Payment {
    String employeeId;
    String employeeName;
    static int sumSalary;

    public String getEmployeeId() {
        return employeeId;
    }

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void sumSalary(int salaryOfOneEmployee) {
        sumSalary += salaryOfOneEmployee;
    }

    public static int calculateAverageSalary(int numberOfEmployees) {
        return sumSalary / numberOfEmployees;
    }

    public void printEmployees (int salary, String idType, String id) {
        System.out.println("Employee ID: " + employeeId + "; Employee name: " + employeeName + "; Salary: " + salary + "; " + idType + id);
    }
}
