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
 */

package com.softserve.academy.hw7_t1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new ContractEmployee("15", 140, 100, "001"),
            new SalariedEmployee("81", 1500, "0123")
        };

        for (Employee emp : employees) {
            emp.calculatePay();
            if (emp instanceof ContractEmployee) {
                emp.printEmployees(emp.calculatePay(), "Federal Tax ID: ", ((ContractEmployee) emp).getFederalTaxId());
            }
            if (emp instanceof SalariedEmployee) {
                emp.printEmployees(emp.calculatePay(), "Social Security Number: ", ((SalariedEmployee) emp).getSocialSecurityNumber());
            }
        }
    }
}
