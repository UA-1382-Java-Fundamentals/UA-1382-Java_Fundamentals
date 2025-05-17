package com.softserve.academy.hw7_t1;

public abstract class Employee implements Payment {
    protected String employeeId;
    protected String employeeName;
    protected static int sumSalary;

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

    public String toString() {
        return "Employee ID: " + employeeId + "; Employee name: " + employeeName + "; Salary: " + calculatePay();
    }
}
