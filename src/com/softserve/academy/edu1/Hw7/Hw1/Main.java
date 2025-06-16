package com.softserve.academy.edu1.Hw7.Hw1;

public class Main {
    public static void main(String[] args) {
        ContractEmployee contractEmployee = new ContractEmployee("10","Ostap","7625364",300, 6);
        System.out.println(contractEmployee.calculatePay());
        SalariedEmployee salariedEmployee = new SalariedEmployee("3723", contractEmployee.calculatePay());
        System.out.println(salariedEmployee.calculatePay());

    }
}