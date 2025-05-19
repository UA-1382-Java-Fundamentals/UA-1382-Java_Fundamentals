package com.softserve.academy.hw7_t1;

import java.util.Comparator;

public class SalaryEmployeeComparator implements Comparator<Employee> {

    public int compare (Employee obj1, Employee obj2) {
        if (obj1.calculatePay() == (obj2.calculatePay())) {
            return (obj2.getEmployeeId().compareTo(obj1.getEmployeeId()));
        }
        return Integer.compare(obj2.calculatePay(), obj1.calculatePay());
    }
}
