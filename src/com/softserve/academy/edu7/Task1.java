package com.softserve.academy.edu7;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    interface Payment {
        double calculatePay();
    }

    public static abstract class Employee implements Payment {
        protected String employeeId;
        protected String name;

        public Employee(String employeeId, String name) {
            this.employeeId = employeeId;
            this.name = name;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }
    }

    public static class SalariedEmployee extends Employee {
        private String socialSecurityNumber;
        private double fixedMonthlyPayment;

        public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
            super(employeeId, name);
            this.socialSecurityNumber = socialSecurityNumber;
            this.fixedMonthlyPayment = fixedMonthlyPayment;
        }

        @Override
        public double calculatePay() {
            return fixedMonthlyPayment;
        }
    }

    public static class ContractEmployee extends Employee {
        private String federalTaxIdMember;
        private double hourlyRate;
        private int hoursWorked;

        public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
            super(employeeId, name);
            this.federalTaxIdMember = federalTaxIdMember;
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculatePay() {
            return hourlyRate * hoursWorked;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();


        employees.add(new

            SalariedEmployee("E1","Jason","SSN123456",5000));
        employees.add(new

            SalariedEmployee("E2","Colt","SSN654321",6000));
        employees.add(new

            ContractEmployee("C1","John","FT12345",50,120));
        employees.add(new

            ContractEmployee("C2","Karl","FT54321",40,160));

        employees.sort((e1,e2)->Double.compare(e2.calculatePay(),e1.calculatePay()));

        System.out.println("EmployeeID | Name           | Monthly Wage");
        for(
            Employee emp :employees)

            {
                String line = emp.getEmployeeId() + "         | " +
                        emp.getName() + " | $" +
                        String.format("%.2f", emp.calculatePay());
                System.out.println(line);
            }
        }
    }