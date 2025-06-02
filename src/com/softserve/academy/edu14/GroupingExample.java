package com.softserve.academy.edu14;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class demonstrates practical examples of grouping and partitioning operations
 * using Java Streams. These operations are commonly used in real-world applications
 * for data analysis and transformation.
 */
public class GroupingExample {
    public static void main(String[] args) {
        // Create a list of employees for our examples
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 75000, 3),
                new Employee("Bob", "Sales", 65000, 5),
                new Employee("Charlie", "Engineering", 85000, 2),
                new Employee("Diana", "Marketing", 70000, 4),
                new Employee("Eve", "Sales", 90000, 7),
                new Employee("Frank", "Engineering", 95000, 6),
                new Employee("Grace", "Marketing", 68000, 2)
        );
        
        System.out.println("Original employee list:");
        employees.forEach(System.out::println);
        
        // Example 1: Basic grouping by department
        System.out.println("\nExample 1: Employees grouped by department");
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        
        employeesByDepartment.forEach((department, empList) -> {
            System.out.println("\nDepartment: " + department);
            empList.forEach(emp -> System.out.println("  " + emp.getName()));
        });
        
        // Example 2: Counting employees in each department
        System.out.println("\nExample 2: Count of employees by department");
        Map<String, Long> employeeCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        
        employeeCountByDepartment.forEach((department, count) -> 
                System.out.println(department + ": " + count + " employees"));
        
        // Example 3: Finding average salary by department
        System.out.println("\nExample 3: Average salary by department");
        Map<String, Double> avgSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        
        avgSalaryByDepartment.forEach((department, avgSalary) -> 
                System.out.println(department + ": $" + String.format("%.2f", avgSalary)));
        
        // Example 4: Partitioning employees by experience (senior vs junior)
        System.out.println("\nExample 4: Partitioning employees by experience");
        Map<Boolean, List<Employee>> employeesByExperience = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getYearsOfExperience() > 4));
        
        System.out.println("\nSenior employees (>4 years):");
        employeesByExperience.get(true).forEach(emp -> 
                System.out.println("  " + emp.getName() + " (" + emp.getYearsOfExperience() + " years)"));
        
        System.out.println("\nJunior employees (<=4 years):");
        employeesByExperience.get(false).forEach(emp -> 
                System.out.println("  " + emp.getName() + " (" + emp.getYearsOfExperience() + " years)"));
        
        // Example 5: Complex grouping - Department, then by experience level
        System.out.println("\nExample 5: Employees by department and experience level");
        Map<String, Map<String, List<Employee>>> employeesByDeptAndExp = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.groupingBy(emp -> {
                            if (emp.getYearsOfExperience() > 5) return "Senior";
                            else if (emp.getYearsOfExperience() > 2) return "Mid-level";
                            else return "Junior";
                        })
                ));
        
        employeesByDeptAndExp.forEach((department, expMap) -> {
            System.out.println("\nDepartment: " + department);
            expMap.forEach((expLevel, empList) -> {
                System.out.println("  " + expLevel + ":");
                empList.forEach(emp -> 
                        System.out.println("    " + emp.getName() + " (" + emp.getYearsOfExperience() + " years)"));
            });
        });
        
        // Example 6: Finding highest paid employee in each department
        System.out.println("\nExample 6: Highest paid employee by department");
        Map<String, Optional<Employee>> highestPaidByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));
        
        highestPaidByDept.forEach((department, empOpt) -> 
                empOpt.ifPresent(emp -> System.out.println(department + ": " + 
                        emp.getName() + " ($" + emp.getSalary() + ")")));
    }
    
    // Employee class for our examples
    static class Employee {
        private String name;
        private String department;
        private double salary;
        private int yearsOfExperience;
        
        public Employee(String name, String department, double salary, int yearsOfExperience) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.yearsOfExperience = yearsOfExperience;
        }
        
        public String getName() {
            return name;
        }
        
        public String getDepartment() {
            return department;
        }
        
        public double getSalary() {
            return salary;
        }
        
        public int getYearsOfExperience() {
            return yearsOfExperience;
        }
        
        @Override
        public String toString() {
            return name + " (" + department + ", $" + salary + ", " + yearsOfExperience + " years)";
        }
    }
}