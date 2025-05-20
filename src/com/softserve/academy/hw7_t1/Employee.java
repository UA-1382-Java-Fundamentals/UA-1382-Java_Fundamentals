package com.softserve.academy.hw7_t1;

public abstract class Employee implements Payment {
    protected String employeeId;
    protected String employeeName;

    public String getEmployeeId() {
        return employeeId;
    }

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public String toString() {
        return "Employee ID: " + employeeId + "; Employee name: " + employeeName + "; Salary: " + calculatePay();
    }
}
