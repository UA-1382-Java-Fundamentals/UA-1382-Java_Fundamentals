package com.softserve.academy.edu1.Hw6.Hw2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Pavlo", 20, 20000.72);//цей клас можна зробити abstract, але потрібно закоментувати цю стрічку*
        Developer taras = new Developer("Taras", 19, 21234.56);
        System.out.println(employee.report());
        System.out.println(taras.report());
    }
}
