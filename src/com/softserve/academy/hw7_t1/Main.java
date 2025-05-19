/*
Create an interface called Payment with the method calculatePay(), the base abstract
class called Employee with a String variable employeeld.

o Create two classes, SalariedEmployee and ContractEmployee, which implement
Payment interface and inherit from the base class Employee.
    • Describe hourly-paid workers in the relevant classes (one of the child classes), and
fixed paid workers in the other.
    • Describe the String variable socialSecurityNumber in the SalariedEmployee class .
    • Include a description of federalTaxIdmember variable in the ContractEmployee
class.
    • In main() method create an array of employees and add the employees with
different form of payment.
    • Arrange the entire sequence of workers in descending order of the average
monthly wage. Output the employee ID, name, and the average monthly wage for
all elements of the list.
 */

package com.softserve.academy.hw7_t1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new ContractEmployee("15", "Dan", 140, 100, "001"),
            new SalariedEmployee("81", "Nick", 1500, "123"),
            new ContractEmployee("76", "Aneela", 1500, 51, "026"),
            new SalariedEmployee("1", "Andie", 80, "179")
        };

        Arrays.sort(employees, new SalaryEmployeeComparator());

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        EmployeesService employeesService = new EmployeesService(employees);
        System.out.println("Average salary: " + employeesService.getAverageSalary());
    }
}
