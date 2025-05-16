/*
Suppose we have a class Employee.
Create a class called Developer that extends the Employee class. Define a String field
and a constructor to initialize all fields in the Developer class.
• In the Developer class, override the report() method to return a string with information
about the developer, for example:
Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
• If necessary, modify the Employee class to adhere to the principles of encapsulation and
inheritance.
• In main() method create an instance of both the Employee and Developer classes and
print information about them in the console using report() method.
 */

package com.softserve.academy.hw6_t2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vlad", 24, 1500);
        Developer employee2 = new Developer("Taras", 23, 1000, "Average Java developer");

        System.out.println(employee1.report());
        System.out.println(employee2.report());
    }
}
