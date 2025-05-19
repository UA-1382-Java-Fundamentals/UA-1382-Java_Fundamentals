package com.softserve.academy.hw7_t1;

public abstract class Employee implements Payment {
    protected String employeeId;
    protected String employeeName;
    private static int totalSalary;
    private static int employeeAmount;

    public String getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeAmount(int employeeAmount) {
        Employee.employeeAmount = employeeAmount;
    }

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void calculateTotalSalary() {
        totalSalary += calculatePay();
    }

    public static int calculateAverageSalary() {
        return totalSalary / employeeAmount;
    }

    public String toString() {
        return "Employee ID: " + employeeId + "; Employee name: " + employeeName + "; Salary: " + calculatePay();
    }
}
