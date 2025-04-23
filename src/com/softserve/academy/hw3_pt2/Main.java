/*
Create class called Employee that should consist of:
• three private fields: name, rate and hours;
• a static field called totalSum
• properties to access these fields;
• a default constructor and two constructors with parameters;

• Methods:
o getSalary() - to calculate the salary of an employee (formula rate * hours);
o toString() - to output information about the employee;
o getBonuses() – to calculate 10% from salary.

In the main() method create 3 objects of type Employee, input information about them.

Display the total salary of all employees to the console.
 */

package com.softserve.academy.hw3_pt2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Catrin", 10, 22);
        Employee employee3 = new Employee("Paco", 4, 80);

        Employee.setTotalSum(employee1.getSalary() + employee2.getSalary() + employee3.getSalary());

        Employee.toString(Employee.getTotalSum());
    }
}
