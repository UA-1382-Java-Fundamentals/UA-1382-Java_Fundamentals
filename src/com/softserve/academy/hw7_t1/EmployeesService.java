package com.softserve.academy.hw7_t1;

public class EmployeesService {
    private final Employee[] employees;

    public EmployeesService(Employee[] employees) {
        this.employees = employees;
    }

    public double getAverageSalary() {
        int total = 0;
        for (Employee e: employees) {
            total += e.calculatePay();
        }
        return (double) total/employees.length;
    }
}
