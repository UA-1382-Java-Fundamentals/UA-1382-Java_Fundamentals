package com.softserve.academy.edu1.Hw7.Hw1;

public class ContractEmployee extends Employee {

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
      return getHourlyRate()*getHoursWorked();
   }


   public int getHoursWorked() {
      return hoursWorked;
   }

   public double getHourlyRate() {
      return hourlyRate;
   }

   public String getFederalTaxIdMember() {
      return federalTaxIdMember;
   }
}
