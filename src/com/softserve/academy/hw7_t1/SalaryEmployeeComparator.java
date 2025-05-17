package com.softserve.academy.hw7_t1;

import java.util.Comparator;

public class SalaryEmployeeComparator implements Comparator<Object> {

    public int compare (Object obj1, Object obj2) {
        Employee employee1 = (Employee) obj1;
        Employee employee2 = (Employee) obj2;
        if (employee1.calculatePay() == employee2.calculatePay()) {
            return employee2.getEmployeeId().compareTo(employee1.getEmployeeId());
        }
        return Integer.compare(employee2.calculatePay(), employee1.calculatePay());
    }
}
